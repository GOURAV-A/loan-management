package com.loantogo.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.loantogo.daos.LoanJDBC;
import com.loantogo.mailingservices.MailSender;

import ReportGenerators.LoanFormGenerator;

/**
 * Servlet implementation class loanServlet
 */
public class loanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	    String loanTypes=request.getParameter("loanTypes");
		String incomeTypes=request.getParameter("incomeTypes");
		String fullNamePan=request.getParameter("fullNamePan");
		String panNumber=request.getParameter("panNumber");
		String dob=request.getParameter("dob");
		String aadharId=request.getParameter("aadharId");
		String mobileNumber=request.getParameter("mobileNumber");
		String fathersName=request.getParameter("fathersName");
		String mothersName=request.getParameter("mothersName");
		String curentAddress=request.getParameter("curentAddress");
		String permanentAddress=request.getParameter("permanentAddress");
		String highestQualification=request.getParameter("highestQualification");
		String loanAmount=request.getParameter("loanAmount");
		String loanTerms=request.getParameter("loanTerms");
		String OtherEmi=request.getParameter("OtherEmi");
		String accountNumber=request.getParameter("accountNumber");
		String ifsccode=request.getParameter("ifsccode");
		String accountHolder=request.getParameter("accountHolder");
		String bankAddress=request.getParameter("bankAddress");
		String employerName=request.getParameter("employerName");
		String employerAddress=request.getParameter("employerAddress");
		String monthlyIncome=request.getParameter("monthlyIncome");
		String employeeId=request.getParameter("employeeId");
		String employeeRole=request.getParameter("employeeRole");
		String uan=request.getParameter("uan");
		String loanDescription=request.getParameter("loanDescription");
		String regEmailId=request.getParameter("regEmailId");
		String emiAmountPerMonth=request.getParameter("emiAmountPerMonth");
		LoanJDBC lj= new LoanJDBC();
		try {
			lj.insertLoanDetails(loanTypes, incomeTypes, fullNamePan, panNumber, dob, aadharId, mobileNumber, fathersName,
					mothersName, curentAddress, permanentAddress, highestQualification, loanAmount, loanTerms, OtherEmi,
					accountNumber, ifsccode, accountHolder, bankAddress, employerName, employerAddress, monthlyIncome,
					employeeId, employeeRole, uan,loanDescription,regEmailId,emiAmountPerMonth);
			
			new MailSender().sendMail();
			
			new LoanFormGenerator().generateLoanFormPDF(loanTypes, incomeTypes, fullNamePan, panNumber, dob, aadharId, mobileNumber, fathersName,
					mothersName, curentAddress, permanentAddress, highestQualification, loanAmount, loanTerms, OtherEmi,
					accountNumber, ifsccode, accountHolder, bankAddress, employerName, employerAddress, monthlyIncome,
					employeeId, employeeRole, uan,loanDescription,regEmailId,emiAmountPerMonth);
			
			response.sendRedirect("login.jsp");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
