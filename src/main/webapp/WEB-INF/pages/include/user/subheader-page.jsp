<%-- 
    Document   : subheader-page
    Created on : Jun 26, 2021, 8:22:47 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- SubHeader =============================================== -->
<div class="parallax-window" id="booking" data-parallax="scroll" data-image-src="<c:url value="/resources/img/sub_header_home.jpg"/>" data-natural-width="1400" data-natural-height="550">
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