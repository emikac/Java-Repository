<%-- 
    Document   : OrderInfo
    Created on : Apr 28, 2015, 7:12:04 PM
    Author     : erikmikac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Info</title>
    </head>
    
        <h1>Thank for logging in. Here at Mercedes we strive to satisfy the customer 
        in all possible ways.</h1>
    <center>
        
        <form action="BuildCar" >
            
            
            <h2> What City are you From?</h2>
        <select name="Location" size="10">
            <option>Chicago</option>
            <option>Los Angeles</option>
            <option>New York</option>
            
            
        </select>

        <h2>What type of Car do you want?</h2>
        <select name="car" size="10">
            <option>C-Class</option>
            <option>SL-Class</option>
            <option>SLS</option>
        </select>
         

  <ul >
      <p>How would you like to decorate your car?</p> 
         
          <ui>Heated Seats<input type="checkbox" name="HeatedSeats" value="ON" /></ui>
          <ui>GPS<input type ="checkbox" name ="GPS" value ="ON"/></ui>
          <ui>Wifi<input type="checkbox" name="wifi" value="ON" /></ui>
      </ul>
      
       
       
     
  
        <input type="submit" value="submit" name="submit" />
    </center>
</form>
    </body>
 
</html>
