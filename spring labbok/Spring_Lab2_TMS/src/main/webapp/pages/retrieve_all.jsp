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

<TABLE border="2">
<tr><th>ID</th><th>NAME</th><th>DOMAIN</th><th>LOCATION</th></tr>
<c:forEach items="${trainee}" var="trainee">
 <tr>
 <td><c:out value="${trainee.traineeId}"/></td>
 <td><c:out value="${trainee.traineeName}"/></td>
 <td><c:out value="${trainee.traineeDomain}"/></td>
 <td><c:out value="${trainee.traineeLocation}"/></td>
 </tr>
  </c:forEach>
</TABLE>

</body>
</html>