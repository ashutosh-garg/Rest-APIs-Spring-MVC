/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ashutosh_garg
 */
public class ShowFoodDetails1 extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("image/gif;charset=UTF-8");
        PrintWriter out=response.getWriter();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/freshersguide","root","root");
            String qr="select * from foodservices where locality=?";
            PreparedStatement ps=(PreparedStatement) con.prepareStatement(qr);
            String s1=request.getParameter("locality");
            ps.setString(1, s1);
            ResultSet rs=(ResultSet) ps.executeQuery();
            boolean found=rs.next();
            if(found){
                String image=rs.getString(1);
                //    byte[] imgData = image.getBytes(1,(int)image.length());
                String s2=rs.getString(2);
                String s3=rs.getString(3);
                String s4=rs.getString(4);
            //    request.setAttribute("imagedata",imgData);
                request.setAttribute("imageString",image);
                request.setAttribute("name",s2);
                request.setAttribute("rentprice",s3);
                request.setAttribute("locality",s4);
                RequestDispatcher rd=request.getRequestDispatcher("showfood.jsp");
                rd.forward(request, response);
            }
            else
                out.println("No Such Entry in the Database");
        } 
        catch(Exception e){
            System.out.println(e);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
