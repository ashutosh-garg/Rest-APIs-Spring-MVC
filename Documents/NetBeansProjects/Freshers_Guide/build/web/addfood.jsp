<!doctype html>
<%
        String s=(String)session.getAttribute("username");
%>
<html>
<head>
<title>Fresher's Guide</title>
<link class="jsbin" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1/themes/base/jquery-ui.css" rel="stylesheet" type="text/css" />
<script class="jsbin" src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<script class="jsbin" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.0/jquery-ui.min.js"></script>
<script>
function validateName(){
         var x=document.getElementById("name").value;
         if(x<1){
             document.getElementById("nm").innerHTML="Enter name first!";
             return false;
         }
         else{
             document.getElementById("nm").innerHTML="";
             return true;
         } 
}
function validateRent()
{
 var x=document.getElementById("price").value;
  if(isNaN(x)||x.indexOf(" ")!=-1)  
        {  
	  document.getElementById("ren").innerHTML = "Rent has to be numeric";  
          return false;
        
        }
  else if(x<1||x>100000)	
      {
	  document.getElementById("ren").innerHTML="Rent amount invalid.";  
          return false;
      }
   else
       {
	   document.getElementById("ren").innerHTML = "";
           return true;
        }	  
 }	  
function valid()
            {
	alert("Information added successfully");
		 document.location.href = "Login_Form1.jsp";
    }
function readURL(input) {
        if (input.files && input.files[0]) {
            var reader = new FileReader();

            reader.onload = function (e) {
                $('#blah')
                    .attr('src', e.target.result)
                    .width(280)
                    .height(200);
            };

            reader.readAsDataURL(input.files[0]);
        }
    }
function validateDrop()
	{
	 var x=document.getElementById("h1").value; 
	 if(x==-1)
         {
		 document.getElementById("dr").innerHTML = "Please select a locality.";
                   return false;		 
         }
	 else
         return true;		
	}
function validateAdd()
{
        var r;
        r=document.getElementById("add").value;
        if(r.length>40 || r.length<1)
	{
	 document.getElementById("ad").innerHTML = "The Address should be less than 40 Characters!";
         return false;		
	}
	else
	return true;
}
</script>
<style type="text/css">
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
body{background-image:url("m.jpg");
	position: absolute;
	top: 100px;
	left: 20px;
	right:40px;
	bottom: 40px;
	width: auto;
	height: auto;
	opacity:0.8;
	background-size: cover;
		}
		
		
		textarea{
		width:280px;
		height:250px
		align:left;
		background: transparent;
		color: #fff;
		font-family: 'Exo', sans-serif;
		font-size: 16px;
		font-weight: 400;
		padding: 4px;
		}
		
		
select,input{
	width: 280px;
	align:left;
	height: 30px;
	background: transparent;
	border: 1px solid rgba(255,255,255,0.6);
	border-radius: 2px;
	color: #fff;
	font-family: 'Exo', sans-serif;
	font-size: 16px;
	font-weight: 400;
	padding: 4px;
}

td{
	align:left;
	height: 30px;
	background: transparent;
	color: #fff;
	font-family: 'Exo', sans-serif;
	font-size: 16px;
	font-weight: 400;
	padding: 4px;
}
button{
	width: 280px;
	height: 35px;
	background: #fff;
	border: 1px solid #fff;
	cursor: pointer;
	border-radius: 2px;
	color: #336eff;
	font-family: 'Exo', sans-serif;
	font-size: 16px;
	font-weight: 400;
	padding: 6px;
	margin-top: 10px;
	filtre:blur(5px);
}

table{ 
		border:2px solid;
		vertical-align:middle;
		align:center-right;
		height:20px;
		padding:35px;
		background-image:url(hex.jpg);
		border-radius:13px;
		opacity : 0.8;
		filtre:alpha(opacity=50)
		}
		.location input[type=button]:hover{
	opacity: 0.6;		
}
textarea:hover{
	background-color:gray;
	opacity:0.8;
}

Select:hover{
			background-color:gray;
			opacity:0.8;
}

input:hover{
			background-color:gray;
			opacity:0.8;
}
option:hover{
			background-color:pink;
			opacity:0.5;
}
button:hover{
			background-color:#336eff;
			opacity:1;
                        color : white;
}
.header{
    margin-left: 40%   
    }
</style>
</head>
<body>
    <h1 class="header" style="margin-top:0 "><font face="Comic Sans MS" color="#336eff">Add Tiffin Services</font></p></h1>
<div class="location">
    <center>
    <form action="MakeFoodEntry" method="post" onSubmit="valid()">
<table >
<tr>
			<td>ADD an image :</td>
			<td>
			<input type='file' name="imageurl" onchange="readURL(this);" /></td>
				<td>
					<img id="blah" width="200px" height="150px" src="15.jpg" alt="your image">
				</td>
			</tr>
                        <tr><td>Enter Name :</td><td><input name="name" id="name" type="text" placeholder="Enter Name" onfocusout="validateName()"/></td><td><font color="red"><p id="nm"></p></font></td></tr>
                        <tr><td>Enter Monthly Meal Price :</td><td><input name="price" type="text" id="price" onfocusout="validateRent()" onclick="changeimg();" placeholder="Rent Price " required /></td><td><font color="red"><p id="ren"></p></font></td></tr>
                        <tr><td>Select Locality :</td><td><select name="locality" id="h1" onfocusout="validateDrop()">
				<option value="-1" selected>Select Locality</option>
				<option value="Vallabh_Nagar" >Vallabh_Nagar</option>
				<option value="Rani_Sati_Gate" >Rani_Sati_Gate</option>
				<option value="Janjeer_Wala_Square" >Janjeer_Wala_Square</option>
				<option value="Malwa_Mill_Region" >Malwa_Mill_Region</option>
				</select></td><td><font color="red"><p id="dr"></p></font></td>
			</tr>
                        <tr><td></td>
<td><button name="button"  type="submit" >Submit</button></td>
</tr>
</table>
</form>
</center>
</div>
<hr>
</body>
</html>
