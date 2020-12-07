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
	th{ background-color: lightgray; }
</style>
</head>
<body>
	<h1>직원목록</h1>
	<h2>${emp.first_name}
		${emp.last_name} 접속중 
		<a href="../index.html">첫화면</a>
	</h2>
	<a href="empInsert">신규등록</a>
	<table border="1">
		<tr>
			<th></th>
			<th>직원코드</th>
			<th>이름</th>
			<th>이메일</th>
			<th>핸드폰번호</th>
			<th>채용일</th>
			<th>직업코드</th>
			<th>봉급</th>
			<th>수수료율</th>
			<th>매니저코드</th>
			<th>회사코드</th>
			<th></th>
		</tr>
		<c:set var="seq" value="1"></c:set>
		<c:forEach items="${empList}" var="emps">
			<tr>
				<th>${seq}</th>
		<c:set var="seq" value="${seq+1 }"></c:set>
				<td><a href="empDetail?empId=${emps.employee_id}">${emps.employee_id}</a></td>
				<td>${emps.first_name}${emps.last_name}</td>
				<td>${emps.email}</td>
				<td>${emps.phone_number}</td>
				<td>${emps.hire_date}</td>
				<td>${emps.job_id}</td>
				<td>${emps.salary}</td>
				<td>${emps.commission_pct}%</td>
				<td>${emps.manager_id}</td>
				<td>${emps.department_id}</td>
				<td><button
						onclick="location.href='empDelete?empId=${emps.employee_id}';">삭제</button></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>