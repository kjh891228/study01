<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>

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
	<jsp:include page="../header.jsp"></jsp:include>
	<h1>부서목록</h1>
	<h2>${emp.first_name}
		${emp.last_name} 접속중 
		<a href="../index.html">첫화면</a>
	</h2>
	<a href="deptInsert">신규등록</a>
	<table border="1">
		<tr>
			<th>부서코드</th>
			<th>부서이름</th>
			<th>담당자코드</th>
			<th>위치코드</th>
			<th></th>
		</tr>
		<c:forEach items="${deptlist}" var="dept">
			<tr>
				<td><a href="deptDetail?deptId=${ dept.department_id }">${ dept.department_id }</a></td>
				<td>${ dept.department_name }</td>
				<td>${ dept.manager_id }</td>
				<td>${ dept.location_id }</td>
				<th><button
						onclick="location.href='deptDelete?deptId=${dept.department_id}';">삭제</button></th>
			</tr>
		</c:forEach>
	</table>
</body>
</html>