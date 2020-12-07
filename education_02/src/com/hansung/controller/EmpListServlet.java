package com.hansung.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hansung.model.EmpService;

@WebServlet("/emp/empList")
public class EmpListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		Object obj = session.getAttribute("emp");
		if (obj ==null) {
			response.sendRedirect("login");
			return;
		}
		EmpService service = new EmpService();
		request.setAttribute("empList", service.selectAll());
		RequestDispatcher rd = request.getRequestDispatcher("empList.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

}
