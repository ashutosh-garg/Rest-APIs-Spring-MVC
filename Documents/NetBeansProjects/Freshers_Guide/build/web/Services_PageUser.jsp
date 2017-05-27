<%-- 
    Document   : Services_Page2
    Created on : 23 Mar, 2017, 12:24:37 PM
    Author     : hp
--%>
<%
        String s=(String)session.getAttribute("username");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
.drpbtn{
    cursor : pointer;
}
.dropdown {
    position: relative;
    display: inline-block;
    float : right;
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
.nav:hover .dropdown-content {
    display: block;
}
.dropdown:hover .dropbtn {
    background-color: #3e8e41;
}
</style>
</head>
<body>
<ul>
<li class="title"><font face="Comic Sans MS" size="5"><b>FRESHERS GUIDE</b></font></li>
<li><a href="Logout">Logout</a></li>
<li><a href="logincontact.jsp">Call Us : (+91) 9672116541</a></li>
<div class="dropdown">
    <div class="nav">
<li><a href="searchfood.jsp">Search Food</a></li>
<li><a href="searchrooms.jsp">Search Rooms</a></li>
<li><a href="loginhome.jsp">Home</a></li>
<li><a ><font face="Comic Sans MS">Hello <%=s%></font></a></li>
</div></div>
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
