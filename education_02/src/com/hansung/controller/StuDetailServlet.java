package com.hansung.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hansung.model.StudentService;
import com.hansung.model.StudentsVO;

@WebServlet("/stu/stuDetail")
public class StuDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String stuId = request.getParameter("stuId");
		StudentService service = new StudentService();
		request.setAttribute("stu", service.selectById(stuId));
		RequestDispatcher rd = request.getRequestDispatcher("stuUpdate.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String stuId = request.getParameter("student_id");
		String stuName = request.getParameter("student_name");
		String mId = request.getParameter("major_id");
		
		StudentsVO vo = new StudentsVO(stuId, stuName, mId);
		StudentService service = new StudentService();
		int res = service.stuUpdate(vo);
		String msg = res>0? "수정성공":"수정실패";
		request.setAttribute("msg", msg);
		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
		rd.forward(request, response);
	}

}
