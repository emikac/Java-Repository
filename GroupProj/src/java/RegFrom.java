/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author erikmikac
 */
public class RegFrom extends HttpServlet {
ResultSet res = null;
Connection conn = null;
 PreparedStatement insertCustomers = null;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegFrom</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegFrom at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
         
        
       try{
           
                 conn = DBConnect.getInstance();
                 insertCustomers = conn.prepareStatement(
                 "INSERT INTO CUSTOMERINFO(Name,Username,Password,email,PhoneNumber) "
                         + "VALUES (?,?,?,?,?)");
             }       
             catch(SQLException err){
                 err.printStackTrace();
             }
       
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
            
            
            result = setCustomers(Name, Username,Password,email,PhoneNumber);

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
     
    
    

 
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>


}
