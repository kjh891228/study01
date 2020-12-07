<%@page import="org.jsoup.nodes.Element"%>
<%@page import="org.jsoup.select.Elements"%>
<%@page import="java.io.IOException"%>
<%@page import="org.jsoup.Jsoup"%>
<%@page import="org.jsoup.nodes.Document"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String output = "<ul>";
	try {
	// 1. URL 선언 
	String connUrl = "https://news.naver.com";
	// 2. HTML 가져오기 
	Document doc = Jsoup.connect(connUrl).get();
	Elements eles = doc.select("#today_main_news > div.hdline_news > ul > li > div.hdline_article_tit > a");
	// 3. 가져온 HTML Document 를 확인하기 
	for (Element e : eles) {
		output += "<li>" + e.text() + "</li>";
	}
	output += "</ul>";
	//out.println(output);
} catch (IOException e) {
	// Exp : Connection Fail 
	e.printStackTrace();
}
%>

<%=output%>