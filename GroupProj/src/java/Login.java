/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author erikmikac
 */
@WebServlet(urlPatterns = {"/Login"})
public class Login extends HttpServlet {

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
            out.println("<title>Servlet Login</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Login at " + request.getContextPath() + "</h1>");
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
        
         String URL = "jdbc:mysql://localhost:3306/MercedesCustomers";
         String USERNAME = "root";
         String PASSWORD = "root";
         PrintWriter out = response.getWriter();

         try{
          Connection conn = DBConnect.getInstance();
           PreparedStatement Check = conn.prepareStatement(
                 "SELECT Username,Password FROM CustomerInfo");
         ResultSet res = Check.executeQuery();
         res.absolute(0);
       
        String username = request.getParameter("Username");
        String password = request.getParameter("Password");
        
         
         while(res.next()){
               String Password = res.getString("Password");
               String Username = res.getString("Username");
              
                 if(username.equals(Username)&&password.equals(Password)){
                     response.sendRedirect("OrderInfo.jsp");
                     return;
                 }
                
             }
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/MainPage.jsp");
            PrintWriter outs= response.getWriter();
            
            
            outs.println("<font size = 30 color=red>Either user name or password is wrong.</font>");
            
            rd.include(request, response);
           
        
                     }
         catch(SQLException err){
             out.println(err.getMessage());
             err.printStackTrace();
         }
         
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
        processRequest(request, response);
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
