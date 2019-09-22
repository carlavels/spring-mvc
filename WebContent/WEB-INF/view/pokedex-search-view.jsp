<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>PokeDex</title>
	</head>
	
	<body>
		<h2>${pokemonName}</h2>
		<hr><br><br>
		
		<img src="${pageContext.request.contextPath}/assets/img/${pokemonImage}">
	</body>
</html>