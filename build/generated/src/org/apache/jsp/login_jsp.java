package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<title>Log In</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<style>\n");
      out.write("form { background-color:#83F52C;\n");
      out.write("\tfont-family: Arial, sans-serif;\n");
      out.write("\twidth: 350px; \n");
      out.write("    padding: 10px;\t}\n");
      out.write("label { float: left;\n");
      out.write("\twidth: 100px; \n");
      out.write("\tdisplay: block; \n");
      out.write("        clear: left;\n");
      out.write("\ttext-align: right; \n");
      out.write("\tpadding-right: 10px;\n");
      out.write("\tmargin-top: 10px; }\n");
      out.write("input, textarea { margin-top: 10px; \n");
      out.write("                 float: right contour\n");
      out.write("                 } \n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("     \n");
      out.write("      \n");
      out.write("<h2>Please type your login id and password</h2>\n");
      out.write("\n");
      out.write(" <form name=\"eric1\" action=\"http://localhost:8080/ChattBank/LoginServlet\" method=\"get\" onsubmit=\"validate();\">\n");
      out.write("\n");
      out.write("<br/>Login ID:  <input type=\"text\" name=\"idtb\" />\n");
      out.write("<br/>Password: <input type=\"password\" name=\"passwordtb\" /> \n");
      out.write("  <div><center>\n");
      out.write("          <input id=\"mysubmit\" type=\"submit\" value=\"Submit\" onsubmit=\"validate();\"/>\n");
      out.write("<input type=\"reset\"></center>\n");
      out.write("\n");
      out.write(" </form>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("   \n");
      out.write("     \n");
      out.write("        function validate(){\n");
      out.write("                var a;\n");
      out.write("                a = document.eric1.idtb.value;\n");
      out.write("                var b;\n");
      out.write("                b = document.eric1.passwordtb.value;                \n");
      out.write("                    if( a === \"\" ||\n");
      out.write("                    isNaN( a )  ||\n");
      out.write("                    a < 3000 ||\n");
      out.write("                    a > 3999){\n");
      out.write("                      alert(\"Try entering a number between 3000 and 3999 =P\");  \n");
      out.write("                      a.focus() ;\n");
      out.write("                      return false;\n");
      out.write("                    }\n");
      out.write("                 \n");
      out.write("                \n");
      out.write("\n");
      out.write("                  if( b === \"\" || b === null) {\n");
      out.write("                  alert(\"Try entering a password or something =P\");  \n");
      out.write("                  b.focus() ;\n");
      out.write("                  return false;\n");
      out.write("                }\n");
      out.write("             \n");
      out.write("                \n");
      out.write("        }\n");
      out.write("             \n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("\n");
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
