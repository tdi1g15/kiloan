<%-- 
    Document   : ProductRegistration
    Created on : 23/06/2009, 00:51:16
    Author     : Tata
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product Registration</title>
    </head>
    <body>
        <h1>Product Registration</h1>
        <form action="ProductRegistered" method="post">
            <p>
                Product Id: <input type="text" name="productId" value=""/><br/>
                Product name: <input type="text" name="productName" value="" value=""/><br/>
                Product description: <input type="text" name="productDescription" value=""/><br/>
                Price: <input type="text" name="productPrice" value="0"/><br/>
                Picture: <input type="text" name="productPicture" value="Picture URI"/><br/>
                <input type="submit" value ="Registering Product" />
            </p>
        </form>
    </body>
</html>
