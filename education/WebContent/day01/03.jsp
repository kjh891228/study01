<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
  <%
  		//여기가 JAVA단
  		String str = "html";
  		request.setAttribute("myData", str);
		
  %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>여기가 <%=str %>단</h1>
	<h1><%= request.getAttribute("myData") %></h1>
	<h2> 이건 scriptLET 문법이다 </h2>
	
	<h2>EL문법 : ${myData} </h2>

</body>
</html>