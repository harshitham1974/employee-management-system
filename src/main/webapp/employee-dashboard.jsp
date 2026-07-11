<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="com.ems.entities.Employee"%>

<%
Employee employee = (Employee)session.getAttribute("employee");

if(employee == null){
    response.sendRedirect("employee-login.jsp");
    return;
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Dashboard</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>

<body class="bg-light">

<div class="container mt-5">

<div class="card shadow">

<div class="card-header bg-success text-white">

<h2>Employee Dashboard</h2>

</div>

<div class="card-body">

<h3>Welcome <%= employee.getName() %></h3>

<hr>

<table class="table table-bordered">

<tr>
<th>ID</th>
<td><%= employee.getId() %></td>
</tr>

<tr>
<th>Name</th>
<td><%= employee.getName() %></td>
</tr>

<tr>
<th>Email</th>
<td><%= employee.getEmail() %></td>
</tr>

<tr>
<th>Phone</th>
<td><%= employee.getPhone() %></td>
</tr>

<tr>
<th>Department</th>
<td><%= employee.getDepartment() %></td>
</tr>

<tr>
<th>Salary</th>
<td><%= employee.getSalary() %></td>
</tr>

<tr>
<th>Joining Date</th>
<td><%= employee.getJoiningDate() %></td>
</tr>

</table>

<a href="#" class="btn btn-warning">
Edit Profile
</a>

<a href="logout" class="btn btn-dark">
Logout
</a>

</div>

</div>

</div>

</body>
</html>