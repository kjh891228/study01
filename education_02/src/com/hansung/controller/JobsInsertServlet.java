package com.hansung.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hansung.model.JobsService;
import com.hansung.model.JobsVO;

@WebServlet("/jobs/jobsInsert")
public class JobsInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("jobsInsert.jsp");
		rd.forward(request, response);
	} // 페이지 연결

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String jobId = request.getParameter("job_id");
		String jobTitle = request.getParameter("job_title");
		String minSal = request.getParameter("min_salary");
		String maxSal = request.getParameter("max_salary");
		int iminSal = 0, imaxSal = 0;
		if (minSal != null) {
			iminSal = Integer.parseInt(minSal);
		}
		if (maxSal != null) {
			imaxSal = Integer.parseInt(maxSal);
		}
		JobsVO vo = new JobsVO(jobId, jobTitle, iminSal, imaxSal);
		JobsService service = new JobsService();
		int res = service.insert(vo);
		String msg = "등록실패";
		if (res > 0) {
			msg = "등록성공";
		}
		request.setAttribute("msg", msg);
		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
		rd.forward(request, response);
	}

}
