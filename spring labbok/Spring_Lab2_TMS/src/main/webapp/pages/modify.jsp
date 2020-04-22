<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/modify_confirm">
Please enter Trainee ID : <input type="text" name="traineeId"/><br/>

<button type="submit">Modify</button>
</form>
<div class = "container col-md-5">

<form action="/home">
<h2>Trainee Info</h2>

			<div class = "form-group">
			<label>Trainee ID</label>
			<input type="text" class="form-control"  name="traineeId" value="${trainee.traineeId}"></input><br/>
			<label>Trainee Name</label>
			<input type="text" class="form-control"  name="traineeName" value="${trainee.traineeName}"></input><br/>
			<label>Trainee Location :</label>
				<input type="radio"  name="traineeLocation" value="${trainee.traineeLocation}">Chennai</input>
				<input type="radio"  name="traineeLocation" value="${trainee.traineeLocation}">Banglore</input>
				<input type="radio"  name="traineeLocation" value="${trainee.traineeLocation}">Pune</input>
				<input type="radio"  name="traineeLocation" value="${trainee.traineeLocation}">Mumbai</input><br/>
			<label>Trainee Domain :</label>
			<select name="traineeDomain" class="form-control">  
            <option value="${trainee.traineeDomain}">JEE</option>
            <option value="${trainee.traineeDomain}">FSD</option>
            <option value="${trainee.traineeDomain}">Angular</option>
            </select>
            <br/>
			
			<button type="submit" class="btn btn-primary">Add Trainee</button>
			</div>
		</form>
	</div>

</body>
</html>