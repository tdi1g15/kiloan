<%-- 
    Document   : UserRegistered
    Created on : 21/06/2009, 22:32:29
    Author     : Tata
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello <% out.print(request.getParameter("firstName")); %> </h1>
    </body>
</html>
