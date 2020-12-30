<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Stock Price</title>
</head>
<body>

	<div align=center>
		<h1>Add New Stock Prices</h1>
	</div>
	
	<div><spring:label path="companyCode">Enter company Code</spring:label></div>
					<div>
						<spring:input path="companyCode" type="text"  class="form-control"/>
						<spring:errors path="companyCode" class="error"/>
					</div>
					</div>
				</div>
				<br/>
				<div>
				<div><spring:label path="stockprice">Enter Stock Price</spring:label></div>
					<div>
						<spring:input path="stockprice" type="text"  class="form-control"/>
						<spring:errors path="stockprice" class="error"/>
					</div>
					</div>
				</div>
				<br/>
				<div>
				<div><spring:label path="currentprice">Enter Curent Price</spring:label></div>
					<div>
						<spring:input path="currentprice" type="text"  class="form-control"/>
						<spring:errors path="currentprice" class="error"/>
					</div>
					</div>
				</div>
				<br/>
				<div>
					<input type="submit" value="Save" />
				</div>
		
</body>
</html>