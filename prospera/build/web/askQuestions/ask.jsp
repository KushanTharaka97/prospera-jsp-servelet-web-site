<%-- 
    Document   : ask
    Created on : Oct 20, 2019, 3:54:58 AM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
        <meta name="generator" content="Jekyll v3.8.5">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        <jsp:include page="header.jsp" />
        
        
        <!--database creating-->
        <%@ page import="java.sql.ResultSet" %>
        <%@ page import="java.sql.Statement" %>
        <%@ page import="java.sql.Connection" %>
        <%@ page import="java.sql.DriverManager" %>
        <%@page import="java.sql.*" %>
        
        
        
        <div class="container">
            <h1 align="center">Ask Question </h1>
             <form action="../asking1" method="POST">
                 <hr>
        <div class="form-group">
             <label for="formGroupExampleInput2">User Name</label>
            <input type="text" class="form-control" id="formGroupExampleInput" name="user" placeholder="ex: John Laughfs" required="required">
        </div>
                 <hr>
           
                 <div class="form-group">
                     <label for="formGroupExampleInput2">Select category </label>
                     <br>
                     <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="category" id="inlineRadio1" value="1">
                    <label class="form-check-label" for="inlineRadio1">Ask Surgery</label>
                   </div>
                   <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="category" id="inlineRadio2" value="2">
                    <label class="form-check-label" for="inlineRadio2">Checkups </label>
                   </div>
                     
                       <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="category" id="inlineRadio3" value="3">
                    <label class="form-check-label" for="inlineRadio3">Ask Spay & Neutery</label>
                   </div>
                   

                 </div>
                 
                 <hr>
                 
        <div class="form-group">
          <label for="formGroupExampleInput2">Question</label>
          <input type="text" class="form-control" id="formGroupExampleInput2" name="ques" placeholder="ex: What is suitable way to Vaccination?">
        </div>
                 <hr>
                 <label class="form-group">Asking From</label>
                 <select class="form-group" name="se">
                  
                    <option value="Anyone">Not Specific</option>
                       <%
                    try{
                    //Creating database connection in the .jsp page
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/prospera","root","");
                    String sql="SELECT * FROM clinic WHERE accept!='0'";
                    Statement stmt=conn.createStatement();
                    ResultSet rs=stmt.executeQuery(sql);
                    while(rs.next()){
                %>
                    <option value="<%out.println(rs.getString("clinicname")); %>"><%out.println(rs.getString("clinicname")); %></option>
                         <% }  %>
                         <%
                    rs.close();
                    stmt.close();
                    conn.close();
                    }
                            catch(Exception e)
                            {
                            e.printStackTrace();
                            }    
                %>
                  </select>
                 <hr>
                 <div>
                     <input type="submit" name="submit" value="submit">
                 </div>
                
      </form>
        
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
