<%-- 
    Document   : mainAdminHome1
    Created on : Oct 27, 2019, 12:29:55 AM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Pannel-ProSpera</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
         <jsp:include page="adminheader.jsp" />
        
<table class="table table-hover table-dark">
        <thead>
          <tr>
            <th scope="col">#</th>
            <th scope="col">Description</th>
            <th scope="col">The Button</th>

          </tr>
        </thead>
                <tbody>
                  <tr>
                    <th scope="row">1</th>
                    <td align="center">All  the request send by the clinics are here!</td>
                    <td><a href="requestDisplay.jsp"> <button type="button" class="btn btn-lg btn-block btn-outline-primary">Click me! to browse</button></a></td>

                  </tr>
                  <tr>
                    <th scope="row">2</th>
                    <td align="center">You can see all the registered Clnics from here for edit </td>
                    <td> <a href="showDisplay.jsp"><button type="button" class="btn btn-lg btn-block btn-primary">Click me!</button></a></td>

                  </tr>
                  <tr >
                   <th scope="row">2</th>
                    <td align="center">You can edit Asked questions from here </td>
                    <td> <a href=""><button type="button" class="btn btn-lg btn-block btn-primary">Click me!</button></a></td>

                  </tr>
                   <tr >
                   <th scope="row">2</th>
                    <td align="center">You can add new admins </td>
                    <td>   <a href="adminsignup.jsp"> <button type="button" class="btn btn-lg btn-block btn-outline-primary">Click me!</button></a></td>

                  </tr>
                   <tr >
                   <th scope="row">2</th>
                    <td align="center">You can delete Admin here</td>
                    <td> <a href="deleteAdmin.jsp"><button type="button" class="btn btn-lg btn-block btn-primary">Click me!</button></a></td>

                  </tr>
                  
                </tbody>
</table>
        
 <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
