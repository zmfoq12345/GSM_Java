package kr.gsm;
import java.lang.reflect.Member;
import java.sql.*;
import java.util.ArrayList;

public class MemberDAO { // MyBatis( java code + sql = XML )
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private ArrayList<MemberVo> list = new ArrayList<MemberVo>();

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
    public int memDelete(String id){
        conn = getDBConn();
        String SQL = "Delete from tblmem where id = ?";
        int cnt = 0;
        try {
            ps = conn.prepareStatement(SQL);
            ps.setString(1, id);

            cnt = ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            dbClose();
            return cnt;
        }
    }
    public ArrayList<MemberVo> memSelect(String id){
        conn = getDBConn();
        String SQL = "select * from tblmem where id = ?";
        try {
            ps = conn.prepareStatement(SQL);
            ps.setString(1, id);
            rs = ps.executeQuery();

            while(rs.next()) {
                MemberVo vo = new MemberVo(rs.getString("id"), rs.getString("pw"), rs.getInt("age"));
                list.add(vo);
            }
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            dbClose();
            return list;
        }
    }
    public ArrayList<MemberVo> getAllList(){
        conn = getDBConn();
        list = new ArrayList<MemberVo>();
        String SQL = "select * from tblmem";
        try {
            ps = conn.prepareStatement(SQL);
            rs = ps.executeQuery();
            while(rs.next()) {
                MemberVo vo = new MemberVo(rs.getString("id"), rs.getString("pw"), rs.getInt("age"));
                list.add(vo);
            }
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            dbClose();
            return list;
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
