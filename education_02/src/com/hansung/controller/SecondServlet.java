package com.hansung.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServelet
 */
@WebServlet({ "/SecondServlet", "/second" })
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SecondServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// request : 요청 response : 응답
		String ip = request.getRemoteAddr();
		response.setContentType("text/html;charset=utf-8;");
		PrintWriter out = response.getWriter();
		out.write("<h1>SecondServlet의 GET방식으로 요청한 정보</h1>");
		out.write("<h2>IP : " + ip + "</h2>");
	}

}
