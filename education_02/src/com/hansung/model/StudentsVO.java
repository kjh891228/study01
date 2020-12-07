package com.hansung.model;

public class StudentsVO {

	private String studentsId, studentsName, majorId;

	public StudentsVO() {}
	
	public StudentsVO(String studentsId, String studentsName, String majorId) {
		super();
		this.studentsId = studentsId;
		this.studentsName = studentsName;
		this.majorId = majorId;
	}
	
	public String getStudentsId() {
		return studentsId;
	}

	public void setStudentsId(String studentsId) {
		this.studentsId = studentsId;
	}

	public String getStudentsName() {
		return studentsName;
	}

	public void setStudentsName(String studentsName) {
		this.studentsName = studentsName;
	}

	public String getMajorId() {
		return majorId;
	}

	public void setMajorId(String majorId) {
		this.majorId = majorId;
	}

	@Override
	public String toString() {
		return "StudentsVO [studentsId=" + studentsId + ", studentsName=" + studentsName + ", majorId=" + majorId + "]";
	}
	
}
