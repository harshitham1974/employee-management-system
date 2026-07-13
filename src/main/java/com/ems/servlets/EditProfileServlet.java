package com.ems.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ems.entities.Employee;

@WebServlet("/editProfile")
public class EditProfileServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        HttpSession session = req.getSession(false);

        if(session == null || session.getAttribute("employee") == null) {
            resp.sendRedirect("employee-login.jsp");
            return;
        }

        Employee employee = (Employee) session.getAttribute("employee");

        req.setAttribute("employee", employee);

        req.getRequestDispatcher("edit-profile.jsp").forward(req, resp);
    }
}