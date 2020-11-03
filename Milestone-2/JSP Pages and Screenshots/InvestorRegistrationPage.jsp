<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Investor Registration Page</title>
</head>

<body>

<H1> Welcome to Investor Registration Page </H1>

<form action="InvestorDashboardPage.jsp">

  <label for="username"> User ID </label>
  <input type="text" id="username" name="username"><br> <br>
  
  <label for="password"> Password </label>
  <input type="password" id="pws" name="pwd"><br> <br>
  
   <label for="password"> Re-Enter Password </label>
  <input type="password" id="pws1" name="pwd1"><br> <br>
  
  <label for="firstname"> First Name </label>
  <input type="text" id="firstname" name="firstname"><br> <br>
  
  <label for="lastname"> Last Name </label>
  <input type="text" id="lastname" name="latname"><br> <br>
  
  <label for="PAN Number"> PAN Number </label>
  <input type="text" id="pan" name="pan"><br> <br>
  
   <label for="gender"> Gender </label>
  <input type="radio" id="male" name="gender" value="male">
  <label for="male">Male</label>
  <input type="radio" id="female" name="gender" value="female">
  <label for="female">Female</label><br> <br>

  <label for="pace"> Place </label>
  <input type="text" id="place" name="place"><br> <br>
  
  <label for="Address"> Address </label>
  <input type="text" id="Address" name="Address"><br> <br>
  
  <label for="Mobile"> Mobile </label>
  <input type="text" id="Mobile" name="Mobile"><br> <br>
  
  <label for="Email Id"> Email Id </label>
  <input type="text" id="Email Id" name="Email Id"><br> <br>
  
  <label for="Amount Invested"> Amount Invested </label>
  <input type="text" id="Amount Invested" name="Amount Invested" value = "2500"><br> <br>
  
  <input type="submit" value="Create Profile">
  <input type="submit" value="Save Profile">
  <input type="submit" value="Cancel Registration">
  
  </form> 
  
</body>
</html>