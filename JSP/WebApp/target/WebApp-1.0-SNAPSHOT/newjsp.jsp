<%-- 
    Document   : newjsp
    Created on : Apr 9, 2024, 11:40:27 AM
    Author     : Aasim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            String name = request.getParameter("Username");
            out.print("Welcome "+name);
            session.setAttribute("Username",name);
            %>
            <br>
    </body>
</html>
