<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>신규학생 등록</h1>
	<form action="stuInsert" method="post">
		학생코드<br> <input type="number" 
					name="student_id"><br> 
					 
		학생이름<br> <input type="text" 
					name="student_name"><br><br>

		전공코드<br> <input type="number" 
					name="major_id"><br>
					
		<input type="submit" value="등록하기">
	</form>
</body>
</html>