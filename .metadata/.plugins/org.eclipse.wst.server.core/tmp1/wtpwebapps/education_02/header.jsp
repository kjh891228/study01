<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<style>
	#title{
		background-color: lightgray;
		padding: 15px;
	}
</style>
<div id="title">
	<c:if test="${emp!=null}">
		<p>${emp.first_name} ${emp.last_name} 님 접속중:-)</p>
		<a href="../emp/logout">LOGOUT</a>
	</c:if>
	<c:if test="${emp==null}">
		<p>guest님 접속중:-)</p>
		<a href="../emp/login">LOGIN</a>
	</c:if>
</div>