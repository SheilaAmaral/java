<%
String s = request.getParameter("tx_nome");
Class.forName("Driver");
Connection c = DriverManager("url","user","pass");
Statement stm = c.createStatement();
Resultset rs = stm.executeQuery("Select * from Pessoa Qhere nome like '%" + s + "%'");
while(rs.Next())
{
  out.println(rs.getString("nome"));
  out.println(rs.getString("endereço"));
  out.println(rs.getString("idade"));
  out.println(rs.getString("sexo"));
}

stm.Close();
rs.Close();
%>
