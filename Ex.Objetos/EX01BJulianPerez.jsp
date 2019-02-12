<%--
  Created by IntelliJ IDEA.
  User: julia
  Date: 12/02/2019
  Time: 11:02
  To change this template use File | Settings | File Templates.
  /*
 Hecho por Julián Pérez Ortiz 1º daw
  */
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Exercices 01 B Julian Perez</title>
</head>
<body>
<%
    int pintar = Integer.parseInt(request.getParameter("resaltar"));
    int numerosFila = Integer.parseInt(request.getParameter("nFilas"));
    int pintarHasta = Integer.parseInt(request.getParameter("pintar"));
    int pintando = 1;
    int numeros = pintarHasta / numerosFila;
    int aux1;
    boolean pintraColor = false;
   out.print("<table border='1'>");
    for ( int x = 0; x < numeros;x++){
   out.print("<tr>");
    for ( int i = 0; i < numerosFila; i++){
      aux1 = pintando;

      while(aux1 >= 1){
        int total = aux1 % 10;

        if(total == pintar){
          pintraColor = true;
        }
        aux1 /= 10;
      }
      if(!pintraColor){
          out.print("<td>" + pintando + "</td>");

      }
     if (pintraColor){
       out.print("<td bgcolor='red'>" + pintando + "</td>");
       pintraColor = false;
     }
     pintando++;
    }
  out.print("</tr>");
    }
    out.print("</table>");
%>
</body>
</html>
