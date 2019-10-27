<%-- 
    Document   : deleteAdmin
    Created on : Oct 20, 2019, 3:15:31 AM
    Author     : asus
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <style>
           #button:active{
                                background:olive;
                            }
                            
            #button:focus{
                            background:olive;
                        }                
        </style>
            
            <link rel="stylesheet" type="text/css" href="css/cssForRequestDetailsTables.css">
        
        <title>Delete Admin - OsteriaX</title>
    </head>
    <body>
        <jsp:include page="header.jsp" />
        
        
         <%@ page import="java.sql.ResultSet" %>
        <%@ page import="java.sql.Statement" %>
        <%@ page import="java.sql.Connection" %>
        <%@ page import="java.sql.DriverManager" %>
        <%@page import="java.sql.*" %>
        <br><br><br><br><br>
        
        <h1 align="center"><font color="red">Delete Admin</font></h1>
       <div class="album py-5 bg-light">
             <div class="container">
                 <div class="row">
                      <%
                    try{
                    //Creating database connection in the .jsp page
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/prospera","root","");
                    String sql="SELECT * FROM admin WHERE accept!='1'";
                    Statement stmt=conn.createStatement();
                    ResultSet rs=stmt.executeQuery(sql);
                    while(rs.next()){

                %>
        <div class="col-md-4">
          <div class="card mb-4 shadow-sm">
           <br>
            <div class="card-body">
                <p class="card-text">
                   Admin Name:<%out.println(rs.getString("username")); %>
                   
                    <br>
                    Admin's NIC:<%out.println(rs.getString("nic")); %>
                    <br>
                    Admin's Email:<%out.println(rs.getString("email")); %>
                   
                   
                    
                      <form method="POST" action="../deleteAdmin">
                            <input type="hidden" name="update" value="<%out.println(rs.getString("email"));%>" >
                            <input type="submit" name="submit" value="Delete Admin" ID="button" class="btn btn-primary btn-lg" >
                        </form>

                </p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                  <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                  <button type="button" class="btn btn-sm btn-outline-secondary">Edit</button>
                </div>
                <small class="text-muted"><%out.println(rs.getString("time")); %></small>
              </div>
            </div>
          </div>
        </div>
          
                            <% }%>     
                               
             </div>
        </div>
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
        
        <!--bootstrap JS-->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
