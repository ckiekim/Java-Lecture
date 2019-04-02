package basic01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectMain {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");	
			conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false",
				"javauser", "javapass");	
							
			int id = 110;
			String sql = "select * FROM song where _id=?;";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, id);
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				int songId = rs.getInt(1);		// getInt("_id")
				String title = rs.getString(2);
				String lyrics = rs.getString(3);
				System.out.printf("%8d %-20s\t%s\n", songId, title, lyrics);
			}
			rs.close();
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
