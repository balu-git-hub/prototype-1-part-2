<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<link rel="stylesheet" href="/css/index.css">
	</head>

	<body style="background-image: url('images/bgimage.jpg')">
		<div>
		  <form class="modal-content animate" action="/login" method="post" >
		    <div class="imgcontainer">
		      <img src="images/cute5.jpg" alt="Avatar" class="avatar">
		    </div>
		
		    <div class="container">
		      <label for="uname"><b>Username</b></label>
		      <input type="text" placeholder="Enter Username" name="uname" required>
		
		      <label for="psw"><b>Password</b></label>
		      <input type="password" placeholder="Enter Password" name="psw" required>
		        
		      <button type="submit">Login</button>
		      <span>Register <a href="registerUser">here..!</a></span>
			  
		    </div>
		
		    <div class="container" style="background-color:#f1f1f1"></div>
		  </form>

		</div>

			
	</body>
</html>