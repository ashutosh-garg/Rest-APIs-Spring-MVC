<%-- 
    Document   : logout
    Created on : 30 Mar, 2017, 4:45:48 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            session.invalidate();
            RequestDispatcher rd=request.getRequestDispatcher("Home.jsp");
               rd.forward(request, response);%>
    </body>
</html>
