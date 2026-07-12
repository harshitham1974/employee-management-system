<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.util.List"%>
<%@ page import="com.ems.entities.Employee"%>

<%
List<Employee> employees = (List<Employee>) request.getAttribute("employees");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Employees</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

</head>

<body class="bg-light">

<div class="container mt-5">

<div class="card shadow">

<div class="card-header bg-primary text-white">

<h2>Employee List</h2>

</div>

<div class="card-body">

<table class="table table-bordered table-hover">

<thead class="table-dark">

<tr>

<th>ID</th>
<th>Name</th>
<th>Email</th>
<th>Phone</th>
<th>Department</th>
<th>Salary</th>
<th>Joining Date</th>
<th>Action</th>

</tr>

</thead>

<tbody>

<%
if(employees != null){

for(Employee employee : employees){
%>

<tr>

<td><%= employee.getId() %></td>

<td><%= employee.getName() %></td>

<td><%= employee.getEmail() %></td>

<td><%= employee.getPhone() %></td>

<td><%= employee.getDepartment() %></td>

<td><%= employee.getSalary() %></td>

<td><%= employee.getJoiningDate() %></td>

<td>

<a href="editEmployee?id=<%= employee.getId() %>"
class="btn btn-warning btn-sm">
Edit
</a>

<a href="deleteEmployee?id=<%= employee.getId() %>"
class="btn btn-danger btn-sm"
onclick="return confirm('Are you sure you want to delete this employee?');">
Delete
</a>

</td>

</tr>

<%
}
}
%>

</tbody>

</table>

<a href="admin-dashboard.jsp" class="btn btn-secondary">
Back
</a>

</div>

</div>

</div>

</body>
</html>