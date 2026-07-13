package com.ems.servlets;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ems.dao.EmployeeDAO;
import com.ems.entities.Employee;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String name = req.getParameter("name");
		 String email = req.getParameter("email");
		 String phone = req.getParameter("phone");
		 String department = req.getParameter("department");
		 String joiningDate = req.getParameter("joiningDate");
		 String password = req.getParameter("password");
		 String confirmPassword = req.getParameter("confirmPassword");
		 
		 EmployeeDAO dao = new EmployeeDAO();
		 
		 if (dao.existsByEmail(email)) {
			 req.setAttribute("error", "Email already registered");
			 req.getRequestDispatcher("register.jsp").forward(req, resp);
	         return;	      
		 }
		 if (!password.equals(confirmPassword)) {
			 req.setAttribute("error", "Passwords do not match");
			 req.getRequestDispatcher("register.jsp").forward(req, resp);
			 return;	      
		 }
		 
		 Employee employee = new Employee();
		 
		 employee.setName(name);
	     employee.setEmail(email);
	     employee.setPhone(phone);
	     employee.setDepartment(department);
	     employee.setSalary(0);
	     employee.setJoiningDate(LocalDate.parse(joiningDate));
	     employee.setPassword(password);
	     
	     dao.save(employee);
	     
	     req.setAttribute("success","Registration Successful. Please Login.");
	     
	     req.getRequestDispatcher("employee-login.jsp").forward(req, resp);
	        
	}

}
