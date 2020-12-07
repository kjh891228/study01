<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>직업 등록</h1>
	<form action="jobsInsert" method="post">
		직업코드<br> <input type="text" 
					name="job_id"><br> 
					 
		직업이름<br> <input type="text" 
					name="job_title"><br>

		최저급여<br> <input type="number" 
					name="min_salary"><br>

		최저급여<br> <input type="number" 
					name="max_salary"><br>
					
		<input type="submit" value="등록하기">
	</form>
</body>
</html>