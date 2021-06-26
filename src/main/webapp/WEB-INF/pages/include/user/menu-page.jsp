<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!-- Header ================================================== -->
<header>
    <div class="container">
        <div class="row">
            <div class="col--md-3 col-sm-3 col-xs-3">
                <a href="home" id="logo">
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
                            <a href="room_list" class="show-submenu">Room Type<i class="icon-down-open-mini"></i></a>
                            <ul>
                                <li><a href="index.jsp">Single Room</a></li>
                                <li><a href="index_5.jsp">Double Room</a></li>
                                <li><a href="index_4.jsp">Double Room Luxury</a></li>
                                <li><a href="index_2.jsp">Suite Room</a></li>
                            </ul>
                        </li>

                        <li class="submenu">
                            <a href="javascript:void(0);" class="show-submenu">Home<i class="icon-down-open-mini"></i></a>
                            <ul>
                                <li><a href="index.jsp">Home Booking</a></li>
                                <li><a href="index_5.html">Home Booking date 2</a></li>
                                <li><a href="index_4.html">Home Carousel</a></li>
                                <li><a href="index_2.html">Home Layer Slider</a></li>
                                <li><a href="index_6.html">Home Video bbg</a></li>
                                <li><a href="index_3.html">Home Text Rotator</a></li>
                            </ul>
                        </li>
                        <li><a href="room_list.html">Rooms</a></li>
                        <li class="submenu">
                            <a href="javascript:void(0);" class="show-submenu">Pages<i class="icon-down-open-mini"></i></a>
                            <ul>
                                <li><a href="header_2/index.html">Header transparent</a></li>
                                <li><a href="room_detail.html">Room detail</a></li>
                                <li><a href="room_detail_2.html">Room detail date 2</a></li>
                                <li><a href="about.html">About us</a></li>
                                <li><a href="faq.html">Faq</a></li>
                                <li><a href="gallery.html">Gallery</a></li>
                                <li><a href="blog.html">Blog</a></li>
                                <li><a href="coming_soon/index.html">Site launch/Coming soon</a></li>
                                <li><a href="shortcodes.html">Shortcodes</a></li>
                                <li><a href="icon_pack_1.html">Icon pack 1</a></li>
                                <li><a href="icon_pack_2.html">Icon pack 2</a></li>
                                <li><a href="icon_pack_3.html">Icon pack 3</a></li>
                            </ul>
                        </li>
                        <li><a href="contacts.html">Contacts</a></li>
                        <li><a href="<c:url value="/admin/home"/>">Management</a></li>
                        <li><a href="contacts.html">About Us</a></li>
                    </ul>
                </div><!-- End main-menu -->

            </nav>
        </div><!-- End row -->
    </div><!-- End container -->
</header>
<!-- End Header =============================================== -->


