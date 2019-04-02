package basic01;

import java.sql.*;

public class DeleteMain {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");	
			conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false",
				"javauser", "javapass");
			// the mysql delete statement
			String query = "delete from song where _id=?;";
			
			// create the mysql delete preparedStatement
			PreparedStatement pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, 118);
			
			// execute the preparedStatement
			pStmt.executeUpdate();
			pStmt.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
}
