package com.hansung.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil_maria {

	public static Connection getConnection() {
		// DB를 연결해서 Connection을 return하는 메서드 만들기
		Connection conn = null;
		String url = "jdbc:mariadb://localhost:3307/test";
		String userid = "root", password = "1228";
		try {
			// 1. driver load
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName("org.mariadb.jdbc.Driver");

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
