<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 4 MVC - Hello World Example | BORAJI.COM</title>
</head>
<body>
	<h2>${message}</h2>
	<h4>Server date time is : ${date} </h4>
	
	<h2> Uername </h2>${uname}
	<h2>ArrayList Data</h2>
	<br><br>
	<table>
	<c:forEach items="${arraylist}" var="obj">
		<tr>
		
			<td>
    			<c:out value="${obj.name}"/>
    			<c:out value="${obj.empid}"/>
    			<c:out value="${obj.address}" />
			</td>
				
		</tr>
		</c:forEach>
	</table>
	

<br><br><br>	
	Got data
	
		<table >
		<tr>
			<td>Username :</td>
			<td>${userName }</td>
		</tr>
		
		<tr>
			<td>Emp ID : </td>
			<td>${userEmpid }</td>
		</tr>
	
		<tr>
			<td>Address : </td>
			<td>${userAddress }</td>
		</tr>
	</table>
</body>
</html>