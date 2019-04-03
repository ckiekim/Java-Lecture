package basic04_member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	private Connection conn;
    private static final String USERNAME = "javauser";
    private static final String PASSWORD = "javapass";
    private static final String URL = "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false";

    public MemberDAO() {
    	try {
			Class.forName("com.mysql.jdbc.Driver");	
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    	} catch (Exception ex) {
			ex.printStackTrace();
		}
    }
    
    public void insertMember(MemberDTO member) {
    	String query = "insert into member(password, name, birthday, address) values (?, ?, ?, ?);";
    	PreparedStatement pStmt = null;
    	try {
			pStmt = conn.prepareStatement(query);
			pStmt.setString(1, member.getPassword());
			pStmt.setString(2, member.getName());
			pStmt.setString(3, member.getBirthday());
			pStmt.setString(4, member.getAddress());
			
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
    
    public void updateMember(MemberDTO member) {
    	String query = "update member set password=?, name=?, birthday=?, address=? where id=?;";
    	PreparedStatement pStmt = null;
    	try {
			pStmt = conn.prepareStatement(query);
			pStmt.setString(1, member.getPassword());
			pStmt.setString(2, member.getName());
			pStmt.setString(3, member.getBirthday());
			pStmt.setString(4, member.getAddress());
			pStmt.setInt(5, member.getId());
			
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
    
    public void deleteMember(int memberId) {
    	String query = "delete from member where id=?;";
    	PreparedStatement pStmt = null;
    	try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, memberId);
			
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
    
    public MemberDTO searchById(int memberId) {
    	String sql = "select * from member where id=" + memberId + ";";
    	MemberDTO mDto = selectOne(sql);
    	return mDto;
    }
    
    public MemberDTO searchByName(String memberName) {
    	String sql = "select * from member where name like '" + memberName + "';";
    	MemberDTO mDto = selectOne(sql);
    	return mDto;
    }

    public MemberDTO selectOne(String query) {
    	PreparedStatement pStmt = null;
    	MemberDTO member = new MemberDTO();
    	try {
			pStmt = conn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();
			
			while (rs.next()) {
				member.setId(rs.getInt(1));
				member.setPassword(rs.getString(2));
				member.setName(rs.getString(3));
				member.setBirthday(rs.getString(4));
				member.setAddress(rs.getString(5));
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
    	return member;
    }
    
    public List<MemberDTO> selectAll() {
    	String query = "select * from member order by id desc;";
    	PreparedStatement pStmt = null;
    	List<MemberDTO> memberList = new ArrayList<MemberDTO>();
    	try {
			pStmt = conn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();
			
			while (rs.next()) {
				MemberDTO member = new MemberDTO();
				member.setId(rs.getInt(1));
				member.setPassword(rs.getString(2));
				member.setName(rs.getString(3));
				member.setBirthday(rs.getString(4));
				member.setAddress(rs.getString(5));
				memberList.add(member);
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
    	return memberList;
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
