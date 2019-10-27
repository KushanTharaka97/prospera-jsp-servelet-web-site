/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askQuestion.Comment.reply;

import dbConnection.DbConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class reply extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet reply</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet reply at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       PrintWriter out= response.getWriter();
       String _update=request.getParameter("update");
       String _id=request.getParameter("id");
       //int _ID=Integer.parseInt("_id");
       
       try{
//          out.println("Test");
            DbConnection db= new DbConnection();
            
           Connection conn= db.getConnection();
          conn.createStatement();
          Statement stmt=conn.createStatement();
          String sql=" UPDATE ask SET reply='"+_update.trim()+"' WHERE id='"+_id+"' ";
         
        
        stmt=conn.prepareStatement(sql); 
            int rs=stmt.executeUpdate(sql);
            
            response.sendRedirect("partners/clinic.jsp");
    }catch(Exception e){
          out.println("Your error is: "+ e);
      }
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
