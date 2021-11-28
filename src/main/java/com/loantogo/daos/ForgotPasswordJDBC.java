package com.loantogo.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ForgotPasswordJDBC {
	

	public void add(String userid, String password) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/LoanToGo","root","root");
		
		PreparedStatement ps1= con.prepareStatement("update registration set password=  ?  where emailId=?");
		ps1.setString(1,password);
		ps1.setString(2,userid);
		ps1.executeUpdate();	

	}
}
