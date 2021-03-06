<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table { width: 100%; }
</style>
</head>
<body>
	<h1>학생 목록</h1>
	<h2>${emp.first_name}
		${emp.last_name} 접속중 
		<a href="../index.html">첫화면</a>
	</h2>
	<a href="stuInsert">신규등록</a>
	<hr>
	<table border="1">
		<tr>
			<th>학생코드</th><th>학생이름</th><th>전공코드</th><th></th>
		</tr>
	<c:forEach items="${stuList}" var="stu">
		<tr>
			<td>${stu.studentsId}</td>
			<td><a href="stuDetail?stuId=${ stu.studentsId }">${stu.studentsName}</a></td>
			<td>${stu.majorId}</td>
			<td><button onclick="location.href='stuDelete?stuId=${ stu.studentsId }';">삭제</button></td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>