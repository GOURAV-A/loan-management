package com.loantogo.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.loantogo.daos.registrationjdbc;
import com.loantogo.mailingservices.MailSender;

import ReportGenerators.PDFGeneratorForm;

/**
 * Servlet implementation class registrationServlet
 */
public class registrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public registrationServlet() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName= request.getParameter("firstName");
		String userTypes=request.getParameter("userTypes");
		String lastName= request.getParameter("lastName");
		String mobile= request.getParameter("mobile");
		String emailId= request.getParameter("emailId");
		String fathersName= request.getParameter("fathersName");
		String mothersName= request.getParameter("mothersName");
		String curentAddress= request.getParameter("curentAddress");
		String permanentAddress= request.getParameter("permanentAddress");
		
		System.out.println("user types:::::"+userTypes);
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(mobile);
		System.out.println(emailId);
		System.out.println(fathersName);
		System.out.println(mothersName);
		System.out.println(curentAddress);
		System.out.println(permanentAddress);
		
		 HttpSession session = request.getSession();
		 String msg="Congratulations "+firstName+", Your registration has been successfully done. Please check your mail for login credentials.";
	     session.setAttribute("name",msg );
		
		
		registrationjdbc jj=new registrationjdbc();
		try {
			String passord=jj.add(userTypes,firstName,lastName,mobile,emailId,fathersName,mothersName,curentAddress,permanentAddress);
			
			
			new MailSender().sendMail1(emailId,passord);
			
			
			
			
			new PDFGeneratorForm().generatePDF(userTypes,firstName,lastName,mobile,emailId,fathersName,mothersName,curentAddress,permanentAddress);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("login.jsp");
	}
	

}
