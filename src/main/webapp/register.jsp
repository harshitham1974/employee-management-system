<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Registration</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>

<body class="bg-light">

<div class="container mt-5">

<div class="row justify-content-center">

<div class="col-md-6">

<div class="card shadow">

<div class="card-header text-center">
<h3>Employee Registration</h3>
</div>

<div class="card-body">

<!-- Error Message -->
<%
if(request.getAttribute("error") != null){
%>

<div class="alert alert-danger text-center">
    <%= request.getAttribute("error") %>
</div>

<%
}
%>

<!-- Success Message -->
<%
if(request.getAttribute("success") != null){
%>

<div class="alert alert-success text-center">
    <%= request.getAttribute("success") %>
</div>

<%
}
%>

<form action="register" method="post">

<div class="mb-3">
<label>Name</label>
<input type="text" class="form-control" name="name" required>
</div>

<div class="mb-3">
<label>Email</label>
<input type="email" class="form-control" name="email" required>
</div>

<div class="mb-3">
<label>Phone</label>
<input type="text" class="form-control" name="phone" required>
</div>

<div class="mb-3">
<label>Department</label>
<input type="text" class="form-control" name="department" required>
</div>

<div class="mb-3">
<label>Joining Date</label>
<input type="date" class="form-control" name="joiningDate" required>
</div>

<div class="mb-3">
<label>Password</label>
<input type="password" class="form-control" name="password" required>
</div>

<div class="mb-3">
<label>Confirm Password</label>
<input type="password" class="form-control" name="confirmPassword" required>
</div>

<div class="text-center">
<button class="btn btn-primary">Register</button>
</div>

</form>

</div>

<div class="card-footer text-center">

Already have an account?

<a href="employee-login.jsp">Login</a>

</div>

</div>

</div>

</div>

</div>

</body>
</html>