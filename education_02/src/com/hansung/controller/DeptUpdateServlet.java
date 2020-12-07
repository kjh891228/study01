package com.hansung.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hansung.model.DeptService;
import com.hansung.model.DeptVO;

@WebServlet("/dept/deptDetail")
public class DeptUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeptUpdateServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		DeptService service = new DeptService();
		String deptId = request.getParameter("deptId");
		int iDeptId = 0;
		if (deptId != null) {
			iDeptId = Integer.parseInt(deptId);
		}
		DeptVO dept = service.selectById(iDeptId);
		request.setAttribute("dept", dept);
		RequestDispatcher rd = request.getRequestDispatcher("deptDetail.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String deptId = request.getParameter("department_id");
		String deptName = request.getParameter("department_name");
		String managerId = request.getParameter("manager_id");
		String locationId = request.getParameter("location_id");
		int iDeptId = 0, iManagerId=0, iLocationId=0;
		if (deptId != null) {
			iDeptId = Integer.parseInt(deptId);
		}
		if (managerId != null) {
			iManagerId = Integer.parseInt(managerId);
		}
		if (deptId != null) {
			iLocationId = Integer.parseInt(locationId);
		}
		DeptVO dept = new DeptVO(iDeptId, deptName, iManagerId, iLocationId);
		DeptService service = new DeptService();
		int res = service.deptUpdate(dept);
		String msg = "수정실패";
		if (res>0) {
			msg = "수정성공";
		}
		request.setAttribute("msg", msg);
		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
		rd.forward(request, response);
	}

}
