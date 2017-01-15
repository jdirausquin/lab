<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>Acesso Negado</title>
	</head> 
	<body>
		<h1>Acesso Negado!</h1>
		<c:url value="/login" var="login" />
		<a href="${login}">Voltar</a>
	</body>
</html>
