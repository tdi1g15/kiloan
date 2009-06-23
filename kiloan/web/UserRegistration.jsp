<%-- 
    Document   : UserRegistration
    Created on : 21/06/2009, 03:11:54
    Author     : Tata
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Registration</title>
    </head>
    <body>
        <h1>User Registration</h1>
        <form action="UserRegistered" method="post">
            <p>First Name: <input type="text" name="firstName" /></p>
            <p>Last Name: <input type="text"/></p>
            <p>Birth Date: <input type="text"/></p>
            <p><input type="submit" title="Submit" value="Register User" /></p>
        </form>
    </body>
</html>
