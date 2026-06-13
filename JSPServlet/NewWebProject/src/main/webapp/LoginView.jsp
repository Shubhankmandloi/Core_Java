<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="Header.jsp" %>

<div align="center">
<form action="LoginCtl" method="post">
<table>

<tr>
<th>Email : </th>
<td><input type="email" name="email" value="" placeholder="Enter Email Id"></td>
</tr>
<tr>
<th>Password : </th>
<td><input type="password" name="password" value="" placeholder="Enter Password"></td>
</tr>
<tr>
<td><input type="submit" name="operation" value="LogIn"></td>
</tr>

</table>
</form>
</div>

<%@ include file="Footer.jsp" %>
</body>
</html>