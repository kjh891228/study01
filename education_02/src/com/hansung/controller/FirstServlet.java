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

	int cnt; // instance���� : ��ü����������, ��ü�� new�Ǹ� �ڵ��ʱ�ȭ�ȴ�

	public FirstServlet() {
		super();
		System.out.println("FirstServelet�� ��������");
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("FirstServelet�� init(�ʱ�ȭ)");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("FirstServelet�� destroy(�Ҹ�)");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		cnt++;
		String addr = request.getRemoteAddr();
		System.out.println("FirstServelet�� doGet" + addr);
		response.setContentType("text/html;charset=utf-8;");
		response.getWriter().append("<h1>get�������� ���� : </h1>")
				.append("<h2>" + cnt + "��° �湮��</h2>")
				.append(request.getContextPath());
		
		//��û���� �б�
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
		System.out.println("FirstServelet�� doPost");
		response.getWriter().append("<h1>post�������� ���� : </h1>");
		
		//��û���� �б�
		String name = request.getParameter("myname");
		String addre = request.getParameter("myaddr");
		String pNum = request.getParameter("mynum");
		System.out.println("name : "+name);
		System.out.println("addr : "+addre);
		System.out.println("phone : "+pNum);
	}

}
