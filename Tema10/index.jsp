<%--
  Created by IntelliJ IDEA.
  User: julia
  Date: 05/02/2019
  Time: 9:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Hola que ase</title>
    <%
     //   for ( int i = 1; i <= 6; i++){
      //  out.println("<h" + i + ">Cabezera " + i + "</h" + i + ">");
     //   }
      String frase = "<br>Texto dede JSP<br>";
      out.println(frase);
     out.println("palabra");
     int x = (int)(Math.random()*69);
     out.print("<p>" + x + "<br>");
     for (int i = 0; i<x; i++){
       for (int j = 1; j <=(i+1); j++){
         out.print("*");
       }
       out.print("<br>");
     }
    %>
  </head>
  <body>
  <form method="POST" action="calculo.jsp">
   nombre  <input type="text" name="Nombre" values="" /><br>
   edad   <input type="text" name="Edad" value="" /> <br>
      <input type="submit" name="Enviar para procesar" />
  </form>
  <h1>Quiere 50€ ? o khjno <%= x+x %></h1>
  </body>
</html>
