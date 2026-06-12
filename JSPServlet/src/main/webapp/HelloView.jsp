<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align = "center">

<h1>Hello View</h1>

<form action="HelloServlet" method ="post">
<table>
<tr>
<th>First Name : </th>
<td><input type="text" name="firstName" value="" placeholder="Enter first name"></td>
</tr>
<tr>
<th>Last Name : </th>
<td><input type="text" name="lastName" value="" placeholder="Enter Last name"></td>
</tr>
<tr>
<th>LogIn : </th>
<td><input type="email" name="loginId" value="" placeholder="Enter Your email"></td>
</tr>
<tr>
<th>Password : </th>
<td><input type="password" name="password" value="" placeholder="Enter password"></td>
</tr>
<tr>
<th>DOB : </th>
<td><input type="date" name="dob" value="" ></td>
</tr>
<tr>
<td><input type="submit" name="operation" value="save" ></td>
</tr>



</table>
</form>




</div>

</body>
</html>