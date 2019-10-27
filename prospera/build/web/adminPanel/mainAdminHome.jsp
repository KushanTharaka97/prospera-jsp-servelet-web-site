<%-- 
    Document   : mainAdminHome
    Created on : Oct 18, 2019, 12:17:40 PM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AdminHome-petClinic</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body background="../img/fourth.jpg">
        <jsp:include page="adminheader.jsp" />
        <div align="center">
            <h1><font color="green">Hello Admin</font></h1>
        </div>
        
      
<div class="container">
  <div class="card-deck mb-3 text-center">
    <div class="card mb-4 shadow-sm">
      <div class="card-header">
        <h4 class="my-0 font-weight-normal">Request</h4>
      </div>
      <div class="card-body">
        
        <ul class="list-unstyled mt-3 mb-4">
          <li>All the</li>
          <li>Request send </li>
          <li><h3>By Clinics</h3></li>
          <li>Are here</li>
        </ul>
          <a href="requestDisplay.jsp"> <button type="button" class="btn btn-lg btn-block btn-outline-primary">Click me!</button></a>
      </div>
    </div>
    <div class="card mb-4 shadow-sm">
      <div class="card-header">
        <h4 class="my-0 font-weight-normal">Show Clinics</h4>
      </div>
      <div class="card-body">
        
        <ul class="list-unstyled mt-3 mb-4">
          <li>All the</li>
          <li><h3>Registered</h3></li>
          <li>Clinics </li>
          <li>Are here!(can edit)</li>
        </ul>
          <a href="showDisplay.jsp"><button type="button" class="btn btn-lg btn-block btn-primary">Click me!</button></a>
      </div>
    </div>
    <div class="card mb-4 shadow-sm">
      <div class="card-header">
        <h4 class="my-0 font-weight-normal">Ask Questions</h4>
      </div>
      <div class="card-body">
   
        <ul class="list-unstyled mt-3 mb-4">
            <li>Can <h3>Edit</h3></li>
          <li>All the</li>
          <li>User Ask</li>
          <li>Questions</li>
        </ul>
        <button type="button" class="btn btn-lg btn-block btn-primary">Click me!</button>
      </div>
    </div>
 
  </div>
    
    <div class="container">
  <div class="card-deck mb-3 text-center">
    <div class="card mb-4 shadow-sm">
      <div class="card-header">
        <h4 class="my-0 font-weight-normal">Add new admins</h4>
      </div>
      <div class="card-body">
        
        <ul class="list-unstyled mt-3 mb-4">
          <li>You can</li>
          <li><h3>Add</h3></li>
          <li>New Admins</li>
          <li>Here</li>
        </ul>
          <a href="../adminsignup.jsp"> <button type="button" class="btn btn-lg btn-block btn-outline-primary">Click me!</button></a>
      </div>
    </div>
    <div class="card mb-4 shadow-sm">
      <div class="card-header">
        <h4 class="my-0 font-weight-normal">Deleting Admin</h4>
      </div>
      <div class="card-body">
      
        <ul class="list-unstyled mt-3 mb-4">
            <li>Main Admin </li>
            <li>Can <h3>Delete</h3></li>
          <li>Unwanted Admins</li>
          
        </ul>
          <a href="deleteAdmin.jsp"><button type="button" class="btn btn-lg btn-block btn-primary">Click me!</button></a>
      </div>
    </div>
    <div class="card mb-4 shadow-sm">
      <div class="card-header">
        <h4 class="my-0 font-weight-normal">Update Admins</h4>
      </div>
      <div class="card-body">
       
        <ul class="list-unstyled mt-3 mb-4">
            <li>Main Admin</li>
            <li>Can <h3>Update</h3></li>
          <li>Admin</li>
          <li>From here</li>
        </ul>
        <button type="button" class="btn btn-lg btn-block btn-primary">Click me!</button>
      </div>
    </div>
      
  </div>
        
       
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
