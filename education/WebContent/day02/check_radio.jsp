<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

	String gender = request.getParameter("gender");
	String[] subjects = request.getParameterValues("subject");
	out.write("<br>성별은 "+gender);
	out.write("<br>과목은 "+Arrays.toString(subjects));
	
%>
</body>
</html>