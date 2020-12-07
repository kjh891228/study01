package com.hansung.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hansung.model.StudentService;

@WebServlet("/stu/stuList")
public class StuListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StudentService service = new StudentService();

		request.setAttribute("stuList", service.selectAll());
		RequestDispatcher rd = request.getRequestDispatcher("stuList.jsp");
		rd.forward(request, response);
	}

}