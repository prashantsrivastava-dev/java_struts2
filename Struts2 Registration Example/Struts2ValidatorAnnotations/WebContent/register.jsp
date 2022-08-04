<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
<s:head/>
</head>
<body>
<h2>Registration Form</h2>

<s:form action="registerAction">
	<s:textfield label="First Name" name="firstName" />
	<s:textfield label="Last Name" name="lastName"  />
	<s:radio label="Gender" name="gender" list="{'Male','Female'}"  />
	<s:textfield label="Age" name="age" />
	<s:textfield label="Email" name="email"  />
	<s:submit value="Register"  />
</s:form>

</body>
</html>