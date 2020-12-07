<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${stu.studentsName} 학생 정보수정</h1>
	<form action="stuDetail" method="post">
		학생코드<br> <input type="number" 
					readonly="readonly"
					name="student_id"
					value="${ stu.studentsId }"><br>
					 
		학생이름<br> <input type="text" 
					name="student_name"
					value="${ stu.studentsName }"><br><br>

		전공코드<br> <input type="number" 
					name="major_id"
					readonly="readonly"
					value="${ stu.majorId }"><br>
					
		<input type="submit" value="수정하기">
	</form>
</body>
</html>