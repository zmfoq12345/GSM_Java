import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import kr.gsm.MemberVo;
public class JDBC05 {
	public static void main(String[] args) {
		ArrayList<MemberVo> list = new ArrayList<MemberVo>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String user = "hr";
			String password = "hr";
			Connection conn = DriverManager.getConnection(URL, user, password);

			Statement st = conn.createStatement();
			String SQL = "select * from tblmem";
			ResultSet rs = st.executeQuery(SQL);
			
			while(rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				int age = rs.getInt("age");
				MemberVo vo = new MemberVo(id, pw, age);
				list.add(vo);
			}
			listprint(list);
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	private static void listprint(ArrayList<MemberVo> list) {
		System.out.println("3209양현승");
//		System.out.println(list.get(0).toString());
		for (MemberVo i : list) {
			System.out.println(i.toString());
		}
		
	}
}

