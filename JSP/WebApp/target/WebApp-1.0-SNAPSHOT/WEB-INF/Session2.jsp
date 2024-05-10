<%-- 
    Document   : Session2
    Created on : Apr 9, 2024, 11:22:58 AM
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
        <h1>Second page</h1>
        <%
            String name = (String)session.getAttribute("Username");
            out.print("Hello,how are you ? "+name);
            %>
    </body>
</html>
