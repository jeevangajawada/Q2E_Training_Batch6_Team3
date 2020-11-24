<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%--Add reference to tag library --%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Buy Stocks</title>
<style type="text/css">
	.error{
		color: red;
	}
</style>
</head>
<body>

<h2>Buy Stocks</h2>

<a href="InvestorDashboardPage.jsp" style="float: right;"> <b> Investor DashBoard Page </b> </a> <br> <br>
<br>

<spring:form action="buy-stocks" method="post" modelAttribute="investor">

	<div>
		<div><spring:label path="stockName">Stock Name : </spring:label></div>
		<div>
			<spring:input path="stockName" type="text" />
			<spring:errors path="stockName" cssClass="error"/>
		</div>
	</div>
	
	
	<div>
		<div><spring:label path="orderQuantity">Order Quantity : </spring:label></div>
		<div>
			<spring:input path="orderQuantity" type="text" />
			<spring:errors path="orderQuantity" cssClass="error"/>
		</div>
	</div>
    
    
	<div>
		<div><spring:label path="currentPrice">Stock Current Price : </spring:label></div>
		<div>
			<spring:input path="currentPrice" type="text" />
			<spring:errors path="currentPrice" cssClass="error"/>
		</div>
	</div>
    
	
	<input type="submit" value="Place New Order" />
	<input type="submit" value="Reset" />
	
	</spring:form>


</body>

</html>