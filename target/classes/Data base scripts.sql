create database loantogo;
use loantogo;



CREATE TABLE `registration` (
   id int primary key auto_increment,
  `firstName` varchar(50) DEFAULT NULL,
  `lastName` varchar(50) DEFAULT NULL,
  `mobile` varchar(50) DEFAULT NULL,
  `emailId` varchar(50) DEFAULT NULL,
  `fathersName` varchar(50) DEFAULT NULL,
  `mothersName` varchar(50) DEFAULT NULL,
  `curentAddress` varchar(200) DEFAULT NULL,
  `permanentAddress` varchar(200) DEFAULT NULL,
   userType varchar(50),
   loginAttempt int,
   password varchar(50)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


create table loanDetails(
LoanId int primary key auto_increment,
loanTypes varchar(100),
incomeTypes varchar(100),
fullNamePan varchar(100),
panNumber varchar(100),
dob varchar(100),
aadharId varchar(100),
mobileNumber varchar(100),
fathersName varchar(100),
mothersName varchar(100),
curentAddress varchar(100),
permanentAddress varchar(100),
highestQualification varchar(100),
loanAmount varchar(100),
loanTerms varchar(100),
OtherEmi varchar(100),
accountNumber varchar(100),
ifsccode varchar(100),
accountHolder varchar(100),
bankAddress varchar(100),
employerName varchar(100),
employerAddress varchar(100),
monthlyIncome varchar(100),
employeeId varchar(100),
employeeRole varchar(100),
uan varchar(100),
loanDescription  varchar(200),
regEmailId varchar(50)
);

create table paymentDetails(
PaymentId int primary key auto_increment,
LoanId varchar(50),
Userid varchar(50),
TotalAmountSenctioned varchar(50),
AmountPaid varchar(50),
PaymentDate varchar(50),
TotalAmountPaid varchar(50),
TotalBalance varchar(50),
TotalNoOfEmisToBePaid varchar(50),
NoOfEmisPaid varchar(50),
NumberOfEmisBalance varchar(50),
emiAmountPerMonth varchar(50)
);










































































CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;





CREATE TABLE `cibilscore` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `PanNumber` varchar(10) DEFAULT NULL,
  `cibilScore` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;




CREATE TABLE `educationloan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `firstName` varchar(50) DEFAULT NULL,
  `lastName` varchar(50) DEFAULT NULL,
  `mobile` varchar(50) DEFAULT NULL,
  `emailId` varchar(50) DEFAULT NULL,
  `fathersName` varchar(50) DEFAULT NULL,
  `mothersName` varchar(50) DEFAULT NULL,
  `curentAddress` varchar(50) DEFAULT NULL,
  `permanentAddress` varchar(50) DEFAULT NULL,
  `pan` varchar(50) DEFAULT NULL,
  `aadharNumber` varchar(50) DEFAULT NULL,
  `collegename` varchar(50) DEFAULT NULL,
  `yearlyfee` varchar(50) DEFAULT NULL,
  `yearadmission` varchar(50) DEFAULT NULL,
  `loanStatus` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;



CREATE TABLE `fourwheelerloan` (
  `firstName` varchar(50) DEFAULT NULL,
  `lastName` varchar(50) DEFAULT NULL,
  `mobile` varchar(50) DEFAULT NULL,
  `emailId` varchar(50) DEFAULT NULL,
  `fathersName` varchar(50) DEFAULT NULL,
  `age` varchar(50) DEFAULT NULL,
  `curentAddress` varchar(50) DEFAULT NULL,
  `permanentAddress` varchar(50) DEFAULT NULL,
  `loanStatus` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE `goldloanservlet` (
  `firstName` varchar(50) DEFAULT NULL,
  `lastName` varchar(50) DEFAULT NULL,
  `mobile` varchar(50) DEFAULT NULL,
  `emailId` varchar(50) DEFAULT NULL,
  `fathersName` varchar(50) DEFAULT NULL,
  `age` varchar(50) DEFAULT NULL,
  `curentAddress` varchar(50) DEFAULT NULL,
  `permanentAddress` varchar(50) DEFAULT NULL,
  `pan` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE `homeloan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `firstName` varchar(50) DEFAULT NULL,
  `lastName` varchar(50) DEFAULT NULL,
  `mobile` varchar(50) DEFAULT NULL,
  `emailId` varchar(50) DEFAULT NULL,
  `fathersName` varchar(50) DEFAULT NULL,
  `age` varchar(50) DEFAULT NULL,
  `curentAddress` varchar(50) DEFAULT NULL,
  `permanentAddress` varchar(50) DEFAULT NULL,
  `pan` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;



CREATE TABLE `login` (
  `userId` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;




insert into login values ("abc","abc@123");



CREATE TABLE `personalloan` (
  `fullNameasperPANCard` varchar(50) DEFAULT NULL,
  `mobileNumber` varchar(50) DEFAULT NULL,
  `netMonthlyIncome` varchar(50) DEFAULT NULL,
  `yourCurrentAddress` varchar(50) DEFAULT NULL,
  `permanentAddress` varchar(50) DEFAULT NULL,
  `pan` varchar(50) DEFAULT NULL,
  `doYoucurrentlypayanyEMI` varchar(50) DEFAULT NULL,
  `loanStaus` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



CREATE TABLE `postlogin1` (
  `userId` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;





CREATE TABLE `registration` (
   id int primary key auto_increment,
  `firstName` varchar(50) DEFAULT NULL,
  `lastName` varchar(50) DEFAULT NULL,
  `mobile` varchar(50) DEFAULT NULL,
  `emailId` varchar(50) DEFAULT NULL,
  `fathersName` varchar(50) DEFAULT NULL,
  `mothersName` varchar(50) DEFAULT NULL,
  `curentAddress` varchar(50) DEFAULT NULL,
  `permanentAddress` varchar(50) DEFAULT NULL,
   userType varchar(50),
   loginAttempt int
) ENGINE=InnoDB DEFAULT CHARSET=latin1;




CREATE TABLE `twowheelerloan` (
  `firstName` varchar(50) DEFAULT NULL,
  `lastName` varchar(50) DEFAULT NULL,
  `mobile` varchar(50) DEFAULT NULL,
  `emailId` varchar(50) DEFAULT NULL,
  `fathersName` varchar(50) DEFAULT NULL,
  `age` varchar(50) DEFAULT NULL,
  `curentAddress` varchar(50) DEFAULT NULL,
  `permanentAddress` varchar(50) DEFAULT NULL,
  `DrivingLicence` varchar(50) DEFAULT NULL,
  `pan` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;




insert into login values ("nikhat","nikhat@123");
INSERT INTO `loantogo`.`educationloan` (`id`, `firstName`, `lastName`, `mobile`, `emailId`, `fathersName`) VALUES ('1', 'ABC', 'ABC', '9877', 'abc@gmail.com', 'XYZ');
INSERT INTO `loantogo`.`educationloan` (`id`, `firstName`, `lastName`, `mobile`, `emailId`, `fathersName`) VALUES ('2', 'ABC', 'ABC', '9877', 'abc@gmail.com', 'XYZ');






