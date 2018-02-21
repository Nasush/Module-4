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
<form action="show">
<table>
<th>Delete Operation</th></br>
<tr>
<td>Trainee Id</td>
<td><input type = "text" name="tid"/></td>
</tr>
<tr>
<td> <input type="submit" value="Delete"/></td>
</tr>
</table>
</form>


<form action="dodelete">
<th>Trainee Info</th></br>
<table border=2>
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
<input type="hidden" name="iiid" value="${train.traineeId}"/></br>
</tr>
</a:forEach>
<tr>

<td>

 <input type="submit" value="Delete"/></td>
</tr>
</table>
</form>
</body>
</html>