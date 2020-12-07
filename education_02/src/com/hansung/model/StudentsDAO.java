package com.hansung.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hansung.util.DBUtil_maria;

public class StudentsDAO {
	
		// ��������	(delete�� �Ǽ��� int res�� return)
	public int stuDelete(String stuId) {
		int res=0;
		Connection conn = DBUtil_maria.getConnection();
		PreparedStatement st = null;
		ResultSet rs = null;
		String sql = "delete from students where student_id=?";
		
		try {
			st = conn.prepareStatement(sql);
			st.setString(1, stuId);
			res = st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil_maria.close(conn, st, rs);
		}
		return res;
	}
	
		// ��������	(update�� �Ǽ��� int res�� return)
	public int stuUpdate(StudentsVO stu) {
		int res=0;
		Connection conn = DBUtil_maria.getConnection();
		PreparedStatement st = null;
		ResultSet rs = null;
		String sql = "update students "
				+ "set student_name=?, major_id=? "
				+ "where student_id=?";
		
		try {
			st = conn.prepareStatement(sql);
			st.setString(1, stu.getStudentsName());
			st.setString(2, stu.getMajorId());
			st.setString(3, stu.getStudentsId());
			res = st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil_maria.close(conn, st, rs);
		}
		return res;
	}
	
		// �űԵ��	(insert�� �Ǽ��� int res�� return)
	public int stuInsert(StudentsVO stu) {
		int res=0;
		Connection conn = DBUtil_maria.getConnection();
		PreparedStatement st = null;
		ResultSet rs = null;
		String sql = "insert into students values(?, ?, ?)";
		
		try {
			st = conn.prepareStatement(sql);
			st.setString(1, stu.getStudentsId());
			st.setString(2, stu.getStudentsName());
			st.setString(3, stu.getMajorId());
			res = st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil_maria.close(conn, st, rs);
		}
		return res;
	}

		// pk�� ��ȸ
	public StudentsVO selectById(String stuId) {
		StudentsVO vo = null;
		Connection conn = DBUtil_maria.getConnection();
		PreparedStatement st = null;
		ResultSet rs = null;
		String sql = "select * from students where student_id=?";

		try {
			st = conn.prepareStatement(sql);
			st.setString(1, stuId);
			rs = st.executeQuery();
			if (rs.next()) {
				vo = new StudentsVO(rs.getString(1), rs.getString(2), rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil_maria.close(conn, st, rs);
		}
		return vo;
	}

		// ��ü��ȸ
	public List<StudentsVO> selectAll() {
		List<StudentsVO> stuList = new ArrayList<StudentsVO>();
		Connection conn = DBUtil_maria.getConnection();
		PreparedStatement st = null;
		String sql = "select * from students order by 1";
		ResultSet rs = null;

		try {
			st = conn.prepareStatement(sql);
			rs = st.executeQuery();
			while (rs.next()) {
				StudentsVO vo = new StudentsVO(rs.getString(1), rs.getString(2), rs.getString(3));
				stuList.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil_maria.close(conn, st, rs);
		}
		return stuList;
	}

}