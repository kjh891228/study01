<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>

	<h1>신규부서 등록</h1>
	<form action="deptInsert" method="post">
		부서코드<br> <input type="number" 
					name="department_id"><br>
					 
		부서이름<br> <input type="text" 
					name="department_name"><br><br>

		담당자코드<br> <input type="number" 
					name="manager_id"><br>

		위치코드<br> <input type="number" 
					name="location_id"><br>
					
		<input type="submit" value="등록하기">
	</form>

</body>
</html>