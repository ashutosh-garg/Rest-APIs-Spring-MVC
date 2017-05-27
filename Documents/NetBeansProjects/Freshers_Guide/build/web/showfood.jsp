<%-- 
    Document   : showservices
    Created on : 30 Mar, 2017, 9:25:54 AM
    Author     : hp
--%>
<%@page import="org.apache.catalina.util.Base64"%>
<%@page import="sun.misc.BASE64Encoder"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.io.ObjectOutputStream"%>
<%@page import="java.io.ByteArrayOutputStream"%>
<%@page import="java.lang.String"%>
<%@page import="com.mysql.jdbc.Blob"%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <%
   /* ByteArrayOutputStream ot = new ByteArrayOutputStream();
    ObjectOutputStream os = new ObjectOutputStream(ot);
    os.writeObject(request.getAttribute("imageData"));
    byte[] imgData=ot.toByteArray();*/
    String imgData=(String)request.getAttribute("imageString");
    String name=(String)request.getAttribute("name");
    String rentprice=(String)request.getAttribute("rentprice");
    String locality=(String)request.getAttribute("locality");
    String address=(String)request.getAttribute("address");
    String imgString="http://localhost:8084/Freshers_Guide/tiffinservices/"+imgData;
    %>
    <head>
        <style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #47B0CB;
}
#footer {
   position:fixed;
   bottom:0;
   width:100%;
   height:60px;
   background-color: #47B0CB;
}
li {
    float: right;
}
.bottom {
    float : middle;
}
li a {
    display: block;
    color: white;
    padding: 30px 15px;
    text-decoration: none;
}
li.title{
    float : left;
    text-align : center;
    color : white;
    padding: 30px 15px;
}
li a:hover {
    background-color: #899193;
}
</style>
    </head>
    <body>
<ul>
<li class="title"><font face="Comic Sans MS" size="5"><b>FRESHERS GUIDE</b></font></li>
<li><a href="Home.jsp">Logout</a></li>
<li><a href="contact.jsp">Call Us : (+91) 9672116541</a></li>
<li><a href="Registration_Form.jsp">Register</a></li>
<li><a href="Login_Form1.jsp">Login</a></li>
</ul>
<div>
<center>
    <h1 id="title" style="color:white;text-shadow :5px 5px 8px black; margin-bottom: 5%; padding : 150px; background-color : #DFDFDF;">Locality :<%= locality%><br><img src="<%=imgString%>"/><br> Name : <%= name%><br> Address : <%=address%><br> Rent Price : <%=rentprice%></h1>
</center>
</div>
<ul id="footer">
<li><a href="contact.jsp">Contact Us</a></li>
<li><a href="about.jsp">About Us</a></li>
<li><a href="terms.jsp">Privacy & Terms</a></li>
</ul>
</body>
  
</html>
