<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 주문 상세내역</title>
	
<style type="text/css">
table,th,td {
	border: 1px solid;	
	background-color: lightgray ;
}
th,td {
	width: 200px;
}
</style>

</head>
<body>
<div align="center">
	<h1>상품 주문 상세내역</h1>
	<table>
	<tr>
		<th>이름</th>
		<td>${ param.username }</td>
	</tr>
	<tr><th>연락처</th><td>${ param.pnum }</td></tr>
	<tr><th>주소</th><td>${ param.addr }</td></tr>
	<tr><th>전화번호</th><td>${ param.hnum }</td></tr>
	<tr><th>메모</th><td>${ param.memo }</td></tr>
	<tr><th colspan="2">주문정보</th></tr>
	<tr><th>주문1</th><td>${ paramValues.order[0] }</td></tr>
	<tr><th>수량1</th><td>${ paramValues.orderN[0] }</td></tr>
	<tr><th>주문2</th><td>${ paramValues.order[1] }</td></tr>
	<tr><th>수량2</th><td>${ paramValues.orderN[1] }</td></tr>
	<tr><th>주문3</th><td>${ paramValues.order[2] }</td></tr>
	<tr><th>수량3</th><td>${ paramValues.orderN[2] }</td></tr>
	</table>
</div>
</body>
</html>