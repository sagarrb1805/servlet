package userAuth;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("login page clicked");
	}

}
