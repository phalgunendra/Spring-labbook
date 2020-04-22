<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<TABLE border="2">
<tr><th>ID</th><th>NAME</th><th>DOMAIN</th><th>LOCATION</th></tr>
<tr>
    <td>${trainee.traineeId}</td>
    <td>${trainee.traineeName}</td>
    <td>${trainee.traineeDomain}</td>
    <td>${trainee.traineeLocation}</td>     
  </tr>
</TABLE>

</body>
</html>