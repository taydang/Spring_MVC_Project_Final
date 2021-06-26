<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!-- Header ================================================== -->
<header>
    <div class="container">
        <div class="row">
            <div class="col--md-3 col-sm-3 col-xs-3">
                <a href="home" id="logo">
                    <img src="./resources/img/logo.png" width="190" height="23" alt="" data-retina="true">
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
                        <img src="./resources/img/logo_m.png" width="141" height="40" alt="" data-retina="true">
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
                        <li><a href="<c:url value="/admin/home.jsp"/>">Management</a></li>
                        <li><a href="contacts.html">About Us</a></li>
                    </ul>
                </div><!-- End main-menu -->

            </nav>
        </div><!-- End row -->
    </div><!-- End container -->
</header>
<!-- End Header =============================================== -->

<!-- SubHeader =============================================== -->
<div class="parallax-window" id="booking" data-parallax="scroll" data-image-src="./resources/img/sub_header_home.jpg" data-natural-width="1400" data-natural-height="550">
    <div id="subheader_home">
        <div id="sub_content">
            <div id="book_container">
                <form method="post" action="assets/check_avail_home.php" id="check_avail_home" autocomplete="off">
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

