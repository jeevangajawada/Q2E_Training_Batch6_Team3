<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Company</title>
</head>
<body>
	
	<spring:form action="company-register" method="post" modelAttribute="Company">
	
	<br/>
	
	<div>
			<div><spring:label path="Company Code">Company Code</spring:label></div>
			<div><spring:input path="Company Code" type="text" /></div>
			<spring:errors path="Company Code" cssClass="error"/>
		</div>
	<br/>
	
	<div>
		<div><spring:label path="Company Name">Company Name</spring:label></div>
		<div>
			<spring:input path="CompanyName" type="text" />
			<spring:errors path="CompanyName" cssClass="error"/>
		</div>
	</div>
	<br/>
	
	<div>
		<div><spring:label path="Operations">Operations</spring:label></div>
		<div>
			<spring:input path="Operations" type="text" />
			<spring:errors path="Operations" cssClass="error"/>
		</div>
	</div>
	<br/>
	
	<div>
			<div><spring:label path="Share Count">Share Count</spring:label></div>
			<div><spring:input path="Share Count" type="Share Count" /></div>
			<spring:errors path="Share Count" cssClass="error"/>
		</div>
	<br/>
	
	<div>
			<div><spring:label path="Open Share Price in USD">Open Share Price in USD</spring:label></div>
			<div><spring:input path="Open Share Price in USD" type="text" />
			<spring:errors path="Open Share Price in USD" cssClass="error"/></div>
		</div>
	<br/>
	
	<div>
		<div><spring:label path="Sector">Sector</spring:label></div>
		<div><spring:input path="Sector" type="text" />
		<spring:errors path="Sector" cssClass="error"/></div>
	</div>
	<br/>

	<div>
			<div><spring:label path="Turnover">Turnover</spring:label></div>
			<div><spring:input path="Turnover" type="text" /></div>
			<spring:errors path="Turnover" cssClass="error"/>
		</div>
	<br/>
	
		<input type="submit" value="Register" />
		
</spring:form>
<hr/>	
	<jsp:include page="footer.jsp"/>
	
	
</body>
</html>