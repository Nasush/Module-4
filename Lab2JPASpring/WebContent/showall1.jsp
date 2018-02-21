<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Trainee Details</h1>

<table border=1>
<tr>
<th> Trainee Id</th>
<th> Trainee Name</th>
<th> Trainee Location</th>
<th> Trainee Domain</th>
</tr>
<a:forEach var="train" items="${temp}">
<tr>
<td>${train.traineeId}</td>
<td>${train.traineeName}</td>
<td>${train.traineeLocation}</td>
<td>${train.traineeDomain}</td>
</tr>
</a:forEach>
</table>
</body>
</html>