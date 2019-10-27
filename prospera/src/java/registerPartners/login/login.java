/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registerPartners.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author asus
 */
public class login extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet login</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet login at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       try{
            String _uname=request.getParameter("uname");
            String _pass=request.getParameter("pass");
            
            //local variables for checking
            String dbemail=null;
            String dbpass=null;
            String dbemail1=null;
            String dbpass1=null;
            String dbname =null;
            String dbname1=null;
            
            
            String sql="SELECT * FROM clinic WHERE username=? AND pass=?";
            String sql1="SELECT * FROM admin WHERE username=? AND pass=?";
            
            //MySql connection
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/prospera","root","");
            
            //Prepared ststement for the servise provider
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1,_uname);
            ps.setString(2,_pass);
            ResultSet rs=ps.executeQuery();
            
            //Prepared stttement for the user table
            PreparedStatement ps1=conn.prepareStatement(sql1);
            ps1.setString(1, _uname);
            ps1.setString(2,_pass);
            ResultSet rs1=ps1.executeQuery();
            
            while(rs.next()){
               dbname=rs.getString("username");
                dbpass=rs.getString("pass");
                //dbname=rs.getString("spname");
            }
            while(rs1.next()){
                dbname1=rs1.getString("username");
                dbpass1=rs1.getString("pass");
                //dbname1=rs1.getString("user");
            }
            if(_uname.equals(dbname)&&_pass.equals(dbpass)){
                //service provider set;
                
//                 PrintWriter out=response.getWriter();
//                out.println("Result:Succes");
//                HttpSession session=request.getSession();
//                session.setAttribute("spname",dbname);

                Cookie userCookie = new Cookie("name", "value");
                userCookie.setMaxAge(60*60*24*365); //Store cookie for 1 year
                response.addCookie(userCookie);

                response.sendRedirect("partners/clinic.jsp");
                
            }else if(_uname.equals("admin")&&_pass.equals("admin")){
             response.sendRedirect("requestDisplay.jsp");
            }else if(_uname.equals(dbname1)&&_pass.equals(dbpass1)){
                 //User session set ;
                  HttpSession session=request.getSession();
                session.setAttribute("user",dbname1);
                session.setMaxInactiveInterval(30*60);
                
                
                response.sendRedirect("adminPanel/mainAdminHome1.jsp");
            }
            else{
                
//                request.setAttribute("message","Account is Invaid");
//                request.getRequestDispatcher("form.jsp").forward(request,response);
                  response.sendRedirect("loginErrorPage.jsp");
//                PrintWriter out=response.getWriter();
//                out.println("You have not succesfully  logged");
            }
            
        }catch(Exception e){
             PrintWriter out=response.getWriter();
                out.println("You have Exception e: "+e);
        }
    }


   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
