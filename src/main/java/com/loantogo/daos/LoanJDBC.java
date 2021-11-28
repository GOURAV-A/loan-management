package com.loantogo.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class LoanJDBC {

	public void insertLoanDetails(String loanTypes, String incomeTypes, String fullNamePan, String panNumber,
			String dob, String aadharId, String mobileNumber, String fathersName, String mothersName,
			String curentAddress, String permanentAddress, String highestQualification, String loanAmount,
			String loanTerms, String otherEmi, String accountNumber, String ifsccode, String accountHolder,
			String bankAddress, String employerName, String employerAddress, String monthlyIncome, String employeeId,
			String employeeRole, String uan,String loanDescription,String regEmailId,String emiAmountPerMonth) throws SQLException, ClassNotFoundException {
		
		
		
        Class.forName("com.mysql.cj.jdbc.Driver"); 

		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LoanToGo", "root", "root");
		PreparedStatement ps = con.prepareStatement("insert into loanDetails(loanTypes, incomeTypes, fullNamePan, panNumber, dob, aadharId, mobileNumber, fathersName,\r\n" + 
				"				mothersName, curentAddress, permanentAddress, highestQualification, loanAmount, loanTerms, OtherEmi,\r\n" + 
				"				accountNumber, ifsccode, accountHolder, bankAddress, employerName, employerAddress, monthlyIncome,\r\n" + 
				"				employeeId, employeeRole, uan,loanDescription,regEmailId ) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		ps.setString(1, loanTypes);
		ps.setString(2, incomeTypes);
		ps.setString(3, fullNamePan);
		ps.setString(4, panNumber);
		ps.setString(5, dob);
		ps.setString(6, aadharId);
		ps.setString(7, mobileNumber);
		ps.setString(8, fathersName);
		ps.setString(9, mothersName);
		ps.setString(10, curentAddress);
		ps.setString(11, permanentAddress);
		ps.setString(12, highestQualification);
		ps.setString(13, loanAmount);
		ps.setString(14, loanTerms);
		ps.setString(15, otherEmi);
		ps.setString(16, accountNumber);
		ps.setString(17, ifsccode);
		ps.setString(18, accountHolder);
		ps.setString(19, bankAddress);
		ps.setString(20, employerName);
		ps.setString(21, employerAddress);
		ps.setString(22, monthlyIncome);
		ps.setString(23, employeeId);
		ps.setString(24, employeeRole);
		ps.setString(25, uan);
		ps.setString(26,loanDescription);
		ps.setString(27,regEmailId);
		ps.executeUpdate();
		
		
		
		PreparedStatement psLoanId= con.prepareStatement("select LoanId from loanDetails where regEmailId=?");
		psLoanId.setString(1,regEmailId);
		ResultSet rsLoanId=psLoanId.executeQuery();	
		int loanid=0;
		while(rsLoanId.next())
		{
			loanid=rsLoanId.getInt(1);	
		}
	
		
		PreparedStatement ps1 = con.prepareStatement("insert into paymentDetails"
				+ "(LoanId, Userid, TotalAmountSenctioned, AmountPaid, PaymentDate, TotalAmountPaid,TotalBalance, TotalNoOfEmisToBePaid,NoOfEmisPaid, NumberOfEmisBalance,emiAmountPerMonth)"
				+ " values(?,?,?,?,?,?,?,?,?,?,?)");
		
		ps1.setString(1, Integer.toString(loanid));
		ps1.setString(2, regEmailId);
		ps1.setString(3, loanAmount);
		ps1.setString(4, "0");
		ps1.setString(5, new Date().toString());
		ps1.setString(6, "0");
		ps1.setString(7, loanAmount);
		ps1.setString(8, loanTerms);
		ps1.setString(9, "0");
		ps1.setString(10, loanTerms);
		ps1.setString(11, emiAmountPerMonth);
		
		int paymentId=ps1.executeUpdate();
		
	}

}
