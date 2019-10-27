/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.signup;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class adminSignup extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet adminSignup</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet adminSignup at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

  

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String _uname=request.getParameter("uname");
        String _nic=request.getParameter("nic");
        String _tnum=request.getParameter("tnum");
        String _email=request.getParameter("email");
        String _pass=request.getParameter("pass");
        
        try {
             
        
            String querry="INSERT INTO admin (username,nic,telnum,email,pass)VALUES(?,?,?,?,?)";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/prospera","root","");
            
            //for prevent sql injections
            PreparedStatement sp=conn.prepareStatement(querry);     
            sp.setString(1,_uname);
            sp.setString(2,_nic);
            sp.setString(3,_tnum);
            sp.setString(4,_email);
            sp.setString(5,_pass);
            
            
            sp.executeUpdate();
            response.sendRedirect("adminPanel/mainAdminHome1.jsp");
            
        } catch (ClassNotFoundException ex) {
            PrintWriter out=response.getWriter();
           out.println("Failed, you  have a ClassNotFoundException ex"+ex);
        } catch (SQLException ex) {
            PrintWriter out=response.getWriter();
           out.println("Failed, you  have a SQLException ex:"+ex);
        }catch(Exception e){
            PrintWriter out=response.getWriter();
           out.println("Failed, you  have a Exception e"+e);
        }
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
