<%@page import="com.hansung.model.DeptVO"%>
<%@page import="java.util.List"%>
<%@page import="com.hansung.model.DeptDAO"%>
<%@page import="com.hansung.util.DBUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	DeptDAO dao = new DeptDAO();
	//DeptVO newDept = new DeptVO(3, "지울대학교"); 
	//dao.deptInsert(newDept);
	
	//DeptVO newDept2 = new DeptVO(1, "와플대학교"); 
	//dao.deptUpdate(newDept2);
	
	dao.deptDelete(3);

	List<DeptVO> deptlist = dao.selectAll();
	for (DeptVO dept : deptlist){
		out.println(dept+"<br>");
	}
	out.println("<hr>");

	List<DeptVO> deptlist2 = dao.selectByName("대학교");
	for (DeptVO dept : deptlist2){
		out.println(dept+"<br>");
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