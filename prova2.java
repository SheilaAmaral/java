<%
  String email = request.getParameter("email");
  String nome = request.getParameter("nome");
  
  if(email.indexOf("@") == -1 || nome.equals(""))
    out.println("Dados incorretos");
%>