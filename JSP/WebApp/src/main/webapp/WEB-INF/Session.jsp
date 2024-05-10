<%-- 
    Document   : Session
    Created on : Apr 9, 2024, 11:22:24 AM
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
            <a href="Session2.jsp">Redirect toward another page!</a>
    </body>
</html>
