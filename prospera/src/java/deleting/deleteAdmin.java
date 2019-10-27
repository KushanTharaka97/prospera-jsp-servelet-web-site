/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deleting;

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
public class deleteAdmin extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet deleteAdmin</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet deleteAdmin at " + request.getContextPath() + "</h1>");
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
          String sql="DELETE FROM admin WHERE email='"+_email.trim()+"' ";
         
        
        stmt=conn.prepareStatement(sql); 
            int rs=stmt.executeUpdate(sql);
            
            response.sendRedirect("adminPanel/deleteAdmin.jsp");
            

            
  String result;
   
   // Recipient's email ID needs to be mentioned.
   String to = _email;

   // Sender's email ID needs to be mentioned
   String from = "mcmohd@gmail.com";

   // Assuming you are sending email from localhost
   String host = "localhost";

   // Get system properties object
   Properties properties = System.getProperties();

   // Setup mail server
   properties.setProperty("mail.smtp.host", host);

   // Get the default Session object.
   Session mailSession = Session.getDefaultInstance(properties);

   try {
      // Create a default MimeMessage object.
      MimeMessage message = new MimeMessage(mailSession);
      
      // Set From: header field of the header.
      message.setFrom(new InternetAddress(from));
      
      // Set To: header field of the header.
      message.addRecipient(Message.RecipientType.TO,
                               new InternetAddress(to));
      // Set Subject: header field
      message.setSubject("Remove The Admin!");
      
      // Now set the actual message
      message.setText("You Have resign due to organization's rules and regulations");
      
      // Send message
      Transport.send(message);
      result = "Sent message successfully....";
   } catch (MessagingException mex) {
      mex.printStackTrace();
      result = "Error: unable to send message....";
   }
            
            
            
   //  out.println("Your Succcesflly updated");
           
      }catch(Exception e){
          out.println("Your error is: "+ e);
      }
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
