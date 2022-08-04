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
	<s:textfield key="global.firstName" name="firstName" />
	<s:textfield key="global.lastName" name="lastName"  />
	<s:radio key="global.gender" name="gender" list="{'Male','Female'}"  />
	<s:textfield key="global.age" name="age" />
	<s:textfield key="global.email" name="email"  />
	<s:submit key="global.register"  />
</s:form>

<s:url action="changeLocaleAction" var="urlEn">
    <s:param name="request_locale">en</s:param>
</s:url>
<a href="${urlEn}">English</a> 

<s:url action="changeLocaleAction" var="urlFr">
    <s:param name="request_locale">fr</s:param>
</s:url>
<a href="${urlFr}">French</a> 

<s:url action="changeLocaleAction" var="urlDe">
    <s:param name="request_locale">de</s:param>
</s:url>
<a href="${urlDe}">German</a> 

</body>
</html>