package com.loantogo.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class emailValidationJDBC {

	public int validate(String emailid) throws ClassNotFoundException, SQLException {
	
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/LoanToGo","root","root");
		
		PreparedStatement ps1= con.prepareStatement("select count(*) from registration where emailId=?");
		ps1.setString(1,emailid);
		ResultSet rs1=ps1.executeQuery();	
		int numberOfUserId=0;
		while(rs1.next())
		{
			numberOfUserId=rs1.getInt(1);	
		}
		
		
		System.out.println(numberOfUserId);
		
		return numberOfUserId;
		
		
	}

}
