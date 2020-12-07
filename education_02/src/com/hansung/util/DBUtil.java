package com.hansung.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {

	public static Connection getConnection() {
		// DB를 연결해서 Connection을 return하는 메서드 만들기
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1522:root";
		String userid = "hr", password = "hr";
		try {
			// 1. driver load
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. Conn 만들기
			conn = DriverManager.getConnection(url, userid, password);

			return conn;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void close(Connection conn, Statement st, ResultSet rs) {
		try {
			if (rs!=null) {rs.close();}		//없을수도 있으니까 if문으로 확인하고 닫음
			if (st!=null) {st.close();}
			if (conn!=null) {conn.close();}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
