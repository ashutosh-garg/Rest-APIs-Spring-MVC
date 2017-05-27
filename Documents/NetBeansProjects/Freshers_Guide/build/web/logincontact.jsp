<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            ul{
                list-style-type: none;
                margin: 0;
                padding: 0;
                overflow: hidden;
                background-color: #47B0CB;
            } 
            li.title{
                float : left;
                text-align : center;
                color : white;
                padding: 30px 15px;
            }
            li {
                float: right;
            }
            li a {
                display: block;
                color: white;
                padding: 30px 15px;
                text-decoration: none;
            }
            #footer {
                position:fixed;
                bottom:0;
                width:100%;
                height:60px;
                background-color: #47B0CB;
            }
            li a:hover {
                background-color: #899193;
            }
        </style>
    </head>
    <body>
        <ul>
            <li class="title"><font face="Comic Sans MS" size="5"><b>CONTACT US</b></font></li>
            <li><a href="loginhome.jsp">Home</a></li>
        </ul>
        <center>
            <h1 style="color:white;text-shadow:5px 5px 8px black;margin-top:2%;padding:100px;background-color:#dfdfdf">&quot;CUSTOMER SUPPORT&quot;<p>Thank you for using Fresher&#39;s Guide. Please do contact us for any queries. Your problems and feedbacks are important to us.<p>Call Us : (+91) 9672116541</p></p></h1>
        </center>
    <ul id="footer">
        <li><a href="logincontact.jsp">Contact Us</a></li>
        <li><a href="loginabout.jsp">About Us</a></li>
        <li><a href="loginterms.jsp">Privacy & Terms</a></li>
    </ul>
    </body>
</html>
