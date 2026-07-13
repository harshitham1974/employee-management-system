package com.ems.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ems.dao.AdminDAO;
import com.ems.dao.EmployeeDAO;
import com.ems.entities.Admin;
import com.ems.entities.Employee;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    AdminDAO adminDAO = new AdminDAO();
    EmployeeDAO employeeDAO = new EmployeeDAO();

    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String role = request.getParameter("role");

        HttpSession session = request.getSession();

        if ("admin".equals(role)) {

            Admin admin = adminDAO.findByEmail(email);

            if (admin != null && admin.getPassword().equals(password)) {

                session.setAttribute("admin", admin);

                response.sendRedirect("admin-dashboard.jsp");

            } else {

                request.setAttribute("error", "Invalid Email or Password. Please try again.");

                request.getRequestDispatcher("admin-login.jsp")
                        .forward(request, response);

            }

        } else {

            Employee employee = employeeDAO.findByEmail(email);

            if (employee != null && employee.getPassword().equals(password)) {

                session.setAttribute("employee", employee);

                response.sendRedirect("employee-dashboard.jsp");

            } else {

                request.setAttribute("error", "Invalid Email or Password. Please try again.");

                request.getRequestDispatcher("employee-login.jsp")
                        .forward(request, response);

            }

        }

    }

}

