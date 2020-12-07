package com.hansung.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/emp/logout")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.invalidate();
		
		// 세션 emp는 남겨두고 안의 data만 지우고 싶을때는 아래처럼
		/*
		 * Object obj = session.getAttribute("emp"); if (obj!=null) {
		 * session.setAttribute("emp", null); }
		 */
		
		response.sendRedirect("../index.html");
	}

}
