/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partner.deleting;

import dbConnection.DbConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author asus
 */
public class deletePartners extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet deletePartners</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet deletePartners at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out= response.getWriter();
        
       String _email=request.getParameter("update");
       
        try{
//          out.println("Test");
            DbConnection db= new DbConnection();
            
           Connection conn= db.getConnection();
          conn.createStatement();
          Statement stmt=conn.createStatement();
          String sql=" DELETE FROM clinic WHERE email='"+_email.trim()+"' ";
         
        
        stmt=conn.prepareStatement(sql); 
            int rs=stmt.executeUpdate(sql);
            
            response.sendRedirect("adminPanel/showDisplay.jsp");
            

      }catch(Exception e){
          out.println("Your error is: "+ e);
      }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
