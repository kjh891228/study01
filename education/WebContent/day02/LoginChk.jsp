<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
  <%
  	request.setCharacterEncoding("UTF-8");
  	String id = request.getParameter("user_id");
  	String pw = request.getParameter("user_pw");
  	String yn = request.getParameter("statYN");
  	
  	System.out.println(id);
  	System.out.println(pw);
  	System.out.println(yn);
  	out.write("아이디="+id);	// 이거는 브라우저 화면에 보이게 한다
  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>${param.user_id}</p>
	<p>${param.user_pw}</p>
	<p><%=id %></p>
	<p><%=pw %></p>
	<p><%=yn %></p>
</body>
</html>