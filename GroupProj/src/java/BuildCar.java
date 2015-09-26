/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Adam
 */
public class BuildCar extends HttpServlet {

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
            out.println("<title>Servlet BuildCar</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet BuildCar at " + request.getContextPath() + "</h1>");
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
        MercedesBenz store;
        Car car;
        String wifi = "OFF";
        String HeatedSeats = "OFF";
        String GPS = "OFF";
        
        PrintWriter out = response.getWriter();
        String city = request.getParameter("Location");
        String carType = request.getParameter("car");
        wifi = request.getParameter("wifi");
        HeatedSeats = request.getParameter("HeatedSeats");
        GPS = request.getParameter("GPS");
       
        if(wifi == null){
        wifi = "OFF";}
        if(HeatedSeats == null){
            HeatedSeats = "OFF";
        }
        if(GPS == null){
            GPS = "OFF";
        }
      

        
        if (city.equals("New York")) {
            store = new MercedesNewYork();
        } else if (city.equals("Chicago")) {
            store = new MercedesChicago();
        } else if (city.equals("Los Angeles")) {
            store = new MercedesLosAngeles();
        } else {
            store = null;
        }
        
        if (carType.equals("C-Class")) {
            car = store.makeCar("C-Class");
        } else if (carType.equals("SL-Class")) {
            car = store.makeCar("SL-CLass");
        } else if (carType.equals("SLS")) {
            car = store.makeCar("SLS");
        } else {
            car = null;
        }
        
        
        if (wifi.equals("ON")) {
            car = new WiFi(car);
        } 
        if(HeatedSeats.equals("ON")){
            car = new HeatedSeats(car);
        }
        if(GPS.equals("ON")){
            car = new GPS(car);
        }
        
        out.print("Hello");

       
        request.setAttribute("car", car);
    
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/ConfirmationOrderForm.jsp");
        rd.forward(request, response);
        
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
