<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>받아온 Job 정보</h1>
param : ${param.job_id}<br>
param : ${param.job_title}<br>
setAttribute 저장값 : ${id}<br>
setAttribute 저장값 : ${title}<br>
setAttribute 저장값 : ${jInfo}<br>
setAttribute 저장값 : ${jInfo.job_id}<br>
setAttribute 저장값 : ${jInfo.job_title}<br>
setAttribute 저장값 : ${jInfo.min_salary}<br>
setAttribute 저장값 : ${jInfo.max_salary}
</body>
</html>