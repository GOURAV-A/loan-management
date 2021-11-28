package com.loantogo.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class loginjdbc {

	public String add(String userid, String password) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/LoanToGo","root","root");
		
		PreparedStatement ps1= con.prepareStatement("select loginAttempt from registration where emailId=?");
		ps1.setString(1,userid);
		ResultSet rs1=ps1.executeQuery();	
		int loginAttempt=0;
		while(rs1.next())
		{
			loginAttempt=rs1.getInt(1);	
		}
		
		
		if(loginAttempt>0) {
			//user has already logged in
			PreparedStatement ps= con.prepareStatement("select  count(*),userType from registration where emailId=? and password=?");
			ps.setString(1,userid);
			ps.setString(2,password);
			int res=0;
			String userType="";
		    ResultSet rs=ps.executeQuery();	
		   while(rs.next())
		   {
			res=rs.getInt(1);
			userType=rs.getString(2);
		    }
		   
		   if(res>=1 && userType.equals("admin")) {
			   PreparedStatement ps3= con.prepareStatement("update registration set loginAttempt=? where emailId=?");
			   ps3.setInt(1, loginAttempt+1);
			   ps3.setString(2, userid);
			   ps3.executeUpdate();
			   return "PostLoginAdmin";
		   }
		   else if(res>=1 && userType.equals("user")) {
			   PreparedStatement ps3= con.prepareStatement("update registration set loginAttempt=? where emailId=?");
			   ps3.setInt(1, loginAttempt+1);
			   ps3.setString(2, userid);
			   ps3.executeUpdate();
			   
			   return "PostLoginUser";
		   }
		   else {
			   return "InvalidCredentials";
		   }
   
		}
		else{
			  PreparedStatement ps3= con.prepareStatement("update registration set loginAttempt=? where emailId=?");
			   ps3.setInt(1, loginAttempt+1);
			   ps3.setString(2, userid);
			   ps3.executeUpdate();
			
			return "PasswordChange";
		}
		
		
		
		
	}

}
