<jsp:usebean id="n" class="numero" scope="session" />
<%
  n.setA(Float.parseFloat(request.getParameter("A")));
  n.setB(Float.parseFloat(request.getParameter("B")));
  n.setC(Float.parseFloat(request.getParameter("C")));
  out.println(n.Soma());
%>


