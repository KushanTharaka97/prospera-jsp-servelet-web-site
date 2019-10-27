/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askk.commenting;

import dbConnection.DbConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author asus
 */
public class asking1 extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet asking1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet asking1 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      processRequest(request, response);
          String user=request.getParameter("user");
            String category=request.getParameter("category");
            String ques=request.getParameter("ques");
            String clinic=request.getParameter("se");
        
         try {
             
        
            String querry="INSERT INTO ask (user,question,asking,category)VALUES(?,?,?,?)";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/prospera","root","");
            
            //for prevent sql injections
            PreparedStatement sp=conn.prepareStatement(querry);
            sp.setString(1,user);
            sp.setString(2,ques);
            sp.setString(3,clinic);
            sp.setString(4,category);       
            sp.executeUpdate(); 
            response.sendRedirect("index.jsp");
            
        } catch (ClassNotFoundException ex) {
            PrintWriter out=response.getWriter();
           out.println("Failed, you  have a ClassNotFoundException ex");
        } catch (SQLException ex) {
            PrintWriter out=response.getWriter();
           out.println("Failed, you  have a SQLException ex");
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
