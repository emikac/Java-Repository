<%-- 
    Document   : RegistrationForm
    Created on : Apr 26, 2015, 10:03:54 AM
    Author     : erikmikac
--%>
<%@page import = "java.sql.*"%>
<%@page import = "java.util.Date"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Information</title>
    </head>
    <body>
        <h1>Welcome to Mercedes!</h1>
        
        <p> Please fill out this form! </p>
      <%--  <%!
        
        public class Customer{
        
         Connection conn = null;
         PreparedStatement insertCustomers = null;
         ResultSet res = null;
         
         public Customer(){
             try{
                 conn = DBConnect.getInstance();
                 insertCustomers = conn.prepareStatement(
                 "INSERT INTO CUSTOMERINFO(Name,Username,Password,email,PhoneNumber) "
                         + "VALUES (?,?,?,?,?)");
             }       
             catch(SQLException err){
                 err.printStackTrace();
             }
         }
         
         public ResultSet insertCustomers(){
             try{
                 res = insertCustomers.executeQuery();
             }
         
             catch(SQLException err){
                 err.printStackTrace();
             }
             return res;
         }
         
         public int setCustomers(String Name, String Username, String Password, String email, String PhoneNumber){
             int result = 0;
             try{
              
          
             insertCustomers.setString(1,Name);
             insertCustomers.setString(2,Username);
             insertCustomers.setString(3,Password);
             insertCustomers.setString(4,email);
             insertCustomers.setString(5, PhoneNumber);
             result = insertCustomers.executeUpdate();
                 
             }
             catch (SQLException err){
                 err.printStackTrace();
             }
             return result;
         }
        }/*
        %>
        <%
            int result = 0;
           
            String Name = new String();
            String Username = new String();
            String Password = new String();
            String email = new String();
            String PhoneNumber = new String();
            
            if(request.getParameter("Name")!= null){
                Name = request.getParameter("Name");
                String redirectURL = "http://localhost:8080/Group/MainPage.jsp";
                response.sendRedirect(redirectURL);
                
            }
            if(request.getParameter("Username")!= null){
                Username = request.getParameter("Username");
            }
            if(request.getParameter("Password")!=null){
                Password = request.getParameter("Password");
            }
            if(request.getParameter("email")!=null){
                email = request.getParameter("email");
            }
            if(request.getParameter("PhoneNumber")!=null){
              
                PhoneNumber = request.getParameter("PhoneNumber");
                 
               
            }
            
            Customer customer = new Customer();
            result = customer.setCustomers(Name, Username,Password,email,PhoneNumber);
             
            
            
            %>--%>
        
        
        <form name="myform" action="RegFrom" method="POST">
            <table border="0">
                <tbody>
                    <tr>
                        <td>Name</td>
                        <td><input type="text" name="Name" value="" size="50" /></td>
                    </tr>
                    <tr>
                        <td>Username</td>
                        <td><input type="text" name="Username" value="" size="50" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="Password" value="" size="50" /></td>
                    </tr>
                    <tr>
                        <td>E-mail</td>
                        <td><input type="text" name="email" value="" size="50" /></td>
                    </tr>
                    <tr>
                        <td>Phone Number</td>
                        <td><input type="text" name="PhoneNumber" value="" size="50" /></td>
                    </tr>
                </tbody>
                
            </table>
           
%>
            <input type="reset" value="Clear" name="Clear" />
           
            <input type="submit" value="submit" name ="submit"    >
            
               
        </form>
    </body>
</html>
