package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<style>\n");
      out.write("ul {\n");
      out.write("    list-style-type: none;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    overflow: hidden;\n");
      out.write("    background-color: #47B0CB;\n");
      out.write("}\n");
      out.write("#footer {\n");
      out.write("   position:fixed;\n");
      out.write("   bottom:0;\n");
      out.write("   width:100%;\n");
      out.write("   height:60px;\n");
      out.write("   background-color: #47B0CB;\n");
      out.write("}\n");
      out.write("li {\n");
      out.write("    float: right;\n");
      out.write("}\n");
      out.write(".bottom {\n");
      out.write("    float : middle;\n");
      out.write("}\n");
      out.write("li a {\n");
      out.write("    display: block;\n");
      out.write("    color: white;\n");
      out.write("    padding: 30px 15px;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("li.title{\n");
      out.write("    float : left;\n");
      out.write("    text-align : center;\n");
      out.write("    color : white;\n");
      out.write("    padding: 30px 15px;\n");
      out.write("}\n");
      out.write("li a:hover {\n");
      out.write("    background-color: #899193;\n");
      out.write("}\n");
      out.write("div{\n");
      out.write("color:WHITE;padding : 50px; background-color : #DFDFDF;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<ul>\n");
      out.write("<li class=\"title\"><font face=\"Comic Sans MS\" size=\"5\"><b>About us</b></font></li>\n");
      out.write("<li><a href=\"Registration_Form..jsp\">Register</a></li>\n");
      out.write("<li><a href=\"Login_Form1.jsp\">Login</a></li>\n");
      out.write("<li><a href=\"Home.jsp\">Home</a></li>\n");
      out.write("</ul>\n");
      out.write("<div style=\"background-image : url('../food.jpg');\">\n");
      out.write("<center>\n");
      out.write("<h1 id=\"title\" style=\"color:white;text-shadow :5px 5px 8px black; margin-top:0%; padding : 5px; background-color : #DFDFDF;\">\"Birth of Fresher's Guide\"<p style=\"color:black;font-size:20;text-shadow :none;\">This project started as to find the solution of a simple problem which is to find cheap and affordable room/messes for students who have just entered the city. Now we hope this website helps you to find the room/messes you where looking for.<p style=\"color:font-size:20;black;text-shadow :5px 5px 8px black;\">Thanks.</p><p style=\"color:black;font-size:20;text-shadow :none;\"> A Special Thanks to Prof. Lokendra Vishwakarma who Guided us through our journey.</p><p><table>\n");
      out.write("<hr>\n");
      out.write("<p style=\"color:white;background-color : #DFDFDF;\">The Crew</p>\n");
      out.write("<HR>\n");
      out.write("<tr>\n");
      out.write("<td><CENTER><img src=\"1.jpg\" width=\"120px\" height=\"150px\"></CENTER></td>\n");
      out.write("<td><CENTER><img src=\"2.jpg\" width=\"150px\" height=\"150px\"></CENTER></td>\n");
      out.write("<td><CENTER><img src=\"3.jpg\" width=\"120px\" height=\"150px\"></CENTER></td>\n");
      out.write("<td><CENTER><img src=\"4.jpg\" width=\"150px\" height=\"150px\"></CENTER></td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><div>\n");
      out.write("<font color=\"black\">Ashutosh Garg</font>\n");
      out.write("</div></td>\n");
      out.write("<td><div>\n");
      out.write("<font color=\"black\">Ashwin Mathew</font>\n");
      out.write("</div></td>\n");
      out.write("<td><div>\n");
      out.write("<font color=\"black\">Aditya Malani</font>\n");
      out.write("</div></td>\n");
      out.write("<td><div>\n");
      out.write("<font color=\"black\">Aman Agarwal</font>\n");
      out.write("</div></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("<hr></p></h1>\n");
      out.write("\n");
      out.write("</center>\n");
      out.write("</div>\n");
      out.write("<ul id=\"footer\">\n");
      out.write("<li><a href=\"contact.jsp\">Contact Us</a></li>\n");
      out.write("<li><a href=\"about.jsp\">About Us</a></li>\n");
      out.write("<li><a href=\"terms.jsp\">Privacy & Terms</a></li>\n");
      out.write("</ul>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
