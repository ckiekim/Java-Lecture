package basic01;

import java.sql.*;

public class InsertMain {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");	
			conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false",
				"javauser", "javapass");
			// the mysql insert statement
			String query = "insert into song (title, lyrics) values (?, ?);";
			
			// create the mysql insert preparedStatement
			PreparedStatement pStmt = conn.prepareStatement(query);
			pStmt.setString(1, "가시나");
			pStmt.setString(2, "선미");
			
			// execute the preparedStatement
			pStmt.executeUpdate();
			pStmt.close();
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		} finally {
			try {
				conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
}
