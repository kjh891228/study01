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

@WebServlet("/dept/deptInsert")
public class DeptInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DeptInsertServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("deptInsert.jsp");
		rd.forward(request, response);
	}	//페이지 연결

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
		int res = service.deptInsert(dept);
		String msg = "등록실패";
		if (res>0) {
			msg = "등록성공";
		}
		request.setAttribute("msg", msg);
		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
		rd.forward(request, response);
	}

}
