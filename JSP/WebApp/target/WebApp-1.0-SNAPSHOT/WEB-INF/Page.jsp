<%-- 
    Document   : Page
    Created on : Apr 8, 2024, 10:11:08 AM
    Author     : Aasim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Random, java.util.ArrayList,java.io.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Page Directive</h1>
        <h2>Random Number : </h2>
        <%
            Random r = new Random();
            int n = r.nextInt(100);
            out.print(n);
            out.print("<br>");
        %>   
        <%= "My Random number is : "+ n %>
    </body>
</html>
