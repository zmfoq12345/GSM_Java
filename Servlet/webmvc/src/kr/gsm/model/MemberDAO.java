package kr.gsm.model;
import java.sql.*;
import java.util.ArrayList;
public class MemberDAO {
  private Connection conn;
  private PreparedStatement ps;
  private ResultSet rs;
  // 초기화블럭
  static {
   try {                              // DriverManager
      Class.forName("oracle.jdbc.driver.OracleDriver");
   } catch (Exception e) {
      e.printStackTrace();
   }      
  }
  public Connection getConnect() {
     String url="jdbc:oracle:thin:@127.0.0.1:1521:XE";//접속URL
     String user="hr";
     String password="hr";
     try {
      conn=DriverManager.getConnection(url, user, password);
    } catch (Exception e) {
      e.printStackTrace();
    }
     return conn;
  }
  public int memberInsert(MemberVO vo) {
     conn=getConnect();
     String sql="insert into tblMem values(seq_num.nextval,?,?,?,?,?)";
     int cnt=-1;
     try {
      ps=conn.prepareStatement(sql);
      ps.setInt(1, vo.getBun());
      ps.setString(2, vo.getName());
      ps.setString(3, vo.getTel());
      ps.setString(4, vo.getEmail());
      ps.setString(5, vo.getAddr());
      cnt=ps.executeUpdate();// 1
   } catch (Exception e) {
      e.printStackTrace();
   }
     return cnt;
  }
  public ArrayList<MemberVO> memberList(){
	  ArrayList<MemberVO> list=new ArrayList<MemberVO>();
	  conn=getConnect();
	  String sql="Select * from tblMem order by num desc";
	  try {
		ps=conn.prepareStatement(sql);
		rs=ps.executeQuery();
		while(rs.next()) {
			int num=rs.getInt("num");
			int bun=rs.getInt("bun");
			String name=rs.getString("name");
			String tel=rs.getString("tel");
			String email=rs.getString("email");
			String addr=rs.getString("addr");
			
			MemberVO vo=new MemberVO(num, bun, name, tel, email, addr);
			list.add(vo);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	  return list;
  }
}