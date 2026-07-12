<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="com.ems.entities.Employee"%>

<%
Employee employee = (Employee) request.getAttribute("employee");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Employee</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

</head>

<body class="bg-light">

<div class="container mt-5">

<div class="card shadow">

<div class="card-header bg-warning">

<h2>Edit Employee</h2>

</div>

<div class="card-body">

<form action="updateEmployee" method="post">

<input type="hidden"
	   name="id"
	   value="<%= employee.getId() %>">

<div class="mb-3">

<label>Name</label>

<input
type="text"
name="name"
class="form-control"
value="<%= employee.getName() %>"
required>

</div>

<div class="mb-3">

<label>Email</label>

<input
type="email"
name="email"
class="form-control"
value="<%= employee.getEmail() %>"
required>

</div>

<div class="mb-3">

<label>Phone</label>

<input
type="text"
name="phone"
class="form-control"
value="<%= employee.getPhone() %>"
required>

</div>

<div class="mb-3">

<label>Department</label>

<input
type="text"
name="department"
class="form-control"
value="<%= employee.getDepartment() %>"
required>

</div>

<div class="mb-3">

<label>Salary</label>

<input
type="number"
step="0.01"
name="salary"
class="form-control"
value="<%= employee.getSalary() %>"
required>

</div>

<div class="mb-3">

<label>Joining Date</label>

<input
type="date"
name="joiningDate"
class="form-control"
value="<%= employee.getJoiningDate() %>"
required>

</div>

<div class="mb-3">

<label>Password</label>

<input
type="text"
name="password"
class="form-control"
value="<%= employee.getPassword() %>"
required>

</div>

<button class="btn btn-success">

Update Employee

</button>

<a href="viewEmployees"
class="btn btn-secondary">

Cancel

</a>

</form>

</div>

</div>

</div>

</body>
</html>