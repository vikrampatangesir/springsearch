<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>file upload result..........</title>
</head>
<body>
<h1>${msg}</h1>
<img alt="profile image " src="<c:url value="/WEB-INF/resources/image ${filename}"/>"/>
</body>
</html>