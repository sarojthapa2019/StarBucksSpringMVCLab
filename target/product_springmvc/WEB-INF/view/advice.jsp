<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<head>
<title>Starbuck's</title>
</head>
<body>
<h2>Ask for advice about your favorite roast:</h2>
<p />
<form action = "advice.do" method="post">
<select name="type"   >

	  		<c:forEach var="roast" items="${roasts}">
	    		<option value="${roast}" > ${roast}</option>
			</c:forEach>

</select>

<p><input type="submit" value = "Submit"/></p>
</form>
  
 </body>
</html>
