package basic01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectMain {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");	
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false",
                "javauser", "javapass");	
            				
            st = conn.createStatement();
            String sql = "select * from date_table;";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int dateId = rs.getInt(1);
                String date = rs.getString(2);
                System.out.printf("%8d  %s\n", dateId, date);
            }
            System.out.println();
            sql = "select id, date_format(datetime, '%Y-%m-%d %r') from date_table;";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                int dateId = rs.getInt(1);
                String date = rs.getString(2);
                System.out.printf("%8d  %s\n", dateId, date);
            }
            rs.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                st.close();
                conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

}
