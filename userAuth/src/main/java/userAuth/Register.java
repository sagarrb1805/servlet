package userAuth;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("fullName");
		String email = request.getParameter("email");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		
		request.setAttribute("name", name);
		request.setAttribute("email", email);
		request.setAttribute("password", password);
		request.setAttribute("username", userName);
		
		RequestDispatcher rd = request.getRequestDispatcher("Registered");
		rd.forward(request, response);
		
		
		
		
//		System.out.println(name+ email+userName+password);
	}

}
