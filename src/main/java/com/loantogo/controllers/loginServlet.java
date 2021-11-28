package com.loantogo.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.loantogo.daos.loginjdbc;


public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String userid= request.getParameter("userid");
		String password= request.getParameter("password");
	//	String Captcha=request.getParameter("captcha");
		
		
		
		System.out.println(userid);
		System.out.println(password);
		//System.out.println(mobile);
		
		loginjdbc lj=new loginjdbc();
		try {
			String res=lj.add(userid,password);
			
		
			
			if(res.equals("PostLoginAdmin"))
			{
				response.sendRedirect("PostLoginAdmin.jsp");
			}
			else if(res.equals("PostLoginUser"))
			{
				response.sendRedirect("PostLoginUser.jsp");
			}
			else if(res.equals("InvalidCredentials"))
			{
				response.sendRedirect("login.jsp");
				
			}
			else if(res.equals("PasswordChange"))
			{
				response.sendRedirect("forgotPassword.jsp");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
