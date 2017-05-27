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
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ashutosh_garg
 */
public class UserValidation extends HttpServlet {

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
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/freshersguide","root","root");
            String qr="select name from serviceowner where loginid=? and password=?";
            PreparedStatement ps=(PreparedStatement) con.prepareStatement(qr);
            String s1=request.getParameter("name");
            String s2=request.getParameter("password");
            ps.setString(1, s1);
            ps.setString(2, s2);
            ResultSet rs=(ResultSet) ps.executeQuery();
            boolean found=rs.next();
            if(found){
               String s=rs.getString(1);
               HttpSession session=request.getSession();
               session.setAttribute("username", s1);
         //      response.sendRedirect("admin.jsp");
               Cookie ck=new Cookie("name",s1);
               response.addCookie(ck);
         //     RequestDispatcher rd=request.getRequestDispatcher("Services_Page.jsp");
         //      rd.forward(request, response);
               response.sendRedirect("Services_Page.jsp");
               // out.println("Welcome User!");
                }
            else if(found==false){
                 String qr1="select name from servicetaker where loginid=? and password=?";
                 PreparedStatement ps1=(PreparedStatement) con.prepareStatement(qr1);
                 ps1.setString(1, s1);
                 ps1.setString(2, s2);
                 ResultSet rs1=(ResultSet) ps1.executeQuery();
                 boolean found1=rs1.next();
                 if(found1){
                        String s=rs1.getString(1);
                        HttpSession session=request.getSession();
               session.setAttribute("username", s1);
              response.sendRedirect("Services_PageUser.jsp");
              //RequestDispatcher rd=request.getRequestDispatcher("Services_PageUser.jsp");
              // rd.forward(request, response);
               // out.println("Welcome User!");
                }
                 else if(found1==false){
                    String qr2="select loginid from admin where loginid=? and password=?";
                    PreparedStatement ps2=(PreparedStatement) con.prepareStatement(qr2);
                    ps2.setString(1, s1);
                    ps2.setString(2, s2);
                    ResultSet rs2=(ResultSet) ps2.executeQuery();
                    boolean found2=rs2.next();
                    if(found2){
                        String s=rs2.getString(1);
                        HttpSession session=request.getSession();
               session.setAttribute("username", s1);
         //      response.sendRedirect("admin.jsp");
                    RequestDispatcher rd=request.getRequestDispatcher("Admin.jsp");
                    rd.forward(request, response);
               // out.println("Welcome User!");
                }
                   else
                      out.println("Invalid User");
                    }
                 else
                      out.println("Invalid User");
                     
            }
            else
                out.println("Invalid User");
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
