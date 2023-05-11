package userAuth;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Registered extends HttpServlet  {
	public void service (HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String username = req.getParameter("username");
		
		PrintWriter p = res.getWriter();
		
		p.println("Name:"+name);
		p.println("Email:"+email);
		p.println("Username: "+ username);
		p.println("Registered Successfully");
		
		
	}
}
