<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!--[if IE 9]><html class="ie ie9"> <![endif]-->
<html>
    <head>                    
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="keywords" content="hotel, bed and breakfast, accommodations, travel, motel">
        <meta name="description" content="FC Recom - Hotel and Bed&amp;Breakfast">
        <meta name="author" content="Ansonika">
        <title>FC Recom - Hotel</title>

        <jsp:include page="../include/user/css-page.jsp" />

    </head>

    <body>
        <!--[if lte IE 8]>
             <p class="chromeframe">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a>.</p>
         <![endif]-->

        <div class="layer"></div>
        <!-- Mobile menu overlay mask -->

        <div id="preloader">
            <div data-loader="circle-side"></div>
        </div><!-- End Preload -->

        <jsp:include page="../include/user/menu-page.jsp" />
        
        <jsp:include page="../include/user/subheader-page.jsp" />
        

        <jsp:include page="../include/user/container-page.jsp" />
        
        <div id="dtBox"></div><!-- End datepicker -->

        <jsp:include page="../include/user/footer-page.jsp" />

        <div id="toTop"></div><!-- Back to top button -->

        <jsp:include page="../include/user/js-page.jsp" />
    </body>
</html>