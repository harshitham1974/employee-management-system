package com.ems.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ems.dao.EmployeeDAO;


@WebServlet("/deleteEmployee")
public class DeleteEmployeeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));

        EmployeeDAO dao = new EmployeeDAO();

        dao.delete(id);

        resp.sendRedirect("viewEmployees");
    }
}