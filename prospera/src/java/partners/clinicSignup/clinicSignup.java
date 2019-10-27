/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partners.clinicSignup;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 *
 * @author asus
 */
public class clinicSignup extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet clinicSignup</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet clinicSignup at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   String _cname=request.getParameter("cname");
        String _uname=request.getParameter("uname");
        String _nic=request.getParameter("nic");
        String _tnum=request.getParameter("tnum");
        String _email=request.getParameter("email");
        String _city=request.getParameter("city");
        String _pass=request.getParameter("pass");
        
        try {
             
        
            String querry="INSERT INTO clinic (clinicname,username,nic,telnum,email,city,pass)VALUES(?,?,?,?,?,?,?)";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/prospera","root","");
            
            //for prevent sql injections
            PreparedStatement sp=conn.prepareStatement(querry);
            sp.setString(1,_cname);
            sp.setString(2,_uname);
            sp.setString(3,_nic);
            sp.setString(4,_tnum);
            sp.setString(5,_email);
            sp.setString(6,_city);
            sp.setString(7,_pass);
            
            
            sp.executeUpdate();
            response.sendRedirect("waite.jsp");
            
        } catch (ClassNotFoundException ex) {
            PrintWriter out=response.getWriter();
           out.println("Failed, you  have a ClassNotFoundException ex");
        } catch (SQLException ex) {
            PrintWriter out=response.getWriter();
           out.println("Failed, you  have a SQLException ex:"+ex);
        }catch(Exception e){
            PrintWriter out=response.getWriter();
           out.println("Failed, you  have a Exception e");
        }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
