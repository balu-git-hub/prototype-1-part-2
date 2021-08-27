<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<link rel="stylesheet" href="/css/register.css">
	</head>
	
	<body style="background-image: url('images/bgimage.jpg')">
		<div align="center">
        
        <form:form action="/storeUser" method="post" modelAttribute="user">
            
            <form:label path="firstName">First name:</form:label>
            <form:input path="firstName"/><br/>
            <form:errors path="firstName" cssClass="error" />
            
            <form:label path="lastName">Last name:</form:label>
            <form:input path="lastName"/><br/>
            <form:errors path="lastName" cssClass="error" />
            
            <form:label path="middleName">middle name:</form:label>
            <form:input path="middleName"/><br/>
            <form:errors path="middleName" cssClass="error" />
            
            <form:label path="address">address:</form:label>
            <form:input path="address"/><br/>
            <form:errors path="address" cssClass="error" />
             
            <script src="/js/countries.js"></script>	
                      
            <form:label path="country">Country:</form:label>
            <form:select path="country" id="country"/><br/>
            <form:errors path="country" cssClass="error" />
            
            <form:label path="state">State:</form:label>
            <form:select path="state" id="state"/><br/>
            <form:errors path="state" cssClass="error" />
            
            <script type="text/javascript">
            	populateCountries("country", "state"); 
				populateCountries("country2");
				populateCountries("country2");
            </script>
            
			
            <form:label path="zipcode">postal code:</form:label>
            <form:input path="zipcode"  alt="zip code"/><br/>
            <form:errors path="zipcode" cssClass="error" />
             
            <form:label path="email">E-mail:</form:label>
            <form:input path="email"/><br/>
            <form:errors path="email" cssClass="error" />
            
            <form:label path="phoneNumber">Phone Number:</form:label>
            <form:input path="phoneNumber"/><br/>
            <form:errors path="phoneNumber" cssClass="error" />
            
            <form:label path="userName">User Name:</form:label>
            <form:input path="userName"/><br/>
            <form:errors path="userName" cssClass="error" />
         
        	<form:label path="passWord">Password:</form:label>
            <form:input path="passWord"/><br/>
            <form:errors path="passWord" cssClass="error" />
                 
            <form:button id="button">Register</form:button>
            
            
        </form:form>
        
    </div>
	</body>
</html>