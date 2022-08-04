<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1" charset="ISO-8859-1">
<title>Header</title>
</head>
<body>
<%
if(session.getAttribute("loggedinUser") == null) {
	response.sendRedirect("login.jsp");
}
%>

	<div class="topnav">
	  <a href="welcomeAction">Home</a>
  	  <a href="addProduct.jsp">Add Product</a>
      <a href="logoutAction" style="float:right">Logout</a>
	</div>

</body>
</html>