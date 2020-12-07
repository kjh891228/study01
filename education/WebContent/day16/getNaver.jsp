<%@page import="java.io.IOException"%>
<%@page import="org.jsoup.Jsoup"%>
<%@page import="org.jsoup.nodes.Document"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
try { 
	// 1. URL 선언 
	String connUrl = "https://www.naver.com"; 
	// 2. HTML 가져오기 
	Document doc = Jsoup.connect(connUrl).get(); 
	// 3. 가져온 HTML Document 를 확인하기 
	System.out.println(doc.toString()); 
	out.println(doc.toString()); 
} catch (IOException e) {
	// Exp : Connection Fail 
	e.printStackTrace(); 
}
%>
    
    