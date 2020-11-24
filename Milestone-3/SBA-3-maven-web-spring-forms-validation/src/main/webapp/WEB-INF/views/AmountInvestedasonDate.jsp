<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%--Add reference to tag library --%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Amount Invested as on Date</title>
<style type="text/css">
	.error{
		color: red;
	}
</style>
</head>
<body>

<h2>Amount Invested as on Date</h2>

<a href="InvestorDashboardPage.jsp" style="float: right;"> <b> Investor DashBoard Page </b> </a> <br> <br>
<br>


<table border="1">
<tbody>
<tr style="font-weight:bold">
<th>Stock Name</th>
<th>Industry</th>
<th>Quantity</th>
<th>Hold Value</th>
<th>Market Value </th>
<th>Profit or Loss </th>
</tr>
</tbody>
</table>

</body>

</html>