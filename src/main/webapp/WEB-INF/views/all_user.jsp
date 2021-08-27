<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>Read Contacts</h1>
    <table border="2" width="70%" cellpadding="2">
        <tr>
            <th>Id</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Middle Name</th>
            <th>Address</th>
            <th>Country</th>
            <th>State</th>
            <th>Zip Code</th>
            <th>Email</th>
            <th>Phone Number</th>
            
        </tr>
        <c:forEach var="users" items="${user}">
            <tr>
                <td>${users.id}</td>
                <td>${users.firstName}</td>
                <td>${users.lastName}</td>
                <td>${users.middleName}</td>
                <td>${users.address}</td>
                <td>${users.country}</td>
                <td>${users.state}</td>
                <td>${users.zipcode}</td>
                <td>${users.email}</td>
                <td>${users.phoneNumber}</td>
                <td><a href="/delete-user/${users.id}">Delete</a></td>
                
            </tr>
        </c:forEach>
    </table>
<br/>
	
</body>
</html>