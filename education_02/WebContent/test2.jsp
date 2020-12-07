<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>score : ${score}</h1>
<h1>application : ${applicationScope.score1}</h1>
<h1>session : ${sessionScope.score2}</h1>
<h1>request : ${requestScope.score3}</h1>
<h1>page : ${pageScope.score4}</h1>
</body>
</html>