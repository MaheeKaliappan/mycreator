package mycreator.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import mycreator.model.StudentDetails;
import mycreator.model.User;

public class LoginController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI().toString();
		System.out.println("login");
		if(uri.contains("login"))
		{
			HttpSession httpSession = request.getSession();
			User user = new User();
			httpSession.setAttribute("userFirstName",user.getUserFirstName());
			httpSession.setAttribute("userLastName", user.getUserLastName());
			System.out.println(user.getUserFirstName());
			httpSession.setAttribute("userId", user.getUserId());
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
