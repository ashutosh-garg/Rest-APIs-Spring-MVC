package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class location_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title> Fresher's Guide</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("body{background-image:url(\"food.jpg\");\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: 100px;\n");
      out.write("\tleft: 20px;\n");
      out.write("\tright:40px;\n");
      out.write("\tbottom: 40px;\n");
      out.write("\twidth: auto;\n");
      out.write("\theight: auto;\n");
      out.write("\topacity:0.8;\n");
      out.write("\tbackground-size: cover;\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("select{\n");
      out.write("\twidth: 280px;\n");
      out.write("\talign:left;\n");
      out.write("\theight: 30px;\n");
      out.write("\tbackground: transparent;\n");
      out.write("\tborder: 1px solid rgba(255,255,255,0.6);\n");
      out.write("\tborder-radius: 2px;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tfont-family: 'Exo', sans-serif;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("\tfont-weight: 400;\n");
      out.write("\tpadding: 4px;\n");
      out.write("}\n");
      out.write("button{\n");
      out.write("\twidth: 280px;\n");
      out.write("\theight: 35px;\n");
      out.write("\tbackground: #fff;\n");
      out.write("\tborder: 1px solid #fff;\n");
      out.write("\tcursor: pointer;\n");
      out.write("\tborder-radius: 2px;\n");
      out.write("\tcolor: #a18d6c;\n");
      out.write("\tfont-family: 'Exo', sans-serif;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("\tfont-weight: 400;\n");
      out.write("\tpadding: 6px;\n");
      out.write("\tmargin-top: 10px;\n");
      out.write("\tfiltre:blur(5px);\n");
      out.write("}\n");
      out.write("\n");
      out.write("table{ text-align:center;\n");
      out.write("\t\tborder:2px solid;\n");
      out.write("\t\tvertical-align:middle;\n");
      out.write("\t\talign:center-right;\n");
      out.write("\t\theight:20px;\n");
      out.write("\t\tpadding:35px;\n");
      out.write("\t\tbackground-image:url(hex.jpg);\n");
      out.write("\t\tborder-radius:13px;\n");
      out.write("\t\topacity:0.5;\n");
      out.write("\t\tfiltre:alpha(opacity=50)\n");
      out.write("\t\t}\n");
      out.write("\t\t.location input[type=button]:hover{\n");
      out.write("\topacity: 0.6;\t\t\n");
      out.write("}\n");
      out.write(".location input[type=button]:hover{\n");
      out.write("\topacity:0.8;\n");
      out.write("}\n");
      out.write("\n");
      out.write("Select:hover{\n");
      out.write("\t\t\tbackground-color:gray;\n");
      out.write("}\n");
      out.write("option:hover{\n");
      out.write("\t\t\tbackground-color:pink;\n");
      out.write("\t\t\topacity:0.5;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"location\">\n");
      out.write("<center>\n");
      out.write("    <form action=\"TakeDetails\" method=\"post\">\n");
      out.write("<table >\n");
      out.write("<tr>\n");
      out.write("<td><select name=\"h\">\n");
      out.write("<option value=\"-1\" selected>Select your city</option>\n");
      out.write("<option value=\"1\" >Indore</option>\n");
      out.write("<option value=\"1\" >Bhopal</option>\n");
      out.write("</select>\n");
      out.write("</td></tr>\n");
      out.write("<tr>\n");
      out.write("<td><select name=\"locality\" placeholder=\"Select Locality\" >\n");
      out.write("<option value=\"-1\" >Select Locality</option>\n");
      out.write("<option value=\"Vallabh_Nagar\" >Vallabh_Nagar</option>\n");
      out.write("<option value=\"Rani_Sati_Gate\" >Rani_Sati_Gate</option>\n");
      out.write("<option value=\"Janjeer_Wala_Square\" >Janjeer_Wala_Square</option>\n");
      out.write("<option value=\"Malwa_Mill_Region\" >Malwa_Mill_Region</option>\n");
      out.write("</select></td>\n");
      out.write("</tr>\n");
      out.write("<hr>\n");
      out.write("<tr>\n");
      out.write("<td><input type=\"submit\" value=\"Submit\"/></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("    </form>\n");
      out.write("</center>\n");
      out.write("</div>\n");
      out.write("<hr>\n");
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
