<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="com.ems.entities.Admin"%>

<%
Admin admin = (Admin)session.getAttribute("admin");

if(admin == null){
    response.sendRedirect("admin-login.jsp");
    return;
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Dashboard</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>

<body class="bg-light">

<div class="container mt-5">

<div class="card shadow">

<div class="card-header bg-danger text-white">

<h2>Admin Dashboard</h2>

</div>

<div class="card-body">

<h4>Welcome <%= admin.getName() %></h4>

<hr>

<a href="#" class="btn btn-success">
Add Employee
</a>

<a href="#" class="btn btn-primary">
View Employees
</a>

<a href="logout" class="btn btn-dark">
Logout
</a>

</div>

</div>

</div>

</body>
</html>