<%@page import="java.util.Arrays"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String name = request.getParameter("name");
	String pass = request.getParameter("pass");
	String pass2 = request.getParameter("pass2");
	
	String[] f = request.getParameterValues("fruit");
	String[] f2 = request.getParameterValues("fruit2");
	String[] f3 = request.getParameterValues("fruit3");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>이름  : <%=name %></h3>
	<h3>비번1 : <%=pass %></h3>
	<h3>비번2 : <%=pass2 %></h3>
	<h3>f1 : <%=Arrays.toString(f) %></h3>
	<h3>f2 : <%=Arrays.toString(f2) %></h3>
	<h3>f3 : <%=Arrays.toString(f3) %></h3>
	<hr>
	<h3>EL문법으로</h3><br>
	<p>이름  : ${ param.name }</p>
	<p>비번1 : ${ param.pass }</p>
	<p>비번2 : ${ param.pass2 }</p>
	<hr>
	<p>fruit / ${ param.fruit }</p>
	<p>fruit2 / ${ param.fruit2 }</p>
	<p>fruit3-1 / ${ paramValues.fruit3[0] }</p>
	<p>fruit3-2 / ${ paramValues.fruit3[1] }</p>
	<p>fruit3-3 / ${ paramValues.fruit3[2] }</p>
	<p>fruit3-4 / ${ paramValues.fruit3[3] }</p>
	<hr>
	<p>MEMO : ${ param.memo }</p>
</body>
</html>