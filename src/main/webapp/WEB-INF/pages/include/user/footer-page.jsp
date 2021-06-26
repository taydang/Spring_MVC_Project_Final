<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


    <footer >
        <div class="container">
            <div class="row">
                <div class="col-md-4 col-sm-12">
                    <img src="<c:url value="/resources/img/logo_footer.png"/>" width="141" height="40" alt="" id="logo_footer" data-retina="true">
					<ul id="contact_details_footer">
          				<li>Route de Sablet 1023, Marseille<br>France 01920</li>
                        <li><a href="tel://004542344599">+45 423 445 998</a> / <a href="#0"><script data-cfhash='f9e31' type="text/javascript">/* <![CDATA[ */!function(t,e,r,n,c,a,p){try{t=document.currentScript||function(){for(t=document.getElementsByTagName('script'),e=t.length;e--;)if(t[e].getAttribute('data-cfhash'))return t[e]}();if(t&&(c=t.previousSibling)){p=t.parentNode;if(a=c.getAttribute('data-cfemail')){for(e='',r='0x'+a.substr(0,2)|0,n=2;a.length-n;n+=2)e+='%'+('0'+('0x'+a.substr(n,2)^r).toString(16)).slice(-2);p.replaceChild(document.createTextNode(decodeURIComponent(e)),c)}p.removeChild(t)}}catch(u){}}()/* ]]> */</script></a></li>
                    </ul>  
                </div>
                <div class="col-md-2 col-sm-4">
                    <h3>About</h3>
                    <ul>
                        <li><a href="#">About us</a></li>
                        <li><a href="#">Rooms</a></li>
                        <li><a href="#">Activities</a></li>
                        <li><a href="#">Contact us</a></li>
                         <li><a href="#">Gallery</a></li>
                    </ul>
                </div>                
                <div class="col-md-3 col-sm-4">
                    <h3>Change language</h3>
                   <ul>
                        <li><a href="#">English</a></li>
                        <li><a href="#">French</a></li>
                        <li><a href="#">Spanish</a></li>
                    </ul>
                </div>
                <div class="col-md-3 col-sm-4"  id="newsletter">
                    <h3>Newsletter</h3>
                    <p>Join our newsletter to keep be informed about offers and news.</p>
					<div id="message-newsletter_2"></div>
                                        <form method="post" action="<c:url value="/resources/assets/newsletter.php"/>" name="newsletter_2" id="newsletter_2">
                        <div class="form-group">
                            <input name="email_newsletter_2" id="email_newsletter_2"  type="email" value=""  placeholder="Your mail" class="form-control">
                          </div>
                            <input type="submit" value="Subscribe" class="btn_1 white" id="submit-newsletter_2">
                    	</form>
                </div>
            </div><!-- End row -->
            <div class="row">
                <div class="col-md-12">
                    <div id="social_footer">
                        <ul>
                            <li><a href="#"><i class="icon-facebook"></i></a></li>
                            <li><a href="#"><i class="icon-twitter"></i></a></li>
                            <li><a href="#"><i class="icon-google"></i></a></li>
                            <li><a href="#"><i class="icon-instagram"></i></a></li>
                            <li><a href="#"><i class="icon-pinterest"></i></a></li>
                            <li><a href="#"><i class="icon-vimeo"></i></a></li>
                            <li><a href="#"><i class="icon-youtube-play"></i></a></li>
                        </ul>
                          <p>Copyright © 2016 <a target="_blank" title="Free CSS Themes" href="http://freecssthemes.com/">FreeCSSThemes</a>  |  All Right Reserved</p>

                    </div>
                </div>
            </div><!-- End row -->
        </div><!-- End container -->
    </footer><!-- End footer -->

<div id="toTop"></div><!-- Back to top button -->