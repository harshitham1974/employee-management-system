<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Management System</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
body{
    background:#f4f6f9;
}

.card{
    border-radius:15px;
}

.btn{
    width:180px;
}
</style>

</head>

<body>

<div class="container mt-5">

<div class="row justify-content-center">

<div class="col-md-7">

<div class="card shadow">

<div class="card-header bg-primary text-white text-center">

<h2>Employee Management System (EMS)</h2>

</div>

<div class="card-body text-center">

<h4 class="mb-4">Choose Your Portal</h4>

<a href="admin-login.jsp" class="btn btn-danger btn-lg m-3">
<i class="bi bi-person-workspace"></i> Admin Login
</a>

<br>

<a href="register.jsp" class="btn btn-success btn-lg m-3">
<i class="bi bi-person"></i> Employee Login
</a>

<br>

<a href="employee-login.jsp" class="btn btn-primary btn-lg m-3">
<i class="bi bi-person-plus"></i> Employee Registration
</a>

</div>

<div class="card-footer text-center">

<p>Developed using Java, JSP, Servlets, Hibernate & PostgreSQL</p>

</div>

</div>

</div>

</div>

</div>

</body>
</html>