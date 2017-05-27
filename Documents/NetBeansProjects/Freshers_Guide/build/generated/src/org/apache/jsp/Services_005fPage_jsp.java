package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Services_005fPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
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
      out.write("    text-align: center;\n");
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
      out.write(".drpbtn{\n");
      out.write("    cursor : pointer;\n");
      out.write("}\n");
      out.write(".dropdown {\n");
      out.write("    position: relative;\n");
      out.write("    display: inline-block;\n");
      out.write("}\n");
      out.write(".dropdown-content {\n");
      out.write("    display: none;\n");
      out.write("    position: absolute;\n");
      out.write("    background-color: #f9f9f9;\n");
      out.write("    min-width: 160px;\n");
      out.write("    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("    z-index: 1;\n");
      out.write("}\n");
      out.write(".dropdown-content a {\n");
      out.write("    color: black;\n");
      out.write("    padding: 12px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write(".dropdown-content a:hover {background-color: #f1f1f1}\n");
      out.write(".dropdown:hover .dropdown-content {\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write(".dropdown:hover .dropbtn {\n");
      out.write("    background-color: #3e8e41;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<ul>\n");
      out.write("<li class=\"title\"><font face=\"Comic Sans MS\" size=\"5\"><b>FRESHERS GUIDE</b></font></li>\n");
      out.write("<li><a href=\"Home.jsp\">Logout</a></li>\n");
      out.write("<li><a href=\"\">Call Us : (+91) 9672116541</a></li>\n");
      out.write("<div class=\"dropdown\">\n");
      out.write("<li class=\"drpbtn\"><a href=\"\">Add Services</a></li>\n");
      out.write("    <div class=\"dropdown-content\">\n");
      out.write("    <a href=\"addrooms.html\">Room Services</a>\n");
      out.write("    <a href=\"\">Mess Services</a>\n");
      out.write("    </div>\n");
      out.write("    <!--<a href=\"\">Home Food Services</a>-->\n");
      out.write("<li><a href=\"\">Search Food</a></li>\n");
      out.write("<li><a href=\"location.html\">Search Rooms</a></li>\n");
      out.write("</div>\n");
      out.write("<li><a href=\"index_page.htm\">Home</a></li>\n");
      out.write("</ul>\n");
      out.write("<center>\n");
      out.write("<h1 id=\"title\" style=\"color:white; text-shadow :5px 5px 8px black; margin : 5%; padding : 150px; background-color : #DFDFDF;\">\"Explore the range of services here!\"</h1>\n");
      out.write("</center>\n");
      out.write("<ul id=\"footer\">\n");
      out.write("<li><a href=\"\">Contact Us</a></li>\n");
      out.write("<li><a href=\"\">About Us</a></li>\n");
      out.write("<li><a href=\"\">Terms</a></li>\n");
      out.write("<li><a href=\"\">Privacy</a></li>\n");
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
