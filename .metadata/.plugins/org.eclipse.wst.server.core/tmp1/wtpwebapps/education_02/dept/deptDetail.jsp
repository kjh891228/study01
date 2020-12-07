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

	<h1>[${dept.department_name}] 부서 상세보기</h1>
	<form action="deptDetail" method="post">
		부서코드<br> 
					 
					<input type="text" 
					name="department_id" 
					readonly="readonly"
					value="${dept.department_id}"><br>
			
		담당자코드<br> <input type="text" 
					disabled="disabled"
					value="${dept.manager_id}"><br>
					 
					<input type="hidden" 
					name="manager_id" 
					value="${dept.manager_id}"><br>
			
		위치코드<br> <input type="text" 
					disabled="disabled"
					value="${dept.location_id}"><br>
					 
					<input type="hidden" 
					name="location_id" 
					value="${dept.location_id}"><br>
			
		부서이름<br> <input type="text" 
					name="department_name"
					value="${dept.department_name}"><br><br>
					
		<input type="submit" value="수정하기">
	</form>

</body>
</html>