<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class = "container col-md-5">
<form action="/success">

<div class = "form-group">
<label>Trainee ID</label>
<input type="text" class="form-control"  name="traineeId"></input>
<div class = "form-group">
<label> Trainee Name</label>
<input type="text" class="form-control"  name="traineeName"></input></div>
<div class = "form-group">
<label>Trainee Location</label>
 <input type="radio"  name="traineeLocation" value="Chennai" checked> Chennai<br>
  <input type="radio" name="traineeLocation" value="banglore"> Banglore<br>
  <input type="radio"  name="traineeLocation" value="pune"> Pune<br>
  <input type="radio"  name="traineeLocation" value="mumbai">Mumbai<br></div>
   <div class = "form-group">
<label>Trainee Domain</label>
<select name="traineeDomain" class="form-control" >  
           <option value="JEE">JEE</option>
           <option value="FSD">FSD</option>
           <option value="Angular">Angular</option>
           </select>

</div>
<button type="submit" class="btn btn-primary">ADD</button>
</div>
</form>
</div>





</body>
</html>