package ReportGenerators;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReportGeneratorsUserDetails {
	

	public static void main(String[] args) {
		try{
			String filename="D://Final Imlemented Projet latest//Reports of Project/UserDetailsReports.xls" ;
			HSSFWorkbook hwb=new HSSFWorkbook();
			HSSFSheet sheet =  hwb.createSheet("new sheet");
			
			HSSFRow rowhead=   sheet.createRow((short)0);
			rowhead.createCell((short) 0).setCellValue("UserID");
			rowhead.createCell((short) 1).setCellValue("firstName");
			rowhead.createCell((short) 2).setCellValue("lastName");
			rowhead.createCell((short) 3).setCellValue("lastName");
			rowhead.createCell((short) 4).setCellValue("emailId");
			rowhead.createCell((short) 5).setCellValue("fathersName");
			rowhead.createCell((short) 6).setCellValue("mothersName");
			rowhead.createCell((short) 7).setCellValue("curentAddress");
			rowhead.createCell((short) 8).setCellValue("permanentAddress");
			rowhead.createCell((short) 9).setCellValue("userType");
			rowhead.createCell((short) 10).setCellValue("loginAttempt");
			rowhead.createCell((short) 11).setCellValue("password");
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loantogo", "root", "root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("Select * from registration");
			int i=1;
			while(rs.next()){
				
				
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getString(5));
				System.out.println(rs.getString(6));
				System.out.println(rs.getString(7));
				System.out.println(rs.getString(8));
				System.out.println(rs.getString(9));
				System.out.println(rs.getString(10));
				System.out.println(rs.getString(11));
				System.out.println(rs.getString(12));
				
			HSSFRow row=   sheet.createRow((short)i);
			row.createCell((short) 0).setCellValue(rs.getString(1));
			row.createCell((short) 1).setCellValue(rs.getString(2));
			row.createCell((short) 2).setCellValue(rs.getString(3));
			row.createCell((short) 3).setCellValue(rs.getString(4));
			row.createCell((short) 4).setCellValue(rs.getString(5));
			row.createCell((short) 5).setCellValue(rs.getString(6));
			row.createCell((short) 6).setCellValue(rs.getString(7));
			row.createCell((short) 7).setCellValue(rs.getString(8));
			row.createCell((short) 8).setCellValue(rs.getString(9));
			row.createCell((short) 9).setCellValue(rs.getString(10));
			row.createCell((short) 10).setCellValue(rs.getString(11));
			row.createCell((short) 11).setCellValue(rs.getString(12));
			i++;
			}
			FileOutputStream fileOut =  new FileOutputStream(filename);
			hwb.write(fileOut);
			fileOut.close();
			System.out.println("Your excel report has been generated !");
			
		} catch ( Exception ex ) {
		    System.out.println(ex);
		
	}

	}


}
