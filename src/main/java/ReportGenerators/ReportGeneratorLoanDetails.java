package ReportGenerators;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReportGeneratorLoanDetails {
	public static void main(String[] args) {

		try{
			String filename="D://Final Imlemented Projet latest//Reports of Project/LoanDetailsReports.xls" ;
			HSSFWorkbook hwb=new HSSFWorkbook();
			HSSFSheet sheet =  hwb.createSheet("new sheet");
			

			HSSFRow rowhead=   sheet.createRow((short)0);
			rowhead.createCell((short) 0).setCellValue("LoanId");
			rowhead.createCell((short) 1).setCellValue("loanTypes");
			rowhead.createCell((short) 2).setCellValue("incomeTypes");
			rowhead.createCell((short) 3).setCellValue("fullNamePan");
			rowhead.createCell((short) 4).setCellValue("panNumber");
			rowhead.createCell((short) 5).setCellValue("dob");
			rowhead.createCell((short) 6).setCellValue("aadharId");
			rowhead.createCell((short) 7).setCellValue("mobileNumber");
			rowhead.createCell((short) 8).setCellValue("fathersName");
			rowhead.createCell((short) 9).setCellValue("mothersName");
			rowhead.createCell((short) 10).setCellValue("curentAddress");
			rowhead.createCell((short) 11).setCellValue("permanentAddress");
			rowhead.createCell((short) 12).setCellValue("highestQualification");
			rowhead.createCell((short) 13).setCellValue("loanAmount");
			rowhead.createCell((short) 14).setCellValue("loanTerms");
			rowhead.createCell((short) 15).setCellValue("OtherEmi");
			rowhead.createCell((short) 16).setCellValue("accountNumber");
			rowhead.createCell((short) 17).setCellValue("ifsccode");
			rowhead.createCell((short) 18).setCellValue("accountHolder");
			rowhead.createCell((short) 19).setCellValue("bankAddress");
			rowhead.createCell((short) 20).setCellValue("employerName");
			rowhead.createCell((short) 21).setCellValue("employerAddress");
			rowhead.createCell((short) 22).setCellValue("monthlyIncome");
			rowhead.createCell((short) 23).setCellValue("employeeId");
			rowhead.createCell((short) 24).setCellValue("employeeRole");
			rowhead.createCell((short) 25).setCellValue("uan");
			rowhead.createCell((short) 26).setCellValue("loanDescription");
			rowhead.createCell((short) 27).setCellValue("regEmailId");
			
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loantogo", "root", "root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("Select * from loanDetails");
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
				System.out.println(rs.getString(13));
				System.out.println(rs.getString(14));
				System.out.println(rs.getString(15));
				System.out.println(rs.getString(16));
				System.out.println(rs.getString(17));
				System.out.println(rs.getString(18));
				System.out.println(rs.getString(19));
				System.out.println(rs.getString(20));
				System.out.println(rs.getString(21));
				System.out.println(rs.getString(22));
				System.out.println(rs.getString(23));
				System.out.println(rs.getString(24));
				System.out.println(rs.getString(25));
				System.out.println(rs.getString(26));
				System.out.println(rs.getString(27));
				System.out.println(rs.getString(28));
				
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
			row.createCell((short) 12).setCellValue(rs.getString(13));
			row.createCell((short) 13).setCellValue(rs.getString(14));
			row.createCell((short) 14).setCellValue(rs.getString(15));
			row.createCell((short) 15).setCellValue(rs.getString(16));
			row.createCell((short) 16).setCellValue(rs.getString(17));
			row.createCell((short) 17).setCellValue(rs.getString(18));
			row.createCell((short) 18).setCellValue(rs.getString(19));
			row.createCell((short) 19).setCellValue(rs.getString(20));
			row.createCell((short) 20).setCellValue(rs.getString(21));
			row.createCell((short) 21).setCellValue(rs.getString(22));
			row.createCell((short) 22).setCellValue(rs.getString(23));
			row.createCell((short) 23).setCellValue(rs.getString(24));
			row.createCell((short) 24).setCellValue(rs.getString(25));
			row.createCell((short) 25).setCellValue(rs.getString(26));
			row.createCell((short) 26).setCellValue(rs.getString(27));
			row.createCell((short) 27).setCellValue(rs.getString(28));
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
