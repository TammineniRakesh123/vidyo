/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.20
 * Generated at: 2019-01-09 11:48:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Signin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"http://ajax.googleapis.com/ajax/libs/jqueryui/1.7.2/themes/base/jquery-ui.css\">\r\n");
      out.write("<title>LOGIN</title>\r\n");
      out.write("<style>\r\n");
      out.write(".img\r\n");
      out.write("{\r\n");
      out.write("\r\n");
      out.write("  background-image: url(\"1.png\");\r\n");
      out.write("background-position: center center;\r\n");
      out.write("  background-repeat: no-repeat;\r\n");
      out.write("   background-attachment:fixed;\r\n");
      out.write("  background-size: cover;\r\n");
      out.write("  height:auto;\r\n");
      out.write("  width:100%;\r\n");
      out.write("}\r\n");
      out.write(".login\r\n");
      out.write("{\r\n");
      out.write("                \r\n");
      out.write("    background-position: left top;\r\n");
      out.write("    position:absolute;\r\n");
      out.write("    left:90px;\r\n");
      out.write("    border: 2px solid ; \r\n");
      out.write("     background-color: #B0C4DE; \r\n");
      out.write("     \r\n");
      out.write("      border-style: outset;\r\n");
      out.write("      color:blue;\r\n");
      out.write("      \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".rcorners3 {\r\n");
      out.write("  border-radius: 25px;\r\n");
      out.write("\r\n");
      out.write("  background-position: left top;\r\n");
      out.write("  background-repeat: repeat;\r\n");
      out.write("\r\n");
      out.write("  padding:10px; \r\n");
      out.write("  width: 150px;\r\n");
      out.write("  height:10px;  \r\n");
      out.write("   /* box-shadow: 10px 10px 5px grey; */\r\n");
      out.write("   border-style: outset;\r\n");
      out.write("   color:blue;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"img\">\r\n");
      out.write("<center><b>LOGIN</b></center></h3>\r\n");
      out.write(" \t<form action=\"Login\">\r\n");
      out.write("    <div class=\"container-fluid\" >\r\n");
      out.write("    <div class=\"row\" >\r\n");
      out.write("    \t<b>Name:</b> <input type=\"text\" name=\"User\" class=\"rcorners3\"></input><br><br>\r\n");
      out.write("   \t\t<center> <button type=\"submit\"  class=\"login\">submit</button></center>\r\n");
      out.write("\t</div>\r\n");
      out.write("    </form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}