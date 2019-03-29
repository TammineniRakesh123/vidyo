<%@page import="java.util.ArrayList"%>
<%@page import="com.beans.ShareParameters"%>
<%@page import="com.user.Login"%>
<%@page import="com.user.Meeting_Creation"%>
<%@page import="com.user.Connector"%>
<%@page import="com.user.TokenGenerator"%>

<html>
<head>

  <title>Vidyo Sample</title>
  <meta http-equiv="content-type" content="text/html; charset=utf-8" />
  <meta http-equiv="refresh" content="30" >
  <style>
  div#header {
  padding: 10px;
  color: white;
  background-color: black;
}
</style>
</head>
<body>
<%

 String token;
 String name;
 String resourceId;
if(Connector.Name==null)
{
	token=ShareParameters.localtoken;
	name=Login.participant;
	resourceId=Meeting_Creation.Roomname;
}
else
{
	token=Connector.tokenid;
	name=Connector.Name;
	resourceId=Connector.RoomName;
}
out.print(" <h1>");
out.print("no of people conntected---"+"  "+Connector.count);
out.print("</h1>");
for(int i=0;i<Login.part1.size();i++)
{
	out.print("<br />");
	out.print(Login.part1.get(i));

}

%>
<script>
var value = "<%=token%>";
var name = "<%=name%>";
var resourceId = "<%=resourceId%>";
</script>

 <script type="application/javascript" src="VideoPlay.js"></script>
  <script src="https://static.vidyo.io/latest/javascript/VidyoClient/VidyoClient.js?onload=onVidyoClientLoaded"></script>
  
 <h3>Hello Vidyo!</h3>
 <button onclick="joinCall()">Connect</button>
 <div id="renderer"></div>
</body>
</html>