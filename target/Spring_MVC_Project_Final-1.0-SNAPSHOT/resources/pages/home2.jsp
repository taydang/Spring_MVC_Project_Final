<%-- 
    Document   : welcomePage
    Created on : Jun 9, 2020, 10:09:35 AM
    Author     : ldanh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Message : <span>${message}</span></h2>
        <jsp:include page="include/menu.jsp"/>
    </body>
</html>
