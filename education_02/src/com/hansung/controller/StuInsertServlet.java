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

@WebServlet("/stu/stuInsert")
public class StuInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("stuInsert.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String stuId = request.getParameter("student_id");
		String stuName = request.getParameter("student_name");
		String mId = request.getParameter("major_id");

		StudentsVO vo = new StudentsVO(stuId, stuName, mId);
		StudentService service = new StudentService();
		int res = service.stuInsert(vo);
		String msg = res>0? "등록성공":"등록실패";
		request.setAttribute("msg", msg);
		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
		rd.forward(request, response);
	}

}
