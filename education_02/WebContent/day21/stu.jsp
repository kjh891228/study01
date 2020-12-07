<%@page import="java.util.List"%>
<%@page import="com.hansung.model.StudentsDAO"%>
<%@page import="com.hansung.model.StudentsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//Connection conn = DBUtil.getConnection();
	StudentsDAO dao = new StudentsDAO();
	List<StudentsVO> stulist = dao.selectAll();
	for (StudentsVO stu : stulist){
		out.println(stu+"<br>");
	}
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>