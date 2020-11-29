<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Commodities</title>
</head>
<div align=center>
	<h1>Add new commodity</h1>
</div>

<body>

	<br/>

	<div>
		<div><spring:label path="Commodity Name">Commodity Name</spring:label></div>
		<div>
			<spring:input path="CommodityName" type="text" />
			<spring:errors path="CommodityName" cssClass="error"/>
		</div>
		
		<div><spring:label path="Price">Enter price</spring:label></div>
			<div>
				<spring:input path="Price" type="text" />
				<spring:errors path="Price" class="error"/>
			</div>
		</div>
				
	</div>
	<br/>
	
</body>
</html>