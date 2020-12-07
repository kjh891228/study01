package com.hansung.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServelet
 */
@WebServlet({ "/day20/FirstServlet", "/first", "/first2" })
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	int cnt; // instance변수 : 객체마다존재함, 객체가 new되면 자동초기화된다

	public FirstServlet() {
		super();
		System.out.println("FirstServelet의 생성자임");
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("FirstServelet의 init(초기화)");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("FirstServelet의 destroy(소멸)");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		cnt++;
		String addr = request.getRemoteAddr();
		System.out.println("FirstServelet의 doGet" + addr);
		response.setContentType("text/html;charset=utf-8;");
		response.getWriter().append("<h1>get서버에서 응답 : </h1>")
				.append("<h2>" + cnt + "번째 방문자</h2>")
				.append(request.getContextPath());
		
		//요청정보 읽기
		String name = request.getParameter("myname");
		String addre = request.getParameter("myaddr");
		String pNum = request.getParameter("mynum");
		System.out.println("name : "+name);
		System.out.println("addr : "+addre);
		System.out.println("phone : "+pNum);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8;");
		request.setCharacterEncoding("utf-8");
		System.out.println("FirstServelet의 doPost");
		response.getWriter().append("<h1>post서버에서 응답 : </h1>");
		
		//요청정보 읽기
		String name = request.getParameter("myname");
		String addre = request.getParameter("myaddr");
		String pNum = request.getParameter("mynum");
		System.out.println("name : "+name);
		System.out.println("addr : "+addre);
		System.out.println("phone : "+pNum);
	}

}
