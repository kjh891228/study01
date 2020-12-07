package com.hansung.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hansung.model.DeptService;

@WebServlet("/dept/deptDelete")
public class DeptDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DeptDeleteServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String deptId = request.getParameter("deptId");
		int iDeptId = 0;
		if (deptId != null) {
			iDeptId = Integer.parseInt(deptId);
		}
		DeptService service = new DeptService();
		int res = service.deptDelete(iDeptId);
		String msg = "삭제실패";
		if (res>0) {
			msg = "삭제성공";
		}
		request.setAttribute("msg", msg);
		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
		rd.forward(request, response);
	}

}
