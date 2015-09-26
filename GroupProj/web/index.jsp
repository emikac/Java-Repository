
<%@page import ="java.sql.*"%>




<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Form</title>
        
    </head>
    <body>
        <h1>Customers in Mercedes DB.</h1>
        <%! public class Customer{
         String URL = "jdbc:mysql://localhost:3306/MercedesCustomers";
         String USERNAME = "root";
         String PASSWORD = "root";
         
         Connection conn = null;
         PreparedStatement selectCustomers = null;
         ResultSet res = null;
         
         public Customer(){
             try{
                 conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
                 selectCustomers = conn.prepareStatement(
                 "SELECT * FROM CustomerInfo");
             }       
             catch(SQLException err){
                 err.printStackTrace();
             }
         }
         
         public ResultSet getCustomers(){
             try{
                 res = selectCustomers.executeQuery();
             }
         
             catch(SQLException err){
                 err.printStackTrace();
             }
             return res;
         }
        }
        %>
        
        <%
               Customer customer = new Customer();
               ResultSet customers = customer.getCustomers();
               
        %>
        <table border="1">
           
            <tbody>
                <tr>
                    <td>Name</td>
                    <td>Username</td>
                    <td>Password</td>
                    <td>E-mail</td>
                    <td>Phone Number</td>
                </tr>
                <% while (customers.next()){ %>
                <tr>
                    <td><%= customers.getString("Name")%></td>                    
                    <td><%= customers.getString("Username")%></td>
                    <td><%= customers.getString("Password")%></td>
                    <td><%= customers.getString("email")%></td>
                    <td><%= customers.getString("PhoneNumber")%></td>
                </tr>
                <% } %>
            </tbody>
        </table>

        
    </body>
</html>
