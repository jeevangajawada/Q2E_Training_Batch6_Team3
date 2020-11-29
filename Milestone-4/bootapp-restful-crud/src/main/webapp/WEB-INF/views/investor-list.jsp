<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table width="100%" border="1">
	<thead>
			<th>User ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>PAN Number</th>
			<th>Mobile</th>
	</thead>
	<tbody>
		<core:forEach var="investor" items="${investors}">
		<tr>
			<td>${investor.userid}</td>
			<td>${investor.firstname}</td>
			<td>${investor.lastname}</td>
			<td>${investor.pannumber}</td>
			<td>${investor.mobile}</td>
		</tr>
	</core:forEach>
	</tbody>
</table>
</body>
</html>