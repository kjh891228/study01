package com.hansung.model;

import java.util.List;

public class JobsService {
	JobsDAO jobsDAO = new JobsDAO();
	
	public List<JobsVO> selectAll() {
		return jobsDAO.selectAll();
	}
	
	public JobsVO selectById(String jId) {
		return jobsDAO.selectById(jId);
	}
	
	public int insert(JobsVO vo) {
		return jobsDAO.insert(vo);
	}
	
	public int update(JobsVO vo) {
		return jobsDAO.update(vo);
	}
	
	public int delete(String jId) {
		return jobsDAO.delete(jId);
	}
}
