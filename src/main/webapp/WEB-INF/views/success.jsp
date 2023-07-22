<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>name is : ${ student.name}</h1>
<h1>date  is : ${ student.date}</h1>
<h1>courses is : ${ student.courses}</h1>
<h1>Gender  is : ${ student.gender}</h1>
<hr>
<h1>Address  street : ${student.address.street}</h1>
<h1>Address  zip  : ${student.address.zip}</h1>


</body>
</html>