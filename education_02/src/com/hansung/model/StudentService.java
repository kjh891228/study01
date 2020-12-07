package com.hansung.model;

import java.util.List;

public class StudentService {
	
	StudentsDAO studentsDAO = new StudentsDAO();

	public List<StudentsVO> selectAll() {
		return studentsDAO.selectAll();
	}	//	전체조회
	
	public StudentsVO selectById(String stuId) {
		return studentsDAO.selectById(stuId);
	}	//	id로조회
	
	public int stuDelete(String stuId) {
		return studentsDAO.stuDelete(stuId);
	}	//	삭제
	
	public int stuUpdate(StudentsVO stu) {
		return studentsDAO.stuUpdate(stu);
	}	//	수정
	
	public int stuInsert(StudentsVO stu) {
		return studentsDAO.stuInsert(stu);
	}	//	신규등록
	
}
