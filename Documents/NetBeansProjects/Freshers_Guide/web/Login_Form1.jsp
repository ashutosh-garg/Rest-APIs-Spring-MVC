<html>
<head>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
table {
    background-color: #DFDFDF;
    padding : 200px;
    width : 200;
}
#footer {
   position:fixed;
   bottom:0;
   width:100%;
   height:60px;
   background-color: #47B0CB;
}
#bottom
{
   float : center;}
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #47B0CB;
}
li {
    float: right;
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
.fa {
  padding: 20px;
  font-size: 30px;
  width: 50px;
  text-align: center;
  text-decoration: none;
   border-radius: 30%;
}
form {
    
margin: 20px 50px;    
    
    
}
div1 {
    margin:20px 50px;}
input[type=submit] {
    
   
    
    padding: 5px 35px;
    text-decoration: none;
    margin: 15px 110px;
    cursor: pointer;
   
}
.fa:hover {
    opacity: 0.7;
}

.fa-facebook {
  background: #3B5998;
  color: white;
}
.fa-google {
  background: #dd4b39;
  color: white;
}

</style>
<script>
function validateform(){  
var name=document.myform.name.value;  
  
  
if (name==null || name==""){  
   
 document.getElementById("check").innerHTML="cannot be blank";
  return false;}
else
	document.getElementById("check").innerHTML="";
  }
 function validateform1(){

var password=document.myform.password.value;
 if(password.length<6){  
  document.getElementById("check1").innerHTML="password length should be atleast 6 characters";  
  return false;  
  }  
  else
  document.getElementById("check1").innerHTML="";
 
 } 
</script>
</head>
<body>
<ul>
<li class="title"><font face="Comic Sans MS" size="5"><b>FRESHERS GUIDE</b></font></li>
<li><a href="contact.jsp">Call Us : (+91) 9672116541</a></li>
<li><a href="Registration_Form.jsp">Register</a></li>
<li><a href="Home.jsp">Home</a></li>
</ul>
<center>
<table>
<tr>
   <td>
    <center>
   <span style="color:blue"><b><font size="4">LOGIN BY YOUR SOCIAL ACCOUNT</font></b></span><br><br> 
    <a href="#" class="fa fa-facebook"></a>
    <a href="#" class="fa fa-google"></a><br><br><hr><br>
    </center>
   </td>
</tr>
<tr>
    <td>
        <span style="color:blue"><b><font size="4"><div1>HAVE AN ACCOUNT?</div1></font></b></span><br>
<form name="myform" method="post" action="UserValidation" onsubmit="return validateform()" >  
    <center>
<b>Username</b> <input onfocusout="validateform()" type="text" name="name" placeholder="enter username"><font color="red"><span id="check">                              </span></font> <br><br>  
<b>Password</b> <input onfocusout="validateform1()" type="password" name="password" placeholder="enter password"><font color="red"><span id="check1">                                              </span></font>   
</center>     
     </td>
</tr>
<tr>
    <td><input type="submit" value="LOGIN">  
        </td>
</tr>
</tr>
<tr>
<td>
<br/><br/>
     <div1>Not Registered yet?<a href="Registration_Form.jsp">Create an account</div1></a></font></form> 
</td>
</tr>
</table>
</center>
<ul id="footer">
<div id="bottom">
<li><a href="contact.jsp">Contact Us</a></li>
<li><a href="about.jsp">About Us</a></li>
<li><a href="terms.jsp">Privacy & Terms</a></li>
</div>
</ul>
</body>
</html>