package basic03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EaglesDAO {
	private Connection conn;
    private static final String USERNAME = "javauser";
    private static final String PASSWORD = "javapass";
    private static final String URL = "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false";

    public EaglesDAO() {
    	try {
			Class.forName("com.mysql.jdbc.Driver");	
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    	} catch (Exception ex) {
			ex.printStackTrace();
		}
    }
    
    public void updatePlayer(EaglesDTO player) {
    	String query = "update Eagles set name=?, position=?, hs=?, hand=?, birth=?, salary=? where back_no=?;";
    	PreparedStatement pStmt = null;
    	try {
			pStmt = conn.prepareStatement(query);
			pStmt.setString(1, player.getName());
			pStmt.setString(2, player.getPosition());
			pStmt.setString(3, player.getHs());
			pStmt.setString(4, player.getHand());
			pStmt.setInt(5, player.getBirth());
			pStmt.setInt(6, player.getSalary());
			pStmt.setInt(7, player.getBackNo());
			
			pStmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStmt != null && !pStmt.isClosed()) 
					pStmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
    }
    
    public void deletePlayer(int backNo) {
    	String query = "delete from Eagles where back_no=?;";
    	PreparedStatement pStmt = null;
    	try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, backNo);
			
			pStmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStmt != null && !pStmt.isClosed()) 
					pStmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}	
    }
    
    public void insertPlayer(EaglesDTO player) {
    	String query = "insert into Eagles values (?, ?, ?, ?, ?, ?, ?);";
    	PreparedStatement pStmt = null;
    	try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, player.getBackNo());
			pStmt.setString(2, player.getName());
			pStmt.setString(3, player.getPosition());
			pStmt.setString(4, player.getHs());
			pStmt.setString(5, player.getHand());
			pStmt.setInt(6, player.getBirth());
			pStmt.setInt(7, player.getSalary());
			
			pStmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStmt != null && !pStmt.isClosed()) 
					pStmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}	
    }
    
    public EaglesDTO selectOne(int backNo) {
    	String query = "select * from Eagles where back_no=?;";
    	PreparedStatement pStmt = null;
    	EaglesDTO player = new EaglesDTO();
    	try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, backNo);
			ResultSet rs = pStmt.executeQuery();
			
			while (rs.next()) {
				player.setBackNo(rs.getInt(1));
				player.setName(rs.getString(2));
				player.setPosition(rs.getString(3));
				player.setHs(rs.getString(4));
				player.setHand(rs.getString(5));
				player.setBirth(rs.getInt(6));
				player.setSalary(rs.getInt(7));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStmt != null && !pStmt.isClosed()) 
					pStmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
    	return player;
    }
    
    public List<EaglesDTO> selectPlayersByPosition(String position) {
    	String sql = "select * from Eagles where position like '" + position + "';";
    	List<EaglesDTO> playerList = selectCondition(sql);
    	return playerList;
    }
    
    public List<EaglesDTO> selectPlayersBySalary(int salary) {
    	String sql = "select * from Eagles where salary>=" + salary + ";";
    	List<EaglesDTO> playerList = selectCondition(sql);
    	return playerList;
    }
    
    public List<EaglesDTO> selectAll() {
    	String sql = "select * from Eagles;";
    	List<EaglesDTO> playerList = selectCondition(sql);
    	return playerList;
    }
    
    public List<EaglesDTO> selectCondition(String query) {
    	PreparedStatement pStmt = null;
    	List<EaglesDTO> playerList = new ArrayList<EaglesDTO>();
    	try {
			pStmt = conn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();
			
			while (rs.next()) {
				EaglesDTO player = new EaglesDTO();
				player.setBackNo(rs.getInt(1));
				player.setName(rs.getString(2));
				player.setPosition(rs.getString(3));
				player.setHs(rs.getString(4));
				player.setHand(rs.getString(5));
				player.setBirth(rs.getInt(6));
				player.setSalary(rs.getInt(7));
				playerList.add(player);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStmt != null && !pStmt.isClosed()) 
					pStmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
    	return playerList;
    }
    
    public void close() {
    	try {
			if (conn != null && !conn.isClosed()) 
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
}
