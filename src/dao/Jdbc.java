package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {
	
	// ��������
		static {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}

		//��������
		static final String url = "jdbc:mysql://localhost:3306/test?characterEncoding=utf8";
		static final String user = "root";
		static final String password = "123456";

		public static Connection getConnection() throws SQLException {
		
			Connection conn = DriverManager.getConnection(url, user, password);
			return conn;
		}

		public static void closeAll(ResultSet rs, Statement stmt, Connection conn) {
			try {
				if (rs != null)
					rs.close();
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (stmt != null)
					stmt.close();
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (conn != null)
					conn.close();
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
//		ʵ�����ݿ���Ϣ�ĸ���(insert delete update)
		public static int executeUpdate(String sql, Object... parameters) {
			Connection conn = null;
			PreparedStatement stmt = null;
			try {
				conn = getConnection();
				stmt = conn.prepareStatement(sql);
				if (parameters != null && parameters.length > 0) {
					for (int i = 0; i < parameters.length; i++) {
						stmt.setObject((i + 1), parameters[i]);
					}
				}
				return stmt.executeUpdate();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			} finally {
				closeAll(null, stmt, conn);
			}
		}

	
		
		public static Object executeQuery(String sql, ResultSetHandler h, Object... parameters){
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			try {
				conn = getConnection();
				stmt = conn.prepareStatement(sql);
				if (parameters != null && parameters.length > 0) {
					for (int i = 0; i < parameters.length; i++) {
						stmt.setObject((i + 1), parameters[i]);
					}
				}
				rs = stmt.executeQuery();
			
				Object obj = h.handle(rs); 
				return obj;
			} catch (SQLException e) {
				throw new RuntimeException(e);
			} finally {
				closeAll(rs, stmt, conn);
			}
		}
		



}
