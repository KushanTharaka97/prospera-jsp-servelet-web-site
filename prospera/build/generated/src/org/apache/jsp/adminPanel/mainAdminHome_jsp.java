package org.apache.jsp.adminPanel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mainAdminHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>AdminHome-petClinic</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body background=\"../img/fourth.jpg\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "adminheader.jsp", out, false);
      out.write("\n");
      out.write("        <div align=\"center\">\n");
      out.write("            <h1><font color=\"green\">Hello Admin</font></h1>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("<div class=\"container\">\n");
      out.write("  <div class=\"card-deck mb-3 text-center\">\n");
      out.write("    <div class=\"card mb-4 shadow-sm\">\n");
      out.write("      <div class=\"card-header\">\n");
      out.write("        <h4 class=\"my-0 font-weight-normal\">Request</h4>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"card-body\">\n");
      out.write("        \n");
      out.write("        <ul class=\"list-unstyled mt-3 mb-4\">\n");
      out.write("          <li>All the</li>\n");
      out.write("          <li>Request send </li>\n");
      out.write("          <li><h3>By Clinics</h3></li>\n");
      out.write("          <li>Are here</li>\n");
      out.write("        </ul>\n");
      out.write("          <a href=\"requestDisplay.jsp\"> <button type=\"button\" class=\"btn btn-lg btn-block btn-outline-primary\">Click me!</button></a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"card mb-4 shadow-sm\">\n");
      out.write("      <div class=\"card-header\">\n");
      out.write("        <h4 class=\"my-0 font-weight-normal\">Show Clinics</h4>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"card-body\">\n");
      out.write("        \n");
      out.write("        <ul class=\"list-unstyled mt-3 mb-4\">\n");
      out.write("          <li>All the</li>\n");
      out.write("          <li><h3>Registered</h3></li>\n");
      out.write("          <li>Clinics </li>\n");
      out.write("          <li>Are here!(can edit)</li>\n");
      out.write("        </ul>\n");
      out.write("          <a href=\"showDisplay.jsp\"><button type=\"button\" class=\"btn btn-lg btn-block btn-primary\">Click me!</button></a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"card mb-4 shadow-sm\">\n");
      out.write("      <div class=\"card-header\">\n");
      out.write("        <h4 class=\"my-0 font-weight-normal\">Ask Questions</h4>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"card-body\">\n");
      out.write("   \n");
      out.write("        <ul class=\"list-unstyled mt-3 mb-4\">\n");
      out.write("            <li>Can <h3>Edit</h3></li>\n");
      out.write("          <li>All the</li>\n");
      out.write("          <li>User Ask</li>\n");
      out.write("          <li>Questions</li>\n");
      out.write("        </ul>\n");
      out.write("        <button type=\"button\" class=\"btn btn-lg btn-block btn-primary\">Click me!</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write(" \n");
      out.write("  </div>\n");
      out.write("    \n");
      out.write("    <div class=\"container\">\n");
      out.write("  <div class=\"card-deck mb-3 text-center\">\n");
      out.write("    <div class=\"card mb-4 shadow-sm\">\n");
      out.write("      <div class=\"card-header\">\n");
      out.write("        <h4 class=\"my-0 font-weight-normal\">Add new admins</h4>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"card-body\">\n");
      out.write("        \n");
      out.write("        <ul class=\"list-unstyled mt-3 mb-4\">\n");
      out.write("          <li>You can</li>\n");
      out.write("          <li><h3>Add</h3></li>\n");
      out.write("          <li>New Admins</li>\n");
      out.write("          <li>Here</li>\n");
      out.write("        </ul>\n");
      out.write("          <a href=\"../adminsignup.jsp\"> <button type=\"button\" class=\"btn btn-lg btn-block btn-outline-primary\">Click me!</button></a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"card mb-4 shadow-sm\">\n");
      out.write("      <div class=\"card-header\">\n");
      out.write("        <h4 class=\"my-0 font-weight-normal\">Deleting Admin</h4>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"card-body\">\n");
      out.write("      \n");
      out.write("        <ul class=\"list-unstyled mt-3 mb-4\">\n");
      out.write("            <li>Main Admin </li>\n");
      out.write("            <li>Can <h3>Delete</h3></li>\n");
      out.write("          <li>Unwanted Admins</li>\n");
      out.write("          \n");
      out.write("        </ul>\n");
      out.write("          <a href=\"deleteAdmin.jsp\"><button type=\"button\" class=\"btn btn-lg btn-block btn-primary\">Click me!</button></a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"card mb-4 shadow-sm\">\n");
      out.write("      <div class=\"card-header\">\n");
      out.write("        <h4 class=\"my-0 font-weight-normal\">Update Admins</h4>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"card-body\">\n");
      out.write("       \n");
      out.write("        <ul class=\"list-unstyled mt-3 mb-4\">\n");
      out.write("            <li>Main Admin</li>\n");
      out.write("            <li>Can <h3>Update</h3></li>\n");
      out.write("          <li>Admin</li>\n");
      out.write("          <li>From here</li>\n");
      out.write("        </ul>\n");
      out.write("        <button type=\"button\" class=\"btn btn-lg btn-block btn-primary\">Click me!</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write("  </div>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
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
