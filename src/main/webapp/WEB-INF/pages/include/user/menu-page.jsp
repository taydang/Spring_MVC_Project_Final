<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!--[if lte IE 8]>
    <p class="chromeframe">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a>.</p>
<![endif]-->

<div class="layer"></div>
<!-- Mobile menu overlay mask -->

<div id="preloader">
    <div data-loader="circle-side"></div>
</div><!-- End Preload -->

<!-- Header ================================================== -->
<header>
    <div class="container">
        <div class="row">
            <div class="col--md-3 col-sm-3 col-xs-3">
                <a href="<c:url value="../include/user/user-home.jsp"/>" id="logo">
                    <img src="<c:url value="/resources/img/logo.png"/>" width="190" height="23" alt="" data-retina="true">
                </a>
            </div>
            <nav class="col--md-9 col-sm-9 col-xs-9">
                <a class="cmn-toggle-switch cmn-toggle-switch__htx open_close" href="javascript:void(0);"><span>Menu mobile</span></a>
                <ul id="lang_top">
                    <li><a href="#" class="active">EN</a></li>
                    <li><a href="#">FR</a></li>
                    <li><a href="#">ES</a></li>
                </ul>
                <div class="main-menu">
                    <div id="header_menu">
                        <img src="<c:url value="/resources/img/logo_m.png"/>" width="141" height="40" alt="" data-retina="true">
                    </div>
                    <a href="#" class="open_close" id="close_in"><i class="icon_set_1_icon-77"></i></a>
                    <ul>
                        <li class="submenu">
                            <a href="javascript:void(0);" class="show-submenu">Home<i class="icon-down-open-mini"></i></a>
                            <ul>
                                <li><a href="<c:url value="/resources/pages/index.jsp"/>">Home Booking</a></li>
                                <li><a href="<c:url value="/resources/pages/index_5.jsp"/>">Home Booking date 2</a></li>
                                <li><a href="<c:url value="/resources/pages/index_4.jsp"/>">Home Carousel</a></li>
                                <li><a href="<c:url value="/resources/pages/index_2.jsp"/>">Home Layer Slider</a></li>
                                <li><a href="<c:url value="/resources/pages/index_6.jsp"/>">Home Video bg</a></li>
                                <li><a href="<c:url value="/resources/pages/index_3.jsp"/>">Home Text Rotator</a></li>
                            </ul>
                        </li>
                        <li><a href="<c:url value="/resources/pages/room_list.jsp"/>">Rooms</a></li>
                        <li class="submenu">
                            <a href="javascript:void(0);" class="show-submenu">Pages<i class="icon-down-open-mini"></i></a>
                            <ul>
                                <li><a href="<c:url value="/resources/header_2/index.jsp"/>">Header transparent</a></li>
                                <li><a href="<c:url value="/resources/pages/room_detail.jsp"/>">Room detail</a></li>
                                <li><a href="<c:url value="/resources/pages/room_detail_2.jsp"/>">Room detail date 2</a></li>
                                <li><a href="<c:url value="/resources/pages/about.jsp"/>">About us</a></li>
                                <li><a href="<c:url value="/resources/pages/faq.jsp"/>">Faq</a></li>
                                <li><a href="<c:url value="/resources/pages/gallery.jsp"/>">Gallery</a></li>
                                <li><a href="<c:url value="/resources/pages/blog.jsp"/>">Blog</a></li>
                                <li><a href="<c:url value="/resources/coming_soon/index.jsp"/>">Site launch/Coming soon</a></li>
                                <li><a href="<c:url value="/resources/pages/shortcodes.jsp"/>">Shortcodes</a></li>
                                <li><a href="<c:url value="/resources/pages/icon_pack_1.jsp"/>">Icon pack 1</a></li>
                                <li><a href="<c:url value="/resources/pages/icon_pack_2.jsp"/>">Icon pack 2</a></li>
                                <li><a href="<c:url value="/resources/pages/icon_pack_3.jsp"/>">Icon pack 3</a></li>
                            </ul>
                        </li>
                        <li><a href="<c:url value="/resources/pages/contacts.jsp"/>">Contacts</a></li>
                    </ul>
                </div><!-- End main-menu -->

            </nav>
        </div><!-- End row -->
    </div><!-- End container -->
</header>
<!-- End Header =============================================== -->

<!-- SubHeader =============================================== -->
<div class="parallax-window" id="booking" data-parallax="scroll" data-image-src="img/sub_header_home.jpg" data-natural-width="1400" data-natural-height="550">
    <div id="subheader_home">
        <div id="sub_content">
            <div id="book_container">
                <form method="post" action="<c:url value="/resources/assets/check_avail_home.php"/>" id="check_avail_home" autocomplete="off">
                    <div id="group_1">
                        <div id="container_1">
                            <label>Arrival date</label>
                            <input class="startDate1 form-control datepick" type="text" data-field="date" data-startend="start" data-startendelem=".endDate1" readonly placeholder="Arrival" id="check_in" name="check_in">
                            <span class="input-icon"><i class="icon-calendar-7"></i></span>
                        </div>
                        <div id="container_2">
                            <label>Departure date</label>
                            <input class="endDate1 form-control datepick" type="text" data-field="date" data-startend="end" data-startendelem=".startDate1" readonly placeholder="Departure" id="check_out" name="check_out" >
                            <span class="input-icon"><i class="icon-calendar-7"></i></span>
                        </div>
                    </div><!-- End group_1 -->
                    <div id="group_2">
                        <div id="container_3">
                            <label>Adults</label>
                            <div class="qty-buttons">
                                <input type="button" value="-" class="qtyminus" name="adults">
                                <input type="text" name="adults" id="adults" value="" class="qty form-control" placeholder="0">
                                <input type="button" value="+" class="qtyplus" name="adults">
                            </div>
                        </div>
                        <div id="container_4">
                            <label>Children</label>
                            <div class="qty-buttons">
                                <input type="button" value="-" class="qtyminus" name="children">
                                <input type="text" name="children" id="children" value="" class="qty form-control" placeholder="0">
                                <input type="button" value="+" class="qtyplus" name="children">
                            </div>
                        </div>
                    </div><!-- End group_2 -->
                    <div id="group_3">
                        <div id="container_5">
                            <label>Name</label>
                            <input type="text" class="form-control" name="name_booking" id="name_booking" placeholder="Name and Last name">
                        </div>
                        <div id="container_6">
                            <label>Email</label>
                            <input type="text" class="form-control" name="email_booking" id="email_booking" placeholder="Your email">
                        </div>
                    </div><!-- End group_3 -->
                    <div id="container_7">
                        <input type="submit" value="Check availability" class="btn_1" id="submit-booking">
                    </div>
                </form>
                <div id="message-booking"></div>
            </div><!-- End book_container -->
        </div><!-- End sub_content -->
    </div><!-- End subheader -->
</div><!-- End parallax-window -->
<!-- End SubHeader ============================================ -->