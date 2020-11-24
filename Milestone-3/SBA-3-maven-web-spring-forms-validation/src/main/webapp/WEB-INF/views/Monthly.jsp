<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%--Add reference to tag library --%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Monthly Report</title>
<style type="text/css">
	.error{
		color: red;
	}
</style>
</head>
<body>

<h2>Monthly Report</h2>

<a href="InvestorDashboardPage.jsp" style="float: right;"> <b> Investor DashBoard Page </b> </a> <br> <br>
<br>

<spring:form action="monthly-report" method="post" modelAttribute="investor">

<div>
			<div><spring:label path="month">Enter a Date to Generate Annual Report</spring:label></div>
			<div><spring:input path="month" type="date" /></div>
			<spring:errors path="month" cssClass="error"/>
		</div>
	<br/>

</spring:form>
</body>

</html>