package com.hansung.model;

public class LoginService {

	LoginDAO dao = new LoginDAO();
	
	public EmpVO loginChk(int id, String pw) {
		return dao.loginChk(id, pw);
	}
	
}
