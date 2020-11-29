<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%--Add reference to tag library --%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sell Stocks</title>
<style type="text/css">
	.error{
		color: red;
	}
</style>
</head>
<body>

<h2>Sell Stocks</h2>

<a href="InvestorDashboardPage.jsp" style="float: right;"> <b> Investor DashBoard Page </b> </a> <br> <br>
<br>

<spring:form action="sell-stocks" method="post" modelAttribute="investor">

	<div>
		<div><spring:label path="existedStockName">Stock Name : </spring:label></div>
		<div>
			<spring:input path="existedStockName" type="text" />
			<spring:errors path="existedStockName" cssClass="error"/>
		</div>
	</div>
	
	
	<div>
		<div><spring:label path="sellQuantity">Sell Quantity : </spring:label></div>
		<div>
			<spring:input path="sellQuantity" type="text" />
			<spring:errors path="sellQuantity" cssClass="error"/>
		</div>
	</div>
    
    
	<div>
		<div><spring:label path="triggerPrice">Stock Trigger Price : </spring:label></div>
		<div>
			<spring:input path="triggerPrice" type="text" />
			<spring:errors path="triggerPrice" cssClass="error"/>
		</div>
	</div>
    
	
	<input type="submit" value="Place New Order" />
	<input type="submit" value="Reset" />
	
	</spring:form>


</body>

</html>