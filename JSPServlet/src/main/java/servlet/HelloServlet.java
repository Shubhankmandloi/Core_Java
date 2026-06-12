package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("In do get method");
		RequestDispatcher rd = req.getRequestDispatcher("HelloView.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("in dopost method");
		System.out.println(req.getParameter("firstName"));
		System.out.println(req.getParameter("lastName"));
		System.out.println(req.getParameter("loginId"));
		System.out.println(req.getParameter("password"));
		System.out.println(req.getParameter("dob"));
		RequestDispatcher rd = req.getRequestDispatcher("HelloView.jsp");
		rd.forward(req, resp);
	}


}
