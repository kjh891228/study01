package com.hansung.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hansung.model.DeptService;
import com.hansung.model.DeptVO;

@WebServlet("/dept/deptlist")
public class DeptListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		Object obj = session.getAttribute("emp");
		if (obj == null) {	//login X
			response.sendRedirect("../emp/login");
			return;
		}
		
		DeptService service = new DeptService();
		List<DeptVO> deptlist = service.selectAll();
		
		request.setAttribute("deptlist", deptlist);
		RequestDispatcher rd = request.getRequestDispatcher("deptAll.jsp");
		rd.forward(request, response);
	}

}
