<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%--Add reference to tag library --%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Within Period Report</title>
<style type="text/css">
	.error{
		color: red;
	}
</style>
</head>
<body>

<h2>Within Period Report</h2>

<a href="InvestorDashboardPage.jsp" style="float: right;"> <b> Investor DashBoard Page </b> </a> <br> <br>
<br>

<spring:form action="withinperiod-report" method="post" modelAttribute="investor">

<div>
			<div><spring:label path="date">Enter a Date From</spring:label></div>
			<div><spring:input path="date" type="date" /></div>
			<spring:errors path="date" cssClass="error"/>
		</div>
	<br/>
	
	<div>
			<div><spring:label path="date">Enter a Date To</spring:label></div>
			<div><spring:input path="date" type="date" /></div>
			<spring:errors path="date" cssClass="error"/>
		</div>
	<br/>

</spring:form>
</body>

</html>