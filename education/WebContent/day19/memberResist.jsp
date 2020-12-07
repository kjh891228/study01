<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<style>
table, tr, td{
	border: 1px dotted orange;
}
</style>
<table>
<tr><td>ID</td><td>${param.uId}</td></tr>
<tr><td>NAME</td><td>${param.uName} 님</td></tr>
<tr><td>PHONE</td><td>${param.uPnum}</td></tr>
<tr><td>EMAIL</td><td>${param.uEmail}</td></tr>
<tr><td>ADDR</td><td>${param.uAddr}</td></tr>
</table>