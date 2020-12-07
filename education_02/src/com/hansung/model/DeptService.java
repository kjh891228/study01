package com.hansung.model;

import java.util.List;

public class DeptService {

	DeptDAO deptDAO = new DeptDAO();
	
	//모든 부서 조회
	public List<DeptVO> selectAll() {
		return deptDAO.selectAll();
	}
	
	//조건조회 : 이름으로 조회
	public List<DeptVO> selectByName(String dname) {
		return deptDAO.selectByName(dname);
	}
	
	//입력
	public int deptInsert(DeptVO dept) {
		return deptDAO.deptInsert(dept);
	}
	
	//수정
	public int deptUpdate(DeptVO dept) {
		return deptDAO.deptUpdate(dept);
	}
	
	//삭제
	public int deptDelete(int deptId) {
		return deptDAO.deptDelete(deptId);
	}

	public DeptVO selectById(int iDeptId) {
		return deptDAO.selectById(iDeptId);
	}
	
}
