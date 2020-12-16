<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%--Add reference to tag library --%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Select Company And Access Profile</title>
<style type="text/css">
	.error{
		color: red;
	}
</style>
</head>
<body>

<h2>Select Company And Access Profile</h2>

<a href="InvestorDashboardPage.jsp" style="float: right;"> <b> Investor DashBoard Page </b> </a> <br> <br>
<br>


<spring:form action="SearchCompanies" method="post" modelAttribute="investor">

	<div>
		<div><spring:label path="searchCompany">Company Name : </spring:label></div>
		<div>
			<spring:input path="searchCompany" type="text" />
			<spring:errors path="searchCompany" cssClass="error"/>
		</div>
	</div>
	
		
	<input type="submit" value="Search" />
	<input type="submit" value="Reset" />
	
	</spring:form>

</body>

</html>