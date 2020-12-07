package com.hansung.model;

import java.util.List;

public class StudentService {
	
	StudentsDAO studentsDAO = new StudentsDAO();

	public List<StudentsVO> selectAll() {
		return studentsDAO.selectAll();
	}	//	��ü��ȸ
	
	public StudentsVO selectById(String stuId) {
		return studentsDAO.selectById(stuId);
	}	//	id����ȸ
	
	public int stuDelete(String stuId) {
		return studentsDAO.stuDelete(stuId);
	}	//	����
	
	public int stuUpdate(StudentsVO stu) {
		return studentsDAO.stuUpdate(stu);
	}	//	����
	
	public int stuInsert(StudentsVO stu) {
		return studentsDAO.stuInsert(stu);
	}	//	�űԵ��
	
}
