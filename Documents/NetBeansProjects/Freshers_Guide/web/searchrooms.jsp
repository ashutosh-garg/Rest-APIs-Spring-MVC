<%-- 
    Document   : location
    Created on : 17 Mar, 2017, 2:47:35 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<title> Fresher's Guide</title>
<style type="text/css">
.header{
    margin-left: 42%   
    }
body{background-image:url("rentalshow.jpg");
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
		
select{
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
button{
	width: 280px;
	height: 35px;
	background: #fff;
	border: 1px solid #fff;
	cursor: pointer;
	border-radius: 2px;
	color: #a18d6c;
	font-family: 'Exo', sans-serif;
	font-size: 16px;
	font-weight: 400;
	padding: 6px;
	margin-top: 10px;
	filtre:blur(5px);
}

table{ text-align:center;
		border:2px solid;
		vertical-align:middle;
		align:center-right;
		height:20px;
		padding:35px;
		background-image:url(hex.jpg);
		border-radius:13px;
		opacity:0.5;
		filtre:alpha(opacity=50)
		}
		.location input[type=button]:hover{
	opacity: 0.6;		
}
.location input[type=button]:hover{
	opacity:0.8;
}

Select:hover{
			background-color:gray;
}
option:hover{
			background-color:pink;
			opacity:0.5;
}
</style>
</head>
<body>
    <h1 class="header" style="margin-top:0 "><font face="Comic Sans MS" color="#336eff">Search Rooms</font></p></h1>
<div class="location">
<center>
    <form action="ShowFoodDetails">
<table >
<tr>
<td><select name="h">
<option value="-1" selected>Select your city</option>
<option value="1" >Indore</option>
<option value="1" >Bhopal</option>
</select>
</td></tr>
<tr>
<td><select name="locality" placeholder="Select Locality" >
<option value="-1" >Select Locality</option>
<option value="Vallabh_Nagar" >Vallabh_Nagar</option>
<option value="Rani_Sati_Gate" >Rani_Sati_Gate</option>
<option value="Janjeer_Wala_Square" >Janjeer_Wala_Square</option>
<option value="Malwa_Mill_Region" >Malwa_Mill_Region</option>
</select></td>
</tr>
<tr>
<td><input type="submit" value="Submit"/></td>
</tr>
</table>
    </form>
</center>
</div>
<hr>
</body>
</html>
