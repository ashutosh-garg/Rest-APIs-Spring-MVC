/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
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
public class MakeServiceEntry extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            PreparedStatement ps;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/freshersguide","root","root");
            String qr="insert into serviceowner values (?,?,?,?,?)";
            String qr1="insert into servicetaker values (?,?,?,?,?)";
            String s1=request.getParameter("t1");
            String s2=request.getParameter("t2");
            String s3=request.getParameter("t3");
            String s4=request.getParameter("t4");
            String s5=request.getParameter("t5");
            String s6=request.getParameter("type");
            if(s6.equals("user")){
                ps=(PreparedStatement) con.prepareStatement(qr1);
            }
            else{
            ps=(PreparedStatement) con.prepareStatement(qr);}
            ps.setString(1,s1);
            ps.setString(2,s2);
            ps.setString(3,s4);
            ps.setString(4,s3);
            ps.setString(5,s5);
            ps.executeUpdate();
            con.close();
            if(s6.equals("user")){
            RequestDispatcher rd=request.getRequestDispatcher("Services_PageUser.jsp");
            rd.forward(request, response);
            }
            else{
                RequestDispatcher rd=request.getRequestDispatcher("Services_Page.jsp");
            rd.forward(request, response);}
        } 
        catch(Exception e){
            out.println(e);
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
