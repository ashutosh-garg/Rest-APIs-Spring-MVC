<html>
<head>
<script>
function validateUserId() {
    var x = document.forms["myForm"]["t2"].value;
    var letters = /^[a-zA-Z]+$/;
    if (x == "") {
        document.getElementById("checkuser").innerHTML = "Please fill out this field!";
        return false;
    } 
    else if (!x.match(/^[a-zA-Z]+$/)) 
    {
       document.getElementById("checkuser").innerHTML = "Name should contain only alphabets!";     
        return false;
    }
    else {
        return true;
    }
    
 }
function validateradio() {
    var radios = document.getElementsByName("yesno");
    var formValid = false;

    var i = 0;
    while (!formValid && i < radios.length) {
        if (radios[i].checked) formValid = true;
        i++;        
    }

    if (!formValid) alert("Must check some option!");
    return formValid;
}
function validateForm() {
    var x = document.forms["myForm"]["t1"].value;
    var letters = /^[a-zA-Z]+$/;
    if (x == "") {
        document.getElementById("check").innerHTML = "Please fill out this field!";
        return false;
    } 
    else if (!x.match(/^[a-zA-Z]+$/)) 
    {
       document.getElementById("check").innerHTML = "Name should contain only alphabets!";     
        return false;
    }
    else {
        return true;
    }
}
function validatePno()
{
 var x=document.forms["myForm"]["t5"].value;
 var n=x.length;
 if(n<10||n>10)
    {
	  document.getElementById("checkpno").innerHTML = "Enter a 10 digit number!";
          return false;
	}
 else if(n==10){
      document.getElementById("checkpno").innerHTML = "";
        return true;
    } 

 //var phoneno = /^\d{10}$/;  
  if(isNaN(x)||x.indexOf(" ")!=-1)  
        {  
		document.getElementById("checkpno1").innerHTML = "Phone number has to be numeric!";  
        return false;
        
        }  
      else  
        {  
          document.getElementById("checkpno1").innerHTML = "";  
         return true; 
        }  
}	  
function validateEid()
{
var x = document.forms["myForm"]["t3"].value;
    var atpos = x.indexOf("@");
    var dotpos = x.lastIndexOf(".");
    if (atpos<1 || dotpos<atpos+2 || dotpos+3>=x.length) {
        document.getElementById("checkeid").innerHTML = "Please enter a valid emailid.";
        return false;
    }
    else
	{
	document.getElementById("checkeid").innerHTML = "";
        return true;
	}
}
function validatePwd()
{

var x=document.forms["myForm"]["pwd"].value;
 var n=x.length;
 if(n<6)
    {
	  document.getElementById("checkpwd").innerHTML = "password length should be minimum 6";
        
	}
 else {
     document.getElementById("checkpwd").innerHTML = "";
        return true;
    } 
}
function MatchPwd()
{
var x = document.forms["myForm"]["pwd"].value;
var y = document.forms["myForm"]["pwd1"].value;
if(x!=y) {
        document.getElementById("checkpwd1").innerHTML = "passwords dont match";
		document.getElementById("pwd").value = "";
		document.getElementById("pwd1").value = "";
        myForm.pwd.focus();
        return false;}
		else
		document.getElementById("checkpwd1").innerHTML = "passwords match";
}
</script>
<style>
table {
    background-color: #DFDFDF;
    padding: 70px 50px;
    width : 800;
}input[type=submit] {
    padding: 5px 10px;
    text-decoration: none;
    margin: 0px 50px;
    cursor: pointer;    
}
input[type=radio] {
    
    
}
input[type=text], [type=email], [type=password] {
    width: 40%;
    padding: 12px 5px;
    margin: 8px 0px;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}
#footer {
   position:fixed;
   bottom:0;
   width:100%;
   height:60px;
   background-color: #47B0CB;
}
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
</style>
</head>
<body>
<ul>
<li class="title"><font face="Comic Sans MS" size="5"><b>FRESHERS GUIDE</b></font></li>
<li><a href="contact.jsp">Call Us : (+91) 9672116541</a></li>
<li><a href="Registration_Form.jsp">Register</a></li>
<li><a href="Login_Form1.jsp">Login</a></li>
<li><a href="Home.jsp">Home</a></li>
</ul>
<center>
<table>
<tr>
    <td>
    </td><td><font color="red-white" face="Comic Sans MS" size="6">Register</font><br><br></td></tr><tr><td>
<form action="MakeServiceEntry"  onSubmit="return validateForm()" name="myForm">
<input type="radio" name="type" value="user"> <font face="Comic Sans MS">User</td><td> <input type="radio" name="type" value="sp">Service Provider</font><br><br></td></tr>
<tr><td><font face="Comic Sans MS">Enter Full Name :</font></td><td>        <input style="border-radius : 4px" onfocusout="validateForm()" type="text" placeholder="enter full name" name="t1"></td><td><font color="red"><span id="check"></span></font><br></td></tr>
<tr><td><font face="Comic Sans MS">Enter Username  :</font></td><td>         <input style="border-radius : 4px" onfocusout="validateUserId()" type="text" placeholder="enter username" name="t2"></td><td><font color="red"><span id="checkuser"></span></font><br></td></tr>
<tr><td><font face="Comic Sans MS">Enter Email id  :</font></td><td>        <input  onfocusout="validateEid()" style="border-radius : 4px" type="email" placeholder="enter id" name="t3"></td><td><font color="red"><span id="checkeid"></span></font><br></td></tr>
<tr><td><font face="Comic Sans MS">Enter Password  :</font></td><td>         <input id="pwd" onfocusout="validatePwd()" style="border-radius : 4px" type="password" placeholder="enter password" name="t4"></td><td><font color="red"><span id="checkpwd"> </span></font><br></td></tr>
<tr><td><font face="Comic Sans MS">Re-Enter Password :</font></td><td>       <input  id="pwd1" onfocusout="MatchPwd()" style="border-radius : 4px" type="password" placeholder="re-enter password"></td><td><font color="red"><span id="checkpwd1"></span></font><br></td></tr>
<tr><td><font face="Comic Sans MS">Enter Contact Number:</font></td><td>    <input  onfocusout="validatePno()" style="border-radius : 4px" type="text" placeholder="enter contact number" name="t5"></td><td><font color="red"><span id="checkpno"></span><span id="checkpno1"></span></font><br></td></tr>
<tr><td></td><td><input style="border-radius : 4px" type="submit" value="submit" name="button"></td>
</form>
</tr>
</table>
</center>
<ul id="footer">
<li><a href="contact.jsp">Contact Us</a></li>
<li><a href="about.jsp">About Us</a></li>
<li><a href="terms.jsp">Privacy & Terms</a></li>
</ul>
</body>
</html>