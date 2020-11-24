<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PMS Home Page</title>
</head>

<body>
	<jsp:include page="header.jsp"/>
<hr/>

<H2> <U> Investor </U> </H2>

<label for="New User"> <b> New User </b> </label>

<a href="registration"> <b> Register </b> </a>

<label for="Existing User"> <br> <br> <b> Existing User </b> </label>

<a href="investorlogin"> <b> Login </b> </a>


<H2> <U> BackOffice User </U> </H2>

<label for="Existing User Back"> <b> Existing User </b> </label>

<a href="backofficelogin"> <b> Login </b> </a>

<hr/>
	<jsp:include page="footer.jsp"/>
</body>

</html>