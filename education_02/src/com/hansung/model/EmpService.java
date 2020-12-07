package com.hansung.model;

import java.util.List;

public class EmpService {

	EmpDAO dao = new EmpDAO();
	
	public List<EmpVO> selectAll() {
		return dao.selectAll();
	}
	
}
