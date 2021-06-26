<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <!-- BEGIN HEAD -->
    <head>
        <title>Spice Hotel</title>
        <jsp:include page="../include/management/css-page.jsp" />
    </head>
    <!-- END HEAD -->
    <body class="page-header-fixed sidemenu-closed-hidelogo page-content-white page-md header-white dark-sidebar-color logo-dark">
        <div class="page-wrapper">
            <!-- start header -->
            <jsp:include page="../include/management/header-page.jsp" />
            <!-- end header -->

            <!-- start page container -->
            <div class="page-container">
                <!-- start sidebar menu -->
                <jsp:include page="../include/management/sidebar-menu.jsp" />
                <!-- end sidebar menu --> 

                <!-- start page content -->
                <jsp:include page="../include/management/content-page.jsp" />
                <!-- end page content -->
                
                <!-- start chat sidebar -->
                <jsp:include page="../include/management/sidebar-chat.jsp" />
                <!-- end chat sidebar -->
            </div>
            <!-- end page container -->
            
            <!-- start footer -->
            <jsp:include page="../include/management/footer-page.jsp" />
            <!-- end footer -->
        </div>
        <!-- start js include path -->
        <jsp:include page="../include/management/js-page.jsp" />
        <!-- end js include path -->
    </body>
</html>