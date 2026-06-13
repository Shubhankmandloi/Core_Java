package com.rays.ctl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UserRegistrationClt")
public class UserRegistrationClt extends HttpServlet {
	
       
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("UserRegistration.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("firstName"));
		System.out.println(request.getParameter("lastName"));
		System.out.println(request.getParameter("email"));
		System.out.println(request.getParameter("password"));
		System.out.println(request.getParameter("dob"));
		RequestDispatcher rd = request.getRequestDispatcher("UserRegistration.jsp");
		rd.forward(request, response);
	}

}
