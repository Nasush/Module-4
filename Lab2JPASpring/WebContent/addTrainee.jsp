<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="for" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<for:form method="post" action="insertdata" modelAttribute="my">
<table>
 <tr>
<td> Trainee Id</td>
<td><for:input path="traineeId"/></td>
</tr>
<tr>
<td> Trainee Name</td>
<td><for:input path="traineeName"/></td>
</tr>

<tr>
<td>Trainee Location</td>
<td><for:radiobutton path="traineeLocation" value="chennai"/>chennai</td>
<td><for:radiobutton path="traineeLocation" value="Bangalore"/>Bangalore</td>
<td><for:radiobutton path="traineeLocation" value="Pune"/>Pune</td>
<td><for:radiobutton path="traineeLocation" value="Mumbai"/>Mumbai</td>
</tr>

<tr>
<td>Trainee Domain</td>
<td><for:select path="traineeDomain" items="${deg}"/>
</td>
</tr>

<tr>
<td><for:button type="submit" value="Add Employee"/>
</td>
</tr>
</table>
</for:form>

</body>
</html>