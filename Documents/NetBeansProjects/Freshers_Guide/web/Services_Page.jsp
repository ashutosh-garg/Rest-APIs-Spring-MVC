<%-- 
    Document   : Services_Page
    Created on : 2 Mar, 2017, 2:30:21 AM
    Author     : hp
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
        String s=(String)session.getAttribute("username");
        
%>
<!DOCTYPE html>
<html>
<head>
<style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: visible;
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
    text-align: center;
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
li.dropbtn {
    background-color: #47B0CB;
    color: white;
    padding: 30px 15px;
    border: none;
    cursor: pointer;
    float : right;
}

div.dropdown {
    position: relative;
    display: inline-block;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}

.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
}

.dropdown-content a:hover {background-color: #f1f1f1}

.dropdown:hover .dropdown-content {
    display: block;
    margin-top: 70%;
}
.dropdown:hover .dropbtn {
    background-color: #899193;
}
</style>
</head>
<body>
<%
if(s.equals(null))
    {
        response.sendRedirect("Login_Form1.jsp");}
%>
<ul>
<li class="title"><font face="Comic Sans MS" size="5"><b>FRESHERS GUIDE</b></font></li>
<li><a href="Logout">Logout</a></li>
<li><a href="logincontact.jsp">Call Us : (+91) 9672116541</a></li>
<div class="dropdown">
<li class="dropbtn"><a href="">Add Services</a></li>
    <div class="dropdown-content">
    <a href="addrooms.jsp">Room Services</a>
    <a href="addfood.jsp">Mess Services</a>
    </div>
    <!--<a href="">Home Food Services</a>-->
</div>
<li><a href="loginhome.jsp">Home</a></li>
<li><a ><font size="4" face="Comic Sans MS">Hello <%=s%></font></a></li>
</ul>
<center>
<h1 id="title" style="color:white; text-shadow :5px 5px 8px black; margin : 5%; padding : 150px; background-color : #DFDFDF;">"Explore the range of services here!"</h1>
</center>
<ul id="footer">
<li><a href="logincontact.jsp">Contact Us</a></li>
<li><a href="loginabout.jsp">About Us</a></li>
<li><a href="loginterms.jsp">Privacy & Terms</a></li>
</ul>
</body>
</html>
