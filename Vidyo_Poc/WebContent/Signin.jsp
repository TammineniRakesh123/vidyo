<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" media="screen" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.7.2/themes/base/jquery-ui.css">
<title>LOGIN</title>
<style>
.img
{

  background-image: url("1.png");
background-position: center center;
  background-repeat: no-repeat;
   background-attachment:fixed;
  background-size: cover;
  height:auto;
  width:100%;
}
.login
{
                
    background-position: left top;
    position:absolute;
    left:90px;
    border: 2px solid ; 
     background-color: #B0C4DE; 
     
      border-style: outset;
      color:blue;
      
}

.rcorners3 {
  border-radius: 25px;

  background-position: left top;
  background-repeat: repeat;

  padding:10px; 
  width: 150px;
  height:10px;  
   /* box-shadow: 10px 10px 5px grey; */
   border-style: outset;
   color:blue;
}

</style>
</head>

<body class="img">
<center><b>LOGIN</b></center></h3>
 	<form action="Login">
    <div class="container-fluid" >
    <div class="row" >
    	<b>Name:</b> <input type="text" name="User" class="rcorners3"></input><br><br>
   		<center> <button type="submit"  class="login">submit</button></center>
	</div>
    </form>
</body>
</html>