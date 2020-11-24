<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%--Add reference to tag library --%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Withdraw Report</title>
<style type="text/css">
	.error{
		color: red;
	}
</style>
</head>
<body>

<h2>Withdraw Report</h2>

<a href="InvestorDashboardPage.jsp" style="float: right;"> <b> Investor DashBoard Page </b> </a> <br> <br>
<br>

<ul>
<li> <a href="Annually.jsp"> Annual Report </a> </li>
<li> <a href="Monthly.jsp"> Monthly Report</a> </li>
<li> <a href="WithinPeriod.jsp"> Within given period Report</a> </li>
</ul>

</body>
</html>