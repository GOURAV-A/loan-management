package com.loantogo.daos;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class EMIPaymentJDBC {

	public void pay(String loanId, String userId, String payingAmount) throws ClassNotFoundException, SQLException {

		
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/LoanToGo","root","root");
		
		PreparedStatement ps1= con.prepareStatement("select * from paymentDetails where LoanId=? and PaymentId=(select max(PaymentId) from paymentDetails where Userid=?) ;");
		ps1.setString(1,loanId);
		ps1.setString(2,userId);
		ResultSet loanDetails=ps1.executeQuery();	
		String LoanId,Userid, TotalAmountSenctioned = null, AmountPaid, PaymentDate,
		TotalAmountPaid = null,TotalBalance = null, TotalNoOfEmisToBePaid = null,NoOfEmisPaid = null, NumberOfEmisBalance = null,emiAmountPerMonth=" ";
		while(loanDetails.next()) {
			TotalAmountSenctioned=loanDetails.getString(4);
			TotalAmountPaid=loanDetails.getString(7);
			TotalBalance=loanDetails.getString(8);
			TotalNoOfEmisToBePaid=loanDetails.getString(9);
			NoOfEmisPaid=loanDetails.getString(10);
			NumberOfEmisBalance=loanDetails.getString(11);
			emiAmountPerMonth=loanDetails.getString(12);
		}
		
		TotalAmountPaid=Integer.toString(Integer.parseInt(TotalAmountPaid)+Integer.parseInt(payingAmount));
		TotalBalance=Integer.toString(Integer.parseInt(TotalBalance)-Integer.parseInt(payingAmount));
		TotalNoOfEmisToBePaid=Integer.toString(Integer.parseInt(TotalNoOfEmisToBePaid)-1);
		NoOfEmisPaid=Integer.toString(Integer.parseInt(NoOfEmisPaid)+1);
		NumberOfEmisBalance=Integer.toString(Integer.parseInt(NumberOfEmisBalance)-1);
		PreparedStatement ps2 = con.prepareStatement("insert into paymentDetails"
				+ "(LoanId, Userid, TotalAmountSenctioned, AmountPaid, PaymentDate, TotalAmountPaid,TotalBalance, TotalNoOfEmisToBePaid,NoOfEmisPaid, NumberOfEmisBalance,emiAmountPerMonth)"
				+ " values(?,?,?,?,?,?,?,?,?,?,?)");
		
		ps2.setString(1, loanId);
		ps2.setString(2, userId);
		ps2.setString(3, TotalAmountSenctioned);
		ps2.setString(4, payingAmount);
		ps2.setString(5, new Date().toString());

		ps2.setString(6, TotalAmountPaid);
		ps2.setString(7, TotalBalance);
		ps2.setString(8, TotalNoOfEmisToBePaid);
		ps2.setString(9, NoOfEmisPaid);
		ps2.setString(10, NumberOfEmisBalance);
		ps2.setString(11, emiAmountPerMonth);	
		
		
		double totalInterest=((Integer.parseInt(TotalAmountSenctioned))*0.12)*Integer.parseInt(TotalNoOfEmisToBePaid);
		double totalAmountTobePaidIncludingInterest=Integer.parseInt(TotalAmountSenctioned)+totalInterest;
		if(totalAmountTobePaidIncludingInterest!=Integer.parseInt(TotalAmountPaid)) {
			ps2.executeUpdate();
		}
		else {
			System.out.println("You have paid all your emis.");
		}
		
		
		
	}
	
	
}
