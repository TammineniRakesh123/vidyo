<%@page import="java.util.Iterator"%>
<%@page import="com.beans.Add_Invitee_bean"%>
<%@page import="com.user.Add_Invitee"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.user.Meeting_Creation"%>
<%@page import="com.user.Data_users"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


  <script src = "https://code.jquery.com/jquery-1.10.2.js"></script>
  <script src = "https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
  <link rel="stylesheet" type="text/css" media="screen" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.7.2/themes/base/jquery-ui.css">

<title>Meeting</title>
<style>
.rcorners3 {
  border-radius: 25px;

  background-position: left top;
  background-repeat: repeat;
  padding:10px; 
  width: 150px;
  height:10px;  
  box-shadow: 10px 10px 5px grey;
   border-style: outset;
   }
.img
{ 

  background-image: url("vidyoo.png");
  background-repeat: no-repeat;
  background-attachment:fixed;
  background-size: cover;
  height:100%;
}
input
{
       width:150px;
}

td{
    
    padding-top: .8em;    
    padding-bottom: .5em;
    padding-left: .5em;

}

.create
{
    position:absolute;
    left:120px;
    border: 1px solid ;
    background-color: #808B96;
    box-shadow: 10px 10px 5px grey;
   border-style: outset;
   
}
.add
{
  position:absolute;
    left:80px;
    border: 1px solid ; 
     background-color: #808B96; 
     box-shadow: 10px 10px 5px grey;
     border-style: outset;  

}
</style>
</head>

<body class="img">
<h3><center>MEETING CREATION</center></h3>                       
                        
<form action="Meeting_Creation">
<div class="container-fluid" >
<div class="row" >
<table class="t1">
       <tr>
      <td><b> Date:</b></td>
      <td> <center><input type="date" name="date" class="rcorners3"></input></center></td></br>
      </tr>

      <tr>

      <td><b> Time:</b> </td>
      <td><center><input type="time" name="time" class="rcorners3"></input></center></td></br>
      </tr>
      
       <tr>

      <td><b> Room name:</b> </td>
      <td><center><input type="text" name="Roomname" class="rcorners3"></input></center></td></br>
      </tr>
       
       
       <tr>
              <td valign='top'>
              <b>Description:</b></td>
              <td><center><textarea id="textarea" name="Discription" rows="5" cols="20" class="box"></textarea></center></td>
            </tr>


        <tr>
              <td></td>

      <td><center><input type="submit" value="create" class="create" class="rcorners3"></input></center></td>
</tr>
</table>
</div>
</div>


</form>
<form action="Add_Invitee">
<div class="container-fluid" >
	<div class="row" >
		<div class="col-lg-12 col-sm-12 col-xs-12 col-md-12" >

			<table>
			    <tr>
			
			     <td><b>Invitee:</b></td>
			     <td><center><input type="text" name="invitees" class="rcorners3"></input></center></td><br>
			     </tr>
			
			
			      <% 
			      out.println("<table>");
			      out.println("<td><b>" + "Sno" +"</td>");
			      out.println("<td><b>" + "Participant" + "</td>");
			      out.print("<tr>"+"</tr>");
			      int j=0;
			     
			     
			     for(int i=0;i<Add_Invitee_bean.participant.size();i++)
			      {
			   		j++;	    
			   		out.println("<td>" +j + "</td>");
			           out.println("<td>" + Add_Invitee_bean.participant.get(i) + "</td>");        
			   		out.print("<tr>"+"</tr>");
			   	}   
			      out.println("</table>");
				%>
				
			
      			  <tr>
            	  <td></td>
       			 <td><center> <input type="submit" value="add"  class="add"></input></center></td>
      		  </tr>
			</table>
			</div>
		</div>
	</div>
</form>
</body>
</html>