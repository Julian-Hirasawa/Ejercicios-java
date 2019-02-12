<%--
  Created by IntelliJ IDEA.
  User: julia
  Date: 06/02/2019
  Time: 13:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>Los valores que me han llegado son: <br></p>
<%
    String nombreRrecibida = request.getParameter("Nombre");
    int edadRecibida = Integer.parseInt(request.getParameter("Edad"));
    out.print("<h2>" +  nombreRrecibida + "<h2><br>");
    out.print(edadRecibida);
%>
</body>
</html>
