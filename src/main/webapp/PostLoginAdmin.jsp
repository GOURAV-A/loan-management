<!DOCTYPE html>
<html lang="zxx">
<head>
<title>LOANS2GO Project</title>
<meta charset="UTF-8">
<meta name="description" content="loans HTML Template">
<meta name="keywords" content="loans, html">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- Favicon -->
<link href="img/favicon.ico" rel="shortcut icon" />

<!-- Google font -->
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i&display=swap"
	rel="stylesheet">

<!-- Stylesheets -->
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/font-awesome.min.css" />
<link rel="stylesheet" href="css/owl.carousel.min.css" />
<link rel="stylesheet" href="css/flaticon.css" />
<link rel="stylesheet" href="css/slicknav.min.css" />

<!-- Main Stylesheets -->
<link rel="stylesheet" href="css/style.css" />


<!--[if lt IE 9]>
		<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
		<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	<![endif]-->
	<script>
(function() {

    const idleDurationSecs = 120000;    // X number of seconds
    const redirectUrl = 'index.html';  // Redirect idle users to this URL
    let idleTimeout; // variable to hold the timeout, do not modify

    const resetIdleTimeout = function() {

        // Clears the existing timeout
        if(idleTimeout) clearTimeout(idleTimeout);

        // Set a new idle timeout to load the redirectUrl after idleDurationSecs
        idleTimeout = setTimeout(() => location.href = redirectUrl, idleDurationSecs);
    };

    // Init on page load
    resetIdleTimeout();

    // Reset the idle timeout on any of the events listed below
    ['click', 'touchstart', 'mousemove'].forEach(evt =>
        document.addEventListener(evt, resetIdleTimeout, false)
    );

})();
</script>

