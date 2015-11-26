<%-- 
    Document   : read
    Created on : Nov 25, 2015, 8:46:38 PM
    Author     : shylaruppert
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <%String table = (String) request.getAttribute("table"); %>
    
    <body>
        <h1>Places I have been to</h1>
        <%= table%>
    </body>
</html>
