<%-- 
    Document   : clinic
    Created on : Oct 17, 2019, 3:10:39 AM
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
        <title>Clinic partners panel-Prospera</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
          
        <jsp:include page="header.jsp" />
        
        <%@ page import="java.sql.ResultSet" %>
        <%@ page import="java.sql.Statement" %>
        <%@ page import="java.sql.Connection" %>
        <%@ page import="java.sql.DriverManager" %>
        <%@page import="java.sql.*" %>
        
   
            <h1 align="center">Ask Surgery</h1>
            <table border="2" align="center" class="container" class="table">
                <thead class="thead-dark">
                <tr bgcolor="#98fb98">
                    
                        <th scope="col" ><h4 align="center">User Name</h4></th>
                        <th scope="col" ><h4 align="center">Question</h4></th>
                        <th scope="col" ><h4 align="center">Asking</h4></th>
                        <th scope="col" ><h4 align="center">Reply</h4></th>
                         <th scope="col" ><h4 align="center">My Reply</h4></th>
                        
                </tr>
                </thead>
                <%
                    try{
                    //Creating database connection in the .jsp page
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/prospera","root","");
                    String sql="SELECT * FROM ask WHERE category='1'";
                    Statement stmt=conn.createStatement();
                    ResultSet rs=stmt.executeQuery(sql);
                    while(rs.next()){

                %>
                
                <thead class="thead-light">
                <tr>
                    
                    <td scope="col" align="center"><%out.println(rs.getString("user")); %></td>
                    <td scope="col"><%out.println(rs.getString("question")); %></td>
                    <td scope="col" align="center"><%out.println(rs.getString("asking")); %></td>
                    <td scope="col" align="center"><%out.println(rs.getString("reply")); %></td>
                    <td scope="col" align="center">
                        <form method="POST" action="../reply">
                            <input type="hidden" value="<%out.println(rs.getString("id"));%>" name="id">
                            <input type="text" class="form-group" name="update"> 
                            <input type="submit" value="submit" name="submit" class="btn btn-success">
                        </form>
                    </td>
                     
                     
                    
                </tr>
                </thead>
       
                
               
      
                
                <% }%>

            </table>
             
                
              
                
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
               
                <br><br>
               
               <h1 align="center">Ask Checkup</h1>
            <table border="2" align="center" class="container" class="table">
                <thead class="thead-dark">
                <tr bgcolor="#98fb98">
                    
                        <th scope="col" ><h4 align="center">User Name</h4></th>
                        <th scope="col" ><h4 align="center">Question</h4></th>
                        <th scope="col" ><h4 align="center">Asking</h4></th>
                        <th scope="col" ><h4 align="center">Reply</h4></th>
                         <th scope="col" ><h4 align="center">My Reply</h4></th>
                        
                </tr>
                </thead>
                <%
                    try{
                    //Creating database connection in the .jsp page
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/prospera","root","");
                    String sql="SELECT * FROM ask WHERE category='2'";
                    Statement stmt=conn.createStatement();
                    ResultSet rs=stmt.executeQuery(sql);
                    while(rs.next()){

                %>
                
                <thead class="thead-light">
                <tr>
                    
                    <td scope="col" align="center"><%out.println(rs.getString("user")); %></td>
                    <td scope="col"><%out.println(rs.getString("question")); %></td>
                    <td scope="col" align="center"><%out.println(rs.getString("asking")); %></td>
                    <td scope="col" align="center"><%out.println(rs.getString("reply")); %></td>
                    <td scope="col" align="center">
                        <form method="POST" action="../reply">
                            <input type="hidden" value="<%out.println(rs.getString("id"));%>" name="id">
                            <input type="text" class="form-group" name="update"> 
                            <input type="submit" value="submit" name="submit" class="btn btn-success">
                        </form>
                    </td>
                     
                     
                    
                </tr>
                </thead>
       
                
               
      
                
                <% }%>

            </table>
             
                
              
                
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
                
                
                <br><br>
                
                <h1 align="center">Ask Neutral</h1>
            <table border="2" align="center" class="container" class="table">
                <thead class="thead-dark">
                <tr bgcolor="#98fb98">
                    
                        <th scope="col" ><h4 align="center">User Name</h4></th>
                        <th scope="col" ><h4 align="center">Question</h4></th>
                        <th scope="col" ><h4 align="center">Asking</h4></th>
                        <th scope="col" ><h4 align="center">Reply</h4></th>
                         <th scope="col" ><h4 align="center">My Reply</h4></th>
                        
                </tr>
                </thead>
                <%
                    try{
                    //Creating database connection in the .jsp page
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/prospera","root","");
                    String sql="SELECT * FROM ask WHERE category='3'";
                    Statement stmt=conn.createStatement();
                    ResultSet rs=stmt.executeQuery(sql);
                    while(rs.next()){

                %>
                
                <thead class="thead-light">
                <tr>
                    
                    <td scope="col" align="center"><%out.println(rs.getString("user")); %></td>
                    <td scope="col"><%out.println(rs.getString("question")); %></td>
                    <td scope="col" align="center"><%out.println(rs.getString("asking")); %></td>
                    <td scope="col" align="center"><%out.println(rs.getString("reply")); %></td>
                    <td scope="col" align="center">
                        <form method="POST" action="../reply">
                            <input type="hidden" value="<%out.println(rs.getString("id"));%>" name="id">
                            <input type="text" class="form-group" name="update"> 
                            <input type="submit" value="submit" name="submit" class="btn btn-success">
                        </form>
                    </td>
                     
                     
                    
                </tr>
                </thead>
       
                
               
      
                
                <% }%>

            </table>
             
                
              
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
                
                <br><br>
                
                <h1 align="center">Ask Vaccination</h1>
            <table border="2" align="center" class="container" class="table">
                <thead class="thead-dark">
                <tr bgcolor="#98fb98">
                    
                        <th scope="col" ><h4 align="center">User Name</h4></th>
                        <th scope="col" ><h4 align="center">Question</h4></th>
                        <th scope="col" ><h4 align="center">Asking</h4></th>
                        <th scope="col" ><h4 align="center">Reply</h4></th>
                         <th scope="col" ><h4 align="center">My Reply</h4></th>
                        
                </tr>
                </thead>
                <%
                    try{
                    //Creating database connection in the .jsp page
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/prospera","root","");
                    String sql="SELECT * FROM ask WHERE category='4'";
                    Statement stmt=conn.createStatement();
                    ResultSet rs=stmt.executeQuery(sql);
                    while(rs.next()){

                %>
                
                <thead class="thead-light">
                <tr>
                    
                    <td scope="col" align="center"><%out.println(rs.getString("user")); %></td>
                    <td scope="col"><%out.println(rs.getString("question")); %></td>
                    <td scope="col" align="center"><%out.println(rs.getString("asking")); %></td>
                    <td scope="col" align="center"><%out.println(rs.getString("reply")); %></td>
                    <td scope="col" align="center">
                        <form method="POST" action="../reply">
                            <input type="hidden" value="<%out.println(rs.getString("id"));%>" name="id">
                            <input type="text" class="form-group" name="update"> 
                            <input type="submit" value="submit" name="submit" class="btn btn-success">
                        </form>
                    </td>
                     
                     
                    
                </tr>
                </thead>
       
                
               
      
                
                <% }%>

            </table>
             
                
             
                
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
                
                
        
        
        
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
