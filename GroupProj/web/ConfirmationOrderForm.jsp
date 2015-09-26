<%-- 
    Document   : ConfirmationOrderForm
    Created on : Apr 29, 2015, 5:37:56 PM
    Author     : erikmikac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirmation Order Form</title>
    </head>
    <body>
    <center>
        <h1>Congratulations! Thank you for ordering a car from us.</h1>
        <h2> Here is the exact car you purchased...</h2>
        
        
        ${car.getDescription()}
        <br>
      The Price is  $ ${ car.getCost() }0!
    </center>
    </body>
</html>
