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

@WebServlet("/updateProfile")
public class UpdateProfileServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

    	 int id = Integer.parseInt(req.getParameter("id"));

         EmployeeDAO dao = new EmployeeDAO();

         // Fetch existing employee from database
         Employee employee = dao.findById(id);

         // Update only editable fields
         employee.setName(req.getParameter("name"));
         employee.setEmail(req.getParameter("email"));
         employee.setPhone(req.getParameter("phone"));
         employee.setDepartment(req.getParameter("department"));
         employee.setJoiningDate(LocalDate.parse(req.getParameter("joiningDate")));
         employee.setPassword(req.getParameter("password"));

         dao.updateOwnDetails(employee);

         resp.sendRedirect("employee-dashboard.jsp");
    }
}