

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta content="width=device-width, initial-scale=1" name="viewport" />
        <meta name="description" content="Responsive Admin Template" />
        <meta name="author" content="SmartUniversity" />
        <title>Admin Royal Hotel </title>
        <jsp:include page="../include/management/css-page.jsp" />

    </head>
    <body class="page-header-fixed sidemenu-closed-hidelogo page-content-white page-md header-white dark-sidebar-color logo-dark">
        <div class="page-wrapper">
            <!-- start header -->
            <jsp:include page="../include/management/menu-page.jsp" />
            <!-- end header -->
            
             <!-- start page container -->
            <jsp:include page="../include/management/container-page.jsp" />
             <!-- end page container -->
             
            <jsp:include page="../include/management/footer-page.jsp" />
        </div>
        <jsp:include page="../include/management/js-page.jsp" />
    </body>
</html>
