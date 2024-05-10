<%-- 
    Document   : error
    Created on : Apr 8, 2024, 10:34:49 AM
    Author     : Aasim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="exception" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%!
            int a = 56;
            int b = 2;
            String str = "Aasim";
         %> 
         <%
             int div = a/b;
             out.print("Division result is : "+div);
             out.print("<br>");
             //out.print(str.UpperCase());
             %>
             <%@page isErrorPage="true" %>
    </body>
</html>
