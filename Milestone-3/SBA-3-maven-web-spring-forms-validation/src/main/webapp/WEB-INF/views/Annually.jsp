<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%--Add reference to tag library --%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Annual Report</title>
<style type="text/css">
	.error{
		color: red;
	}
</style>
</head>
<body>

<h2>Annual Report</h2>

<a href="InvestorDashboardPage.jsp" style="float: right;"> <b> Investor DashBoard Page </b> </a> <br> <br>
<br>

<spring:form action="annual-report" method="post" modelAttribute="investor">

<div>
			<div><spring:label path="year">Enter a Date to Generate Annual Report</spring:label></div>
			<div><spring:input path="year" type="date" /></div>
			<spring:errors path="year" cssClass="error"/>
		</div>
	<br/>

</spring:form>
</body>

</html>