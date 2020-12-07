package com.hansung.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hansung.model.EmpVO;
import com.hansung.model.LoginService;

@WebServlet("/emp/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("login.html");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int id = cvtInteger(request.getParameter("employee_id"));
		String pw = request.getParameter("phone_number");
		LoginService service = new LoginService();
		EmpVO emp = service.loginChk(id, pw);
		if(emp == null) {	//login����
			response.sendRedirect("login");
		} else {			//login����
			HttpSession session = request.getSession();
			ServletContext application = request.getServletContext();
			application.setAttribute("myname", "kjh");
			session.setAttribute("emp", emp);
			request.setAttribute("myname2", "kjh2");
			response.sendRedirect("../dept/deptlist");	
			//��û������(�ּ�â�� ����ȴ�/���ο��û)
		}
	}
	
	private int cvtInteger(String str) {
		if (str==null) {return 0;}
		return Integer.parseInt(str);
	}

}