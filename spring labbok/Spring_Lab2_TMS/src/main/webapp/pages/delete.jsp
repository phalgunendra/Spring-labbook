<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/delete_confirm">
Please enter Trainee ID : <input type="text" name="traineeId"/><br/>


<button type="submit">Delete</button>
</form>
<form action="/delete_confirmed">
<TABLE border="2">
<tr><th>ID</th><th>NAME</th><th>DOMAIN</th><th>LOCATION</th></tr>
<tr>
    <td>${trainee.traineeId}</td>
    <td>${trainee.traineeName}</td>
     <td>${trainee.traineeDomain}</td>
      <td>${trainee.traineeLocation}</td>     
  </tr>
</TABLE>

<input type="text" name="traineeId" value="${trainee.traineeId}">
<button type="submit" >Delete</button></a>


<h2>Trainee Info</h2>

</form>

</body>
</html>
