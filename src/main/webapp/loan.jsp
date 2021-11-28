<!DOCTYPE html>
<html lang="zxx">
<head>
	<title>LOANS2GO Project</title>
	<meta charset="UTF-8">
	<meta name="description" content="loans HTML Template">
	<meta name="keywords" content="loans, html">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	
	<!-- Favicon -->
	<link href="img/favicon.ico" rel="shortcut icon"/>

	<!-- Google font -->
	<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i&display=swap" rel="stylesheet">
 
	<!-- Stylesheets -->
	<link rel="stylesheet" href="css/bootstrap.min.css"/>
	<link rel="stylesheet" href="css/font-awesome.min.css"/>
	<link rel="stylesheet" href="css/owl.carousel.min.css"/>
	<link rel="stylesheet" href="css/flaticon.css"/>
	<link rel="stylesheet" href="css/slicknav.min.css"/>

	<!-- Main Stylesheets -->
	<link rel="stylesheet" href="css/style.css"/>


	<!--[if lt IE 9]>
		<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
		<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	<![endif]-->
		<script>
(function() {

    const idleDurationSecs = 120000;    // X number of seconds
    const redirectUrl = 'login.jsp';  // Redirect idle users to this URL
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


<script type="text/javascript">


function showDiv2(){
	
	document.getElementById("educationLoan1Div").style.display = "none";
	document.getElementById("educationLoan2Div").style.display = "block";
	return false;
}

function showDiv1(){
	document.getElementById("educationLoan1Div").style.display = "block";
	document.getElementById("educationLoan2Div").style.display = "none";
	return false;
}

var rangeLabel = document.getElementById("range-label");
var experience = document.getElementById("experience");

function change() {
rangeLabel.innerText = experience.value + "K";
}

</script>


</head>
<body>
	<!-- Page Preloder -->
	<div id="preloder">
		<div class="loader"></div>
	</div>

	<!-- Header Section -->
	<header class="header-section">
		<a href="index.html" class="site-logo">
			<img src="img/logo.png" alt="">
		</a>
		<nav class="header-nav">
			<ul class="main-menu">
			<h3 style="color: red">Welcome to Loan Screen.</h3>
			</ul>
			<div class="header-right">
				<a href="#" class="hr-btn"><i class= "flaticon-029-telephone-1"></i>Call us now! </a>
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
						<h2>Looking for an instant loan?</h2>
						<p>We provide the services for instant loan as per your eligibility. </p>
						<a href="#" class="site-btn sb-dark">Find out more</a>
					</div>
				</div>
				<div class="col-lg-6">
					<form class="hero-form" action="loanServlet" method="post">
					<h3 style="color: red">Fill the Loan Form</h3>
					<div id="educationLoan1Div">
						<select name="loanTypes"><option>------------------------- Choose your Loan Type --------------------------</option>
						<option value="EducationLoan">Education Loan</option><option value="HomeLoan">Home Loan</option>
						<option value="GoldLoan">Gold Loan</option><option value="TwoWheelerLoan">Two wheeler Loan</option>
						<option value="FourWheelerLoan">Four Wheeler Loan</option><option value="PersonalLoan">Personal Loan</option>
						</select>
						<input type="text" placeholder="Complete details of Loans(Gold/Higher Education/Home/Vehicle)" name="loanDescription">
						<select name="incomeTypes"><option>------------------------- Choose your Type of Income --------------------------</option>
						<option value="salaried">Salaried</option><option value="business">Business</option><option value="student">Student</option>
						</select>
						<h6 style="color:red"> Personal Details </h6>
						<input type="text" placeholder="Enter Full Name as per PAN Card" name="fullNamePan">
						<input type="text" placeholder="Your PAN Number" name="panNumber">
						<input type="text" placeholder="Enter your Date of Birth (dd-mm-yyyy)" name="dob">
						<input type="text" placeholder="Enter your Aadhar Id" name="aadharId">
						<input type="text" placeholder="Enter your Mobile Number" name="mobileNumber">
						<input type="text" placeholder="Enter your Registered Email Id" name="regEmailId">
						<input type="text" placeholder="Enter your Father's Name" name="fathersName">
						<input type="text" placeholder="Enter your Mother's Name" name="mothersName">
						<input type="text" placeholder="Your Current Address" name="curentAddress">
						<input type="text" placeholder="Your Permanent Address" name="permanentAddress">
						<input type="text" placeholder="Enter your Highest Qualification" name="highestQualification">
					
						<button class="site-btn" onclick="return showDiv2();">Next Part</button>
						</div>
						<div id="educationLoan2Div" style="display: none;">
						<div id="wrapper">
						<h6 style="color:red"> Loan Details </h6>
						<input type="text" placeholder="Enter Loan Amount" name="loanAmount">
						<input type="text" placeholder="Enter your Loan terms in months" name="loanTerms">
						<input type="text" placeholder="Enter your emi ammount to be paid (Per month)" name="emiAmountPerMonth">
				        <input type="text" placeholder="Interest rate is 12% per anum (Read Only)" readonly>
						<input type="text" placeholder="Enter the amount if you pay any other EMI (Monthly) " name="OtherEmi">
						
						</div>
						
						
						<h6 style="color:red"> Bank Details </h6>
						<input type="text" placeholder="Enter Your Bank Account Number" name="accountNumber">
						<input type="text" placeholder="Enter IFSC code of bank" name="ifsccode">
						<input type="text" placeholder="Enter name of account holder" name="accountHolder">
						<input type="text" placeholder="Enter address of Bank" name="bankAddress">
						
						<h6 style="color:red"> Income/Business Details </h6>
						<input type="text" placeholder="Enter name of Your business/Employer" name="employerName">
						<input type="text" placeholder="Address of Your business/Employer" name="employerAddress">
						<input type="text" placeholder="Enter your Net Monthly Income " name="monthlyIncome">
						<input type="text" placeholder="Enter employee id (if any)" name="employeeId">
						<input type="text" placeholder="Enter your role at Organization" name="employeeRole">
						<input type="text" placeholder="Enter your UAN (Universal Account Number) " name="uan">
						
						<button class="site-btn" onclick="return showDiv1();">Back</button><button class="site-btn">Submit</button>
						</div>
					</form>
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

	

	<!-- Footer Section -->
	<footer class="footer-section">
		<div class="container">
			<a href="index.html" class="footer-logo">
				<img src="img/logo.png" alt="">
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
