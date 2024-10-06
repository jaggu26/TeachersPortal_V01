package demo;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");		
		String password = request.getParameter("password");		
	
		//Add Ternery Operators please...
		if (email.equals("vaheeb@gmail.com") && password.equals("1234")) {
			System.out.println("Succefuull");
		}else {
			System.out.println("failed login !!!!");
		}
		//Add One more servlet for accountcreation please.
		
	}

}
