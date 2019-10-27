<%-- 
    Document   : clinicSignup
    Created on : Oct 17, 2019, 9:22:20 AM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    
     <script>
           function Submit(){
                var p=sp.pass.value;
                var cp=sp.cpass.value;
            //using else if
            if(p==cp)
                alert("Password and Confirmation are similer! Press submit")
            else
                alert("Mismatch , re-type the password!")
           
           }
           
           function check(){
               var i=user.psw.value;
               var j=user.cpsw.value;
               //using else if
               if(i==j)
                    alert("Password and Confirmation are similer! Press submit")
                else
                alert("Mismatch , re-type the password!")
            
           }
        </script>
    
    </head>
    <body>
        <jsp:include page="header.jsp" />
         <section class="jumbotron text-center">
    <div class="container">
        <h1 class="jumbotron-heading"><strong>SignUp!</strong></h1>
      <p class="lead text-muted">You can sign up as new clinic by filling this form , use the procedure.</p>
      <div align="center">
          <<form action="../clinicSignup" method="POST"  name="cs">
              
          <input type="text" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm" placeholder="Clinic Name" name="cname" required="required">
          <br>
           <input type="text" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm" placeholder="User Name" name="uname" required="required">
          <br>
           <input type="text" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm" placeholder="NIC" name="nic" required="required">
          <br>
           <input type="text" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm" placeholder="Contact Number" name="tnum" required="required">
          <br>
          <input type="email" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm" placeholder="Email of the Clinic" name="email" required="required">
          <br>
          <div align="left">
              <select name="city">
                   <option value="Colombo"> Colombo</option>
                    <option value="Kandy">Kandy</option>
                    <option value="Trincomalee">Trincomalee</option>
                    <option value="Anuradhapura">Anuradhapura</option>
                    <option value="Jaffna">Jaffna</option>
                    <option value="Kurunegala">Kurunegala</option>
                    <option value="Ratnapura">Ratnapura</option>
                    <option value="Galle">Galle</option>
                    <option value="Jaffna">Jaffna</option>
                     <option value="Badulla">Badulla</option>
            </select>
          </div>
          <br>
           <input type="password" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm" placeholder="password" name="pass" required="required">
          <br>
           <input type="password" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm" placeholder="Confirm Password" name="cpass" onchange="Submit()">
          <br>
          <button type="submit" class="btn btn-success" value="submit">Sign Up</button>
        
              <button class="btn btn-warning">
                  <a href="login.jsp">Login </a>
		</button>
           </form>
      </div>
    </div>
  </section>
        
        
        
        
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
