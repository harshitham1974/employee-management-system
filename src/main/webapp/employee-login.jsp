<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Login</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>

<body class="bg-light">

<div class="container mt-5">

<div class="row justify-content-center">

<div class="col-md-5">

<div class="card shadow">

<div class="card-header text-center">
<h3>Employee Login</h3>
</div>

<div class="card-body">

<%
if(request.getAttribute("error") != null){
%>

<div class="alert alert-danger">
<%= request.getAttribute("error") %>
</div>

<%
}
%>

<%
if(request.getAttribute("success") != null){
%>

<div class="alert alert-success">
<%= request.getAttribute("success") %>
</div>

<%
}
%>

<form action="login" method="post">

<input type="hidden" name="role" value="employee">

<div class="mb-3">
<label>Email</label>
<input type="email" name="email" class="form-control" required>
</div>

<div class="mb-3">
<label>Password</label>
<input type="password" name="password" class="form-control" required>
</div>

<div class="text-center">

<button class="btn btn-primary">
Login
</button>

</div>

</form>

<hr>

<div class="text-center">

Don't have an account?

<a href="register.jsp">

Register Here

</a>

</div>

</div>

</div>

</div>

</div>

</div>

</body>
</html>