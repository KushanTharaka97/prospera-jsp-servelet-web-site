<%-- 
    Document   : requestDisplay
    Created on : Oct 19, 2019, 4:40:11 AM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
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
        <title>Requests from Services Providers</title>
    </head>
    <body bgcolor="#ffe4e1">
        <jsp:include page="adminheader.jsp" />
        <h1 align="center">Requests from Clinics!</h1>
        
        <%@ page import="java.sql.ResultSet" %>
        <%@ page import="java.sql.Statement" %>
        <%@ page import="java.sql.Connection" %>
        <%@ page import="java.sql.DriverManager" %>
        <%@page import="java.sql.*" %>
        
   
            
            <table border="2" align="center" class="container" class="table">
                <thead class="thead-dark">
                <tr bgcolor="#98fb98">
                        <th scope="col" align="center"><h4>Clinic Name</h4></th>
                        <th scope="col" align="center"><h4>Clinic Owner;s Name</h4></th>
                        <th scope="col" align="center"><h4>Email</h4></th>
                        <th scope="col" align="center"><h4>NIC</h4></th>
                        <th scope="col" align="center"><h4>Registered Date<br> Time</h4></th>
                        <th scope="col" align="center"><h4>Telephone</h4></th>
                        <th scope="col" align="center"><h4>City</h4></th>
                    <th>Aceptence</td>
                </tr>
                </thead>
                <%
                    try{
                    //Creating database connection in the .jsp page
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/prospera","root","");
                    String sql="SELECT * FROM clinic WHERE accept !='1'";
                    Statement stmt=conn.createStatement();
                    ResultSet rs=stmt.executeQuery(sql);
                    while(rs.next()){

                %>
                
                <thead class="thead-light">
                <tr>
                    <td scope="col"><%out.println(rs.getString("clinicname")); %></td>
                    <td scope="col"><%out.println(rs.getString("username")); %></td>
                    <td scope="col"><%out.println(rs.getString("email")); %></td>
                    <td scope="col"><%out.println(rs.getString("nic")); %></td>
                     <td scope="col"><%out.println(rs.getString("regdate")); %></td>
                      <td scope="col"><%out.println(rs.getString("telnum")); %></td>
                       <td scope="col"><%out.println(rs.getString("city")); %></td>
                    <td>
                        <form method="POST"  action="../acceptPartners">
                            <input type="hidden" name="update" value="<%out.println(rs.getString("email"));%>">
                            <input type="submit" name="submit" value="Add Clinic" ID="button" >
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
