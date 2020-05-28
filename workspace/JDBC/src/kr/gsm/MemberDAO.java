package kr.gsm;
import java.sql.*;
public class MemberDAO { // MyBatis( java code + sql = XML )
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public Connection getDBConn(){
        String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
        String user = "hr";
        String password = "hr";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(URL, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public int memInssert(MemberVo vo){
       conn = getDBConn();
       String SQL = "insert into tblmem values(?,?,?)";
        int cnt = 0;
       try {
           ps = conn.prepareStatement(SQL);
           ps.setString(1, vo.getId());
           ps.setString(2, vo.getPw());
           ps.setInt(3, vo.getAge());

           cnt = ps.executeUpdate();
       }catch (Exception e){
           e.printStackTrace();
       } finally {
           dbClose();
           return cnt;
       }
    }
    public int memUpdate(MemberVo vo){
        conn = getDBConn();
        String SQL = "UPDATE tblmem SET pw = ?, age = ? where id = ?";
        int cnt = 0;
        try {
            ps = conn.prepareStatement(SQL);
            ps.setString(3, vo.getId());
            ps.setString(1, vo.getPw());
            ps.setInt(2, vo.getAge());

            cnt = ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            dbClose();
            return cnt;
        }
    }
    public int memDelete(MemberVo vo){
        conn = getDBConn();
        String SQL = "Delete from tblmem where id = ?";
        int cnt = 0;
        try {
            ps = conn.prepareStatement(SQL);
            ps.setString(1, vo.getId());

            cnt = ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            dbClose();
            return cnt;
        }
    }

    public void dbClose() {
        if (conn!=null) {
            try {
                if (rs!=null) rs.close();
                if (ps!=null) ps.close();
                if (conn!=null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}