</head>
<body>
	<!-- Page Preloder -->
	<div id="preloder">
		<div class="loader"></div>
	</div>

	<!-- Header Section -->
	<header class="header-section">
		<a href="index.html" class="site-logo"> <img src="img/logo.png"
			alt="">
		</a>
		<nav class="header-nav">
			<ul class="main-menu">
			<li><a href="#" >Export Loan Detail Reports</a>
			
			<ul class="sub-menu">
			<li><form action="#" method="post"><input type="submit" value="Vehicle Loan Reports     "></form></li>
			<li><form action="#" method="post"><input type="submit" value="Education Loan Reports"></form></li>
			<li><form action="#" method="post"><input type="submit" value="Personal Loan Reports  "></form></li>
			<li><form action="#" method="post"><input type="submit" value="Home Loan Reports       "></form></li>
			<li><form action="#" method="post"><input type="submit" value="Gold Loan Reports          "></form></li>
			<li><form action="#" method="post"><input type="submit" value="User Details Reports       "></form></li>
			</ul>
			</li>
			<li><a href="#" >Apply for Loan</a>
			<ul class="sub-menu">

				<li><a href="loan.jsp">Education Loan</a></li>
				<li><a href="loan.jsp">Personal</a></li>
				<li><a href="loan.jsp">Home Loan</a></li>
				<li><a href="loan.jsp">Gold</a></li>
				<li><a href="loan.jsp">Vehicle Loan</a>
				<ul class="sub-menu">
						<li><a href="loan.jsp">Two Wheeler</a></li>
						<li><a href="loan.jsp">Four Wheeler</a></li>
					</ul>
				</li>
				</ul>
			</li>
			<li><a href="emipayment.jsp" >EMI Payment</a>
			<!-- <li><a href="#" >Export Reports</a>
			
			<ul class="sub-menu">
			<li><form action="#" method="post"><input type="submit" value="EMIs Payment Reports  "></form></li>
			<li><form action="#" method="post"><input type="submit" value="Loan Details Reports   "></form></li>
			</ul>
			</li> -->
			<li><a href="EMICalculator.jsp">EMI Calculator</a></li>
			<li><a href="index.html">Logout</a></li>
			</ul>
			<div class="header-right">
				<a href="#" class="hr-btn"><i class="flaticon-029-telephone-1"></i>Call
					us now! </a>
				<div class="hr-btn hr-btn-2">+91 8778878787</div>
			</div>
		</nav>
	</header>
	<!-- Header Section end -->

	<!-- Hero Section end -->
	<section class="hero-section">
		<div class="container">
			<div class="row">
				<div class="col-lg-6">
					<div class="hs-text">
						
							<h2>"May the best loan win."</h2>
						
						
							<h5>Shop for the best loan.</h5>
						

					</div>
				</div>

			</div>
		</div>
		<div class="hero-slider owl-carousel">
			<div class="hs-item set-bg" data-setbg="img/hero-slider/1.jpg"></div>
			<div class="hs-item set-bg" data-setbg="img/hero-slider/2.jpg"></div>
			<div class="hs-item set-bg" data-setbg="img/hero-slider/3.jpg"></div>
		</div>
	</section>
	<!-- Hero Section end -->

		<!-- Why Section end -->
	<section class="why-section spad">
		<div class="container">
			<div class="text-center mb-5 pb-4">
				<h2>Why Choose us?</h2>
			</div>
			<div class="row">
				<div class="col-md-4">
					<div class="icon-box-item">
						<div class="ib-icon">
							<i class="flaticon-012-24-hours"></i>
						</div>
						<div class="ib-text">
							<h5>24*7 Support</h5>
							<p>We are ready to support our customers 24*7;.</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="icon-box-item">
						<div class="ib-icon">
							<i class="flaticon-036-customer-service"></i>
						</div>
						<div class="ib-text">
							<h5>Helpfull Staff</h5>
							<p>"To earn the respect (and eventually love) of your customers, 
							you first have to respect those customers. 
							That is why Golden Rule behavior is embraced by most of the winning companies."</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="icon-box-item">
						<div class="ib-icon">
							<i class="flaticon-039-info"></i>
						</div>
						<div class="ib-text">
							<h5>Credit History Considered</h5>
							<p>For a score with a range between 300-850, a credit score of 700 or above is
							 generally considered good. A score of 800 or above on the same range is considered to
							  be excellent. Most credit scores fall between 600 and 750. Higher scores represent better
							   credit decisions
							 and can make creditors more confident that you will repay your future debts as agreed.</p>
						</div>
					</div>
				</div>
			</div>

		</div>
	</section>
	<!-- Why Section end -->

	<!-- CTA Section end -->
	<section class="cta-section set-bg" data-setbg="img/cta-bg.jpg">
		<div class="container">
			<h2>
				Already have a <strong>L2Go</strong> Bank Loan?
			</h2>
			<h5>If you're thinking about borrowing more, we're here to help.</h5>
			<a href="#" class="site-btn sb-dark sb-big">Find out More</a>
		</div>
	</section>
	<!-- CTA Section end -->


	<!-- Feature Section -->
	<section class="feature-section spad">
		<div class="container">
			<div class="feature-item">
				<div class="row">
					<div class="col-lg-6">
						<img src="img/feature-1.jpg" alt="">
					</div>
					<div class="col-lg-6">
						<div class="feature-text">
							<h2>Get a personal loan from just 8.5% APR</h2>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit,
								sed do eiusmod tem por incididunt ut labore et dolore mag na
								aliqua. Class aptent taciti sociosqu ad litora torquent per
								conubia nostra, per inceptos himenaeos. Suspendisse potenti. Ut
								gravida mattis magna, non varius lorem sodales nec. In libero
								orci, ornare non nisl.</p>
							<a href="#" class="readmore">Apply for a loan now <img
								src="img/arrow.png" alt=""></a>
						</div>
					</div>
				</div>
			</div>
			<div class="feature-item">
				<div class="row">
					<div class="col-lg-6 order-lg-2">
						<img src="img/feature-2.jpg" alt="">
					</div>
					<div class="col-lg-6 order-lg-1">
						<div class="feature-text">
							<h2>Get aproved in minutes after you apply online</h2>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit,
								sed do eiusmod tem por incididunt ut labore et dolore mag na
								aliqua. Class aptent taciti sociosqu ad litora torquent per
								conubia nostra, per inceptos himenaeos. Suspendisse potenti. Ut
								gravida mattis magna, non varius lorem sodales nec. In libero
								orci, ornare non nisl.</p>
							<a href="#" class="readmore">Apply for a loan now <img
								src="img/arrow.png" alt=""></a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Feature Section end -->


	<!-- Help Section -->
	<section class="help-section spad">
		<div class="container">
			<div class="text-center text-white mb-5 pb-4">
				<h2>How a personal loan can help</h2>
			</div>
			<div class="row">
				<div class="col-md-6">
					<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed
						do eiusmod tem por incididunt ut labore et dolore mag na aliqua.
						Class aptent taciti sociosqu ad litora torquent per conubia
						nostra, per inceptos himenaeos. Suspendisse potenti. Ut gravida
						mattis magna, non varius lorem sodales nec.</p>
				</div>
				<div class="col-md-6">
					<p>Sit amet, consectetur adipiscing elit, sed do eiusmod tem
						por incididunt ut labore et dolore mag na aliqua. Class aptent
						taciti sociosqu ad litora torquent per conubia nostra, per
						inceptos himenaeos. Suspendisse potenti. Ut gravida mattis magna,
						non varius lorem sodales nec. In libero orci, ornare non nisl.</p>
				</div>
			</div>
			<div class="row">
				<div class="col-md-4">
					<ul class="help-list">
						<li>Buying a car</li>
						<li>Take control of your finances</li>
						<li>Pay school tuitions</li>
						<li>Adding value to your home</li>
					</ul>
				</div>
				<div class="col-md-4">
					<ul class="help-list">
						<li>Increese your budget</li>
						<li>Have a day to remember</li>
						<li>Get a new card</li>
						<li>Go on a holliday</li>
					</ul>
				</div>
				<div class="col-md-4">
					<ul class="help-list">
						<li>Get an Insurance</li>
						<li>Take a trip</li>
						<li>Help your kids</li>
						<li>Renovate your home</li>
					</ul>
				</div>
			</div>
		</div>
	</section>
	<!-- Help Section end -->


	<!-- Info Section -->
	<section class="info-section spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-5">
					<img src="img/info-img.jpg" alt="">
				</div>
				<div class="col-lg-7">
					<div class="info-text">
						<h2>We’re here to help</h2>
						<h5>Monday to Thursday (8am to 8pm), and Friday (8am to 5pm).</h5>
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit,
							sed do eiusmod tem por incididunt ut labore et dolore mag na
							aliqua. Class aptent taciti sociosqu ad litora torquent per
							conubia nostra, per inceptos himenaeos. Suspendisse potenti. Ut
							gravida mattis magna, non varius lorem sodales nec. In libero
							orci, ornare non nisl.</p>
						<ul>
							<li>+91 9902438675</li>
							<li>contact@loans2go.com</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Info Section end -->

	<!-- Score Section end -->
	<section class="score-section text-white set-bg"
		data-setbg="img/score-bg.jpg">
		<div class="container">
			<div class="row">
				<div class="col-xl-6 col-lg-8">
					<h2>Calculate my Score</h2>
					<h4>Check your credit reports as often as you want, it won't
						affect your scores.</h4>
					<a href="creditscore.html" class="site-btn sb-big">show my score</a>
				</div>
			</div>
			<img src="img/hand.png" alt="" class="hand-img">
		</div>
	</section>
	<!-- Score Section end -->

	<!-- Footer Section -->
	<footer class="footer-section">
		<div class="container">
			<a href="index.html" class="footer-logo"> <img src="img/logo.png"
				alt="">
			</a>
			<div class="row">
				<div class="col-lg-3 col-sm-6">
					<div class="footer-widget">
						<h2>What we do</h2>
						<ul>
							<li><a href="#">Loans</a></li>
							<li><a href="#">Car loans</a></li>
							<li><a href="#">Debt consolidation loans</a></li>
							<li><a href="#">Home improvement loans</a></li>
							<li><a href="#"> Wedding loans</a></li>
							<li><a href="#">Innovative Finance ISA</a></li>
						</ul>
					</div>
				</div>
				<div class="col-lg-3 col-sm-6">
					<div class="footer-widget">
						<h2>About us</h2>
						<ul>
							<li><a href="#">About us</a></li>
							<li><a href="#">Our story</a></li>
							<li><a href="#">Meet the board</a></li>
							<li><a href="#">Meet the leadership team</a></li>
							<li><a href="#">Awards</a></li>
							<li><a href="#">Careers</a></li>
						</ul>
					</div>
				</div>
				<div class="col-lg-3 col-sm-6">
					<div class="footer-widget">
						<h2>Legal</h2>
						<ul>
							<li><a href="#">Privacy policy</a></li>
							<li><a href="#">Loans2go principles</a></li>
							<li><a href="#">Website terms</a></li>
							<li><a href="#">Cookie policy</a></li>
							<li><a href="#">Conflicts policy</a></li>
						</ul>
					</div>
				</div>
				<div class="col-lg-3 col-sm-6">
					<div class="footer-widget">
						<h2>Site Info</h2>
						<ul>
							<li><a href="#">Support</a></li>
							<li><a href="#">FAQ</a></li>
							<li><a href="#">Sitemap</a></li>
							<li><a href="#">Careers</a></li>
							<li><a href="#">Contact us</a></li>
						</ul>
					</div>
				</div>
			</div>
			<p>Education loans can be a viable option in a variety of circumstances. First, let’s define a Education loan.
			 Some loans are earmarked for a specific purchase. You buy a home with 
			a mortgage loan, you purchase a car with an auto loan and you pay for college with a student loan.</p>
			<div class="copyright">
				<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
				Copyright &copy;
				<script>
					document.write(new Date().getFullYear());
				</script>
				All rights reserved | This template is made <i
					 aria-hidden="true"></i> by <a
					 target="_blank">Rinamp</a>
			</div>
		</div>
	</footer>
	<!-- Footer Section end -->

	<!--====== Javascripts & Jquery ======-->
	<script src="js/jquery-3.2.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.slicknav.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/jquery-ui.min.js"></script>
	<script src="js/main.js"></script>

</body>
</html>
