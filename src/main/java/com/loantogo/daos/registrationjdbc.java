package com.loantogo.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.loantogo.mailingservices.MailSender;

import UtilityServices.PasswordGenerator;


public class registrationjdbc {

	public String add(String userTypes, String firstName, String lastName, String mobile, String emailId, String fathersName,
			String mothersName, String curentAddress, String permanentAddress) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/LoanToGo","root","root");
		PreparedStatement ps= con.prepareStatement("insert into registration(firstName,lastName,mobile,emailId,fathersName,mothersName,curentAddress,permanentAddress,userType,loginAttempt,password) values(?,?,?,?,?,?,?,?,?,?,?)");
		ps.setString(1,firstName);
		ps.setString(2,lastName);
		ps.setString(3,mobile);
		ps.setString(4,emailId);
		ps.setString(5,fathersName);
		ps.setString(6,mothersName);
		ps.setString(7,curentAddress);
		ps.setString(8,permanentAddress);
		ps.setString(9,userTypes);
		ps.setInt(10, 0);
		
		String password=PasswordGenerator.getAlphaNumericString();
		ps.setString(11,password);
		
		
		ps.executeUpdate();
		
		
		return password;
		
		//MailSender ms= new MailSender();
		//ms.sendMail(firstName,emailId,password);
		
		
	}
	
}
