<%-- 
    Document   : MainPage
    Created on : Apr 26, 2015, 12:08:17 PM
    Author     : erikmikac
--%>
<%@page import = "java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <center>
        <h1>Welcome to Mercedes Benz!</h1>
        <p> Here at Mercedes, we are dedicated to selling you luxury vehicles at 
            an affordable cost!</p>
        
    
 
               
            <form action="Login" >
        <table border="1">
            
                <tr>
                    <td>UserName</td>
                    <td><input type="text" name="Username" value="" size="50" /></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="Password" value="" size="50" /></td>
                </tr>
            </tbody>
        </table>
        
        <input type="submit" value="submit" name="submit"/>
            </form>
        <a href="RegistrationForm.jsp">Don't have a login? Click here!</a>

        <img src="http://image.automobilemag.com/f/68190492+w660+h440+q80+cr1+ar0/2015-mercedes-benz-s-class-coupe-front-side-view-studio.jpg" width="660" height="440"/>

    </center>
    
    </body>
</html>
