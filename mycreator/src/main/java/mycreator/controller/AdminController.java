package mycreator.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mycreator.dao.AdminDAO;
import mycreator.dao.StudentDao;
import mycreator.model.Branch;
import mycreator.model.Department;

public class AdminController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI().toString();
		AdminDAO adminDAO = new AdminDAO();
		System.out.println(uri);
		
		if(uri.contains("departement")&&(request.getMethod().equals("GET")))
		{
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/jsp/adddepartement.jsp");
			requestDispatcher.forward(request, response);
		}
		else if(uri.contains("branch")&&(request.getMethod().equals("GET")))
		{
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/jsp/addbranch.jsp");
			requestDispatcher.forward(request, response);
		}
		else if(uri.contains("batchperiod")&&(request.getMethod().equals("GET")))
		{
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/jsp/addnewuser.jsp");
			requestDispatcher.forward(request, response);
		}
		else if(uri.contains("compliationstatus")&&(request.getMethod().equals("GET")))
		{
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/jsp/addnewuser.jsp");
			requestDispatcher.forward(request, response);
		}
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uri = request.getRequestURI().toString();
		AdminDAO adminDAO = new AdminDAO();
		if(uri.contains("departement")&&(request.getMethod().equals("POST")))
		{
			Department department = new Department();
			department.setDepartmentName(request.getParameter("departmentName"));
			department.setDepartmentAddedOn(String.valueOf(java.time.LocalDate.now()));
			HttpSession httpSession = request.getSession();
			department.setDepartmentAddedBy((int)httpSession.getAttribute("userId"));
			try {
				adminDAO.addDepartmentDetails(department);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/jsp/adddepartement.jsp");
				requestDispatcher.forward(request, response);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		else if(uri.contains("branch")&&(request.getMethod().equals("POST")))
		{
			Branch branch = new Branch();
			
		}
		else if(uri.contains("batchperiod")&&(request.getMethod().equals("POST")))
		{
			
		}
		else if(uri.contains("compliationstatus")&&(request.getMethod().equals("POST")))
		{
			
		}
	}

}
