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


@WebServlet("/updateEmployee")
public class UpdateEmployeeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String department = req.getParameter("department");
        double salary = Double.parseDouble(req.getParameter("salary"));
        LocalDate joiningDate = LocalDate.parse(req.getParameter("joiningDate"));
        String password = req.getParameter("password");

        Employee employee = new Employee();

        employee.setId(id);
        employee.setName(name);
        employee.setEmail(email);
        employee.setPhone(phone);
        employee.setDepartment(department);
        employee.setSalary(salary);
        employee.setJoiningDate(joiningDate);
        employee.setPassword(password);

        EmployeeDAO dao = new EmployeeDAO();

        dao.update(employee);

        resp.sendRedirect("viewEmployees");
    }
}