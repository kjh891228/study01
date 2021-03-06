package com.hansung.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hansung.util.DBUtil;

public class LoginDAO {

	public EmpVO loginChk(int id, String pw) {
		EmpVO emp = null;
		Connection conn = DBUtil.getConnection();
		PreparedStatement st = null;
		ResultSet rs = null;
		String sql = "select * from employees "
				+ "where employee_id=? and phone_number=?";
		
		try {
			st = conn.prepareStatement(sql);
			st.setInt(1, id);
			st.setString(2, pw);
			rs = st.executeQuery();
			if(rs.next()) {
				emp = new EmpVO();
				emp.setEmployee_id(id);
				emp.setPhone_number(pw);
				emp.setFirst_name(rs.getString("first_name"));
				emp.setLast_name(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setHire_date(rs.getDate("hire_date"));
				emp.setSalary(rs.getDouble("salary"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, st, rs);
		}
		
		return emp;
	}

}
