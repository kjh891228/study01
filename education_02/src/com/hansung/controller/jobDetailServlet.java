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

@WebServlet("/jobs/jobDetail")
public class jobDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String jId = request.getParameter("jId");
		JobsService service = new JobsService();
		request.setAttribute("job", service.selectById(jId));
		RequestDispatcher rd = request.getRequestDispatcher("jobsUpdate.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String jId = request.getParameter("job_id");
		String jTitle = request.getParameter("job_title");
		String minSal = request.getParameter("min_salary");
		String maxSal = request.getParameter("max_salary");
		int iminSal=0, imaxSal=0;
		if (minSal!=null) {iminSal = Integer.parseInt(minSal);}
		if (maxSal!=null) {imaxSal = Integer.parseInt(maxSal);}
		
		JobsVO vo = new JobsVO(jId, jTitle, iminSal, imaxSal);
		JobsService service = new JobsService();
		int res = service.update(vo);
		String msg = res>0? "수정성공":"수정실패";
		request.setAttribute("msg", msg);
		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
		rd.forward(request, response);
	}

}
