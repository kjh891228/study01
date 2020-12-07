package com.hansung.model;

import java.util.List;

public class DeptService {

	DeptDAO deptDAO = new DeptDAO();
	
	//��� �μ� ��ȸ
	public List<DeptVO> selectAll() {
		return deptDAO.selectAll();
	}
	
	//������ȸ : �̸����� ��ȸ
	public List<DeptVO> selectByName(String dname) {
		return deptDAO.selectByName(dname);
	}
	
	//�Է�
	public int deptInsert(DeptVO dept) {
		return deptDAO.deptInsert(dept);
	}
	
	//����
	public int deptUpdate(DeptVO dept) {
		return deptDAO.deptUpdate(dept);
	}
	
	//����
	public int deptDelete(int deptId) {
		return deptDAO.deptDelete(deptId);
	}

	public DeptVO selectById(int iDeptId) {
		return deptDAO.selectById(iDeptId);
	}
	
}
