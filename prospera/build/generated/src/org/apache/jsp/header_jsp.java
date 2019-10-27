package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>Prospera_Animal Care</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/components.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/icons.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/responsee.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"owl-carousel/owl.carousel.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"owl-carousel/owl.theme.css\">\n");
      out.write("    <!-- CUSTOM STYLE -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/template-style.css\">\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,700,800&subset=latin,latin-ext' rel='stylesheet' type='text/css'>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery-1.8.3.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery-ui.min.js\"></script>    \n");
      out.write("    <script type=\"text/javascript\" src=\"js/validation.js\"></script> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header role=\"banner\">    \n");
      out.write("      <!-- Top Bar -->\n");
      out.write("      <div class=\"top-bar background-white\">\n");
      out.write("        <div class=\"line\">\n");
      out.write("          <div class=\"s-12 m-6 l-6\">\n");
      out.write("            <div class=\"top-bar-contact\">\n");
      out.write("              <p class=\"text-size-12\">Contact Us: 0800 200 200 | <a class=\"text-orange-hover\" href=\"mailto:contact@sampledomain.com\">contact@sampledomain.com</a></p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"s-12 m-6 l-6\">\n");
      out.write("            <div class=\"right\">\n");
      out.write("              <ul class=\"top-bar-social right\">\n");
      out.write("                <li><a href=\"/\"><i class=\"icon-facebook_circle text-orange-hover\"></i></a></li>\n");
      out.write("                <li><a href=\"/\"><i class=\"icon-twitter_circle text-orange-hover\"></i></a> </li>\n");
      out.write("                <li><a href=\"/\"><i class=\"icon-google_plus_circle text-orange-hover\"></i></a></li>\n");
      out.write("                <li><a href=\"/\"><i class=\"icon-instagram_circle text-orange-hover\"></i></a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <!-- Top Navigation -->\n");
      out.write("      <nav class=\"background-white background-primary-hightlight\">\n");
      out.write("        <div class=\"line\">\n");
      out.write("          <div class=\"s-12 l-2\">\n");
      out.write("            <a href=\"index.html\" class=\"logo\"><img src=\"img/logo-free.png\" alt=\"\"></a>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"top-nav s-12 l-10\">\n");
      out.write("            <p class=\"nav-text\"></p>\n");
      out.write("            <ul class=\"right chevron\">\n");
      out.write("              <li><a href=\"index.html\">Home</a></li>\n");
      out.write("              <li><a href=\"about.html\">About</a></li>\n");
      out.write("              <li><a href=\"gallery.html\">Gallery</a></li>\n");
      out.write("              <li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("    </header>\n");
      out.write("        \n");
      out.write("         <script type=\"text/javascript\" src=\"js/responsee.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"owl-carousel/owl.carousel.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/template-scripts.js\"></script>\n");
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
