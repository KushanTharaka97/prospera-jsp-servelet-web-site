package org.apache.jsp.partners;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public final class clinic_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"Mark Otto, Jacob Thornton, and Bootstrap contributors\">\n");
      out.write("        <meta name=\"generator\" content=\"Jekyll v3.8.5\">\n");
      out.write("        <title>Clinic partners panel-Prospera</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("   \n");
      out.write("            <h1 align=\"center\">Ask Surgery</h1>\n");
      out.write("            <table border=\"2\" align=\"center\" class=\"container\" class=\"table\">\n");
      out.write("                <thead class=\"thead-dark\">\n");
      out.write("                <tr bgcolor=\"#98fb98\">\n");
      out.write("                    \n");
      out.write("                        <th scope=\"col\" ><h4 align=\"center\">User Name</h4></th>\n");
      out.write("                        <th scope=\"col\" ><h4 align=\"center\">Question</h4></th>\n");
      out.write("                        <th scope=\"col\" ><h4 align=\"center\">Asking</h4></th>\n");
      out.write("                        <th scope=\"col\" ><h4 align=\"center\">Reply</h4></th>\n");
      out.write("                         <th scope=\"col\" ><h4 align=\"center\">My Reply</h4></th>\n");
      out.write("                        \n");
      out.write("                </tr>\n");
      out.write("                </thead>\n");
      out.write("                ");

                    try{
                    //Creating database connection in the .jsp page
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/prosper","root","");
                    String sql="SELECT * FROM ask WHERE category='1'";
                    Statement stmt=conn.createStatement();
                    ResultSet rs=stmt.executeQuery(sql);
                    while(rs.next()){

                
      out.write("\n");
      out.write("                \n");
      out.write("                <thead class=\"thead-light\">\n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <td scope=\"col\" align=\"center\">");
out.println(rs.getString("user")); 
      out.write("</td>\n");
      out.write("                    <td scope=\"col\">");
out.println(rs.getString("question")); 
      out.write("</td>\n");
      out.write("                    <td scope=\"col\" align=\"center\">");
out.println(rs.getString("asking")); 
      out.write("</td>\n");
      out.write("                    <td scope=\"col\" align=\"center\">");
out.println(rs.getString("reply")); 
      out.write("</td>\n");
      out.write("                    <td scope=\"col\" align=\"center\">\n");
      out.write("                        <form method=\"POST\" action=\"../reply\">\n");
      out.write("                            <input type=\"hidden\" value=\"");
out.println(rs.getString("id"));
      out.write("\" name=\"id\">\n");
      out.write("                            <input type=\"text\" class=\"form-group\" name=\"update\"> \n");
      out.write("                            <input type=\"submit\" value=\"submit\" name=\"submit\" class=\"btn btn-success\">\n");
      out.write("                        </form>\n");
      out.write("                    </td>\n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                </thead>\n");
      out.write("       \n");
      out.write("                \n");
      out.write("               \n");
      out.write("      \n");
      out.write("                \n");
      out.write("                ");
 }
      out.write("\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("             \n");
      out.write("                \n");
      out.write("              \n");
      out.write("                \n");
      out.write("                ");
 
                    rs.close();
                    stmt.close();
                    conn.close();
                    }
                            catch(Exception e)
                            {
                            e.printStackTrace();
                            }

                    
                
      out.write("\n");
      out.write("               \n");
      out.write("                <br><br>\n");
      out.write("               \n");
      out.write("               <h1 align=\"center\">Ask Checkup</h1>\n");
      out.write("            <table border=\"2\" align=\"center\" class=\"container\" class=\"table\">\n");
      out.write("                <thead class=\"thead-dark\">\n");
      out.write("                <tr bgcolor=\"#98fb98\">\n");
      out.write("                    \n");
      out.write("                        <th scope=\"col\" ><h4 align=\"center\">User Name</h4></th>\n");
      out.write("                        <th scope=\"col\" ><h4 align=\"center\">Question</h4></th>\n");
      out.write("                        <th scope=\"col\" ><h4 align=\"center\">Asking</h4></th>\n");
      out.write("                        <th scope=\"col\" ><h4 align=\"center\">Reply</h4></th>\n");
      out.write("                         <th scope=\"col\" ><h4 align=\"center\">My Reply</h4></th>\n");
      out.write("                        \n");
      out.write("                </tr>\n");
      out.write("                </thead>\n");
      out.write("                ");

                    try{
                    //Creating database connection in the .jsp page
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/prosper","root","");
                    String sql="SELECT * FROM ask WHERE category='2'";
                    Statement stmt=conn.createStatement();
                    ResultSet rs=stmt.executeQuery(sql);
                    while(rs.next()){

                
      out.write("\n");
      out.write("                \n");
      out.write("                <thead class=\"thead-light\">\n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <td scope=\"col\" align=\"center\">");
out.println(rs.getString("user")); 
      out.write("</td>\n");
      out.write("                    <td scope=\"col\">");
out.println(rs.getString("question")); 
      out.write("</td>\n");
      out.write("                    <td scope=\"col\" align=\"center\">");
out.println(rs.getString("asking")); 
      out.write("</td>\n");
      out.write("                    <td scope=\"col\" align=\"center\">");
out.println(rs.getString("reply")); 
      out.write("</td>\n");
      out.write("                    <td scope=\"col\" align=\"center\">\n");
      out.write("                        <form method=\"POST\" action=\"../reply\">\n");
      out.write("                            <input type=\"hidden\" value=\"");
out.println(rs.getString("id"));
      out.write("\" name=\"id\">\n");
      out.write("                            <input type=\"text\" class=\"form-group\" name=\"update\"> \n");
      out.write("                            <input type=\"submit\" value=\"submit\" name=\"submit\" class=\"btn btn-success\">\n");
      out.write("                        </form>\n");
      out.write("                    </td>\n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                </thead>\n");
      out.write("       \n");
      out.write("                \n");
      out.write("               \n");
      out.write("      \n");
      out.write("                \n");
      out.write("                ");
 }
      out.write("\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("             \n");
      out.write("                \n");
      out.write("              \n");
      out.write("                \n");
      out.write("                ");
 
                    rs.close();
                    stmt.close();
                    conn.close();
                    }
                            catch(Exception e)
                            {
                            e.printStackTrace();
                            }

                    
                
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <br><br>\n");
      out.write("                \n");
      out.write("                <h1 align=\"center\">Ask Neutral</h1>\n");
      out.write("            <table border=\"2\" align=\"center\" class=\"container\" class=\"table\">\n");
      out.write("                <thead class=\"thead-dark\">\n");
      out.write("                <tr bgcolor=\"#98fb98\">\n");
      out.write("                    \n");
      out.write("                        <th scope=\"col\" ><h4 align=\"center\">User Name</h4></th>\n");
      out.write("                        <th scope=\"col\" ><h4 align=\"center\">Question</h4></th>\n");
      out.write("                        <th scope=\"col\" ><h4 align=\"center\">Asking</h4></th>\n");
      out.write("                        <th scope=\"col\" ><h4 align=\"center\">Reply</h4></th>\n");
      out.write("                         <th scope=\"col\" ><h4 align=\"center\">My Reply</h4></th>\n");
      out.write("                        \n");
      out.write("                </tr>\n");
      out.write("                </thead>\n");
      out.write("                ");

                    try{
                    //Creating database connection in the .jsp page
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/prosper","root","");
                    String sql="SELECT * FROM ask WHERE category='3'";
                    Statement stmt=conn.createStatement();
                    ResultSet rs=stmt.executeQuery(sql);
                    while(rs.next()){

                
      out.write("\n");
      out.write("                \n");
      out.write("                <thead class=\"thead-light\">\n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <td scope=\"col\" align=\"center\">");
out.println(rs.getString("user")); 
      out.write("</td>\n");
      out.write("                    <td scope=\"col\">");
out.println(rs.getString("question")); 
      out.write("</td>\n");
      out.write("                    <td scope=\"col\" align=\"center\">");
out.println(rs.getString("asking")); 
      out.write("</td>\n");
      out.write("                    <td scope=\"col\" align=\"center\">");
out.println(rs.getString("reply")); 
      out.write("</td>\n");
      out.write("                    <td scope=\"col\" align=\"center\">\n");
      out.write("                        <form method=\"POST\" action=\"../reply\">\n");
      out.write("                            <input type=\"hidden\" value=\"");
out.println(rs.getString("id"));
      out.write("\" name=\"id\">\n");
      out.write("                            <input type=\"text\" class=\"form-group\" name=\"update\"> \n");
      out.write("                            <input type=\"submit\" value=\"submit\" name=\"submit\" class=\"btn btn-success\">\n");
      out.write("                        </form>\n");
      out.write("                    </td>\n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                </thead>\n");
      out.write("       \n");
      out.write("                \n");
      out.write("               \n");
      out.write("      \n");
      out.write("                \n");
      out.write("                ");
 }
      out.write("\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("             \n");
      out.write("                \n");
      out.write("              \n");
      out.write("                ");
 
                    rs.close();
                    stmt.close();
                    conn.close();
                    }
                            catch(Exception e)
                            {
                            e.printStackTrace();
                            }

                    
                
      out.write("\n");
      out.write("                \n");
      out.write("                <br><br>\n");
      out.write("                \n");
      out.write("                <h1 align=\"center\">Ask Vaccination</h1>\n");
      out.write("            <table border=\"2\" align=\"center\" class=\"container\" class=\"table\">\n");
      out.write("                <thead class=\"thead-dark\">\n");
      out.write("                <tr bgcolor=\"#98fb98\">\n");
      out.write("                    \n");
      out.write("                        <th scope=\"col\" ><h4 align=\"center\">User Name</h4></th>\n");
      out.write("                        <th scope=\"col\" ><h4 align=\"center\">Question</h4></th>\n");
      out.write("                        <th scope=\"col\" ><h4 align=\"center\">Asking</h4></th>\n");
      out.write("                        <th scope=\"col\" ><h4 align=\"center\">Reply</h4></th>\n");
      out.write("                         <th scope=\"col\" ><h4 align=\"center\">My Reply</h4></th>\n");
      out.write("                        \n");
      out.write("                </tr>\n");
      out.write("                </thead>\n");
      out.write("                ");

                    try{
                    //Creating database connection in the .jsp page
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/prosper","root","");
                    String sql="SELECT * FROM ask WHERE category='4'";
                    Statement stmt=conn.createStatement();
                    ResultSet rs=stmt.executeQuery(sql);
                    while(rs.next()){

                
      out.write("\n");
      out.write("                \n");
      out.write("                <thead class=\"thead-light\">\n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <td scope=\"col\" align=\"center\">");
out.println(rs.getString("user")); 
      out.write("</td>\n");
      out.write("                    <td scope=\"col\">");
out.println(rs.getString("question")); 
      out.write("</td>\n");
      out.write("                    <td scope=\"col\" align=\"center\">");
out.println(rs.getString("asking")); 
      out.write("</td>\n");
      out.write("                    <td scope=\"col\" align=\"center\">");
out.println(rs.getString("reply")); 
      out.write("</td>\n");
      out.write("                    <td scope=\"col\" align=\"center\">\n");
      out.write("                        <form method=\"POST\" action=\"../reply\">\n");
      out.write("                            <input type=\"hidden\" value=\"");
out.println(rs.getString("id"));
      out.write("\" name=\"id\">\n");
      out.write("                            <input type=\"text\" class=\"form-group\" name=\"update\"> \n");
      out.write("                            <input type=\"submit\" value=\"submit\" name=\"submit\" class=\"btn btn-success\">\n");
      out.write("                        </form>\n");
      out.write("                    </td>\n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                </thead>\n");
      out.write("       \n");
      out.write("                \n");
      out.write("               \n");
      out.write("      \n");
      out.write("                \n");
      out.write("                ");
 }
      out.write("\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("             \n");
      out.write("                \n");
      out.write("             \n");
      out.write("                \n");
      out.write("                ");
 
                    rs.close();
                    stmt.close();
                    conn.close();
                    }
                            catch(Exception e)
                            {
                            e.printStackTrace();
                            }

                    
                
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
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
