<%-- 
    Document   : ProductRegistered
    Created on : 23/06/2009, 01:28:15
    Author     : Tata
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="javax.jdo.PersistenceManager" %>
<%@page import="com.kiloan.factory.*" %>
<%@page import="com.kiloan.item.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product Registered</title>
    </head>
    <body>
        <h1>Product Registered</h1>
        <%
        PersistenceManager pm = PMF.get().getPersistenceManager();
        String query = "select from " + Product.class.getName();
        List<Product> products = (List<Product>) pm.newQuery(query).execute();
        if(products.isEmpty()){
%>
<p>Nothing inside!</p>
<%
}
        else{
            out.print("<h2>Available Products</h2>");
            for(Product p : products){
                out.print("<br />Product ID: " + p.getId());
                out.print("<br />Product Name: " + p.getName());
                out.print("<br />Product Price: " + p.getDescription());
                out.print("<br />");
                }
            }
        pm.close();
%>
<p><a href="/ProductRegistration">Add more product</a></p>
    </body>
</html>
