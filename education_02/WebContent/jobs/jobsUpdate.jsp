<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${job.job_title} 정보수정</h1>
	<form action="jobDetail" method="post">
		직업코드<br> <input type="text" 
					readonly="readonly"
					name="job_id"
					value="${ job.job_id }"><br>
					 
		직업이름<br> <input type="text" 
					name="job_title"
					value="${ job.job_title }"><br><br>

		최저급여<br> <input type="number" 
					name="min_salary"
					readonly="readonly"
					value="${ job.min_salary }"><br>

		최고급여<br> <input type="number" 
					name="max_salary"
					readonly="readonly"
					value="${ job.max_salary }"><br>
					
		<input type="submit" value="수정하기">
	</form><br>
	<a href="javascript:history.back();">뒤로가기</a>
	
</body>
</html>