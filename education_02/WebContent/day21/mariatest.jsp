<%@page import="com.hansung.util.DBUtil_maria"%>
<%@page import="com.hansung.util.DBUtil"%>
<%@page import="java.sql.Connection"%>
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

Connection conn1 = DBUtil.getConnection();
out.println("Oracle : "+conn1+"<br>");
Connection conn2 = DBUtil_maria.getConnection();
out.println("maria : "+conn2);

%>
</body>
</html>