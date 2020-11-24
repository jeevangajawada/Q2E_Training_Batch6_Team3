<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Generate Commission Report</title>
</head>
<div align=center>
	<h1>Commission Report</h1>
<body>
	
		<form action="generateCommissionReport" method="post">
			
				<div><label>Select Period</label></div>
				<div class="radio">
			      <label><input type="radio" name="resulttype" value="Monthly">Monthly</label>
			    </div>
			    <div class="radio">
			      <label><input type="radio" name="resulttype" value="Quarterly">Quarterly</label>
			    </div>
			    <div class="radio">
			      <label><input type="radio" name="resulttype" value="Annual">Annual</label>
			    </div>
			
			<input type="submit" value="Submit" class="btn btn-primary"/>
		</form>
	 </div>
	 <hr/>
	 
</body>
</html>