<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="a" uri="http://www.springframework.org/tags/form" %>
    <%@taglib prefix="b" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="show2">
<table>
<h1>Modify Operation</h1></br>
<tr>
<td>Trainee Id</td>
<td><input type = "text" name="tid"/></td>
</tr>
<tr>
<td> <input type="submit" value="Modify"/></td>
</tr>
</table>
</form>

<a:form action="doupdate" modelAttribute="me" method="get">
<h1>Trainee Info</h1>
<table border=2>
<b:forEach var="train" items="${temp}">
<tr>
<td> Trainee Id</td>
<td><a:input path="traineeId" value="${train.traineeId}"/></td>
</tr>
<tr>
<td> Trainee Name</td>
<td><a:input path="traineeName" value="${train.traineeName}"/></td>
</tr>
<tr>
<td> Trainee Location</td>
<td><a:input path="traineeLocation" value="${train.traineeLocation}"/></td>
</tr>
<tr>
<td> Trainee Domain</td>
<td><a:input path="traineeDomain" value="${train.traineeDomain}"/></td>
</tr>
</b:forEach>
<tr>

<td>

 <input type="submit" value="Modify"/></td>
</tr>
</table>
</a:form>
</body>
</html>