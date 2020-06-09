import java.sql.*;
public class JDBC02 {
    public static void main(String[] args) {
        // Oracle DB접속하기->Oracle용 접속 JDBC Driver(ojdbc6.jar)가 필요하다.
        try {
            // 1. 메모리에 로딩..
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // 2. 접속정보
            String URL="jdbc:oracle:thin:@127.0.0.1:1521:XE";
            String user="hr";
            String password="hr";
            Connection conn=DriverManager.getConnection(URL, user, password);
            if(conn!=null) {
                System.out.println("접속성공");
            }else{
                System.out.println("접속실패");
            }
            // SQL->CRUD
            String delSQL = "delete from mygsm";
            String SQL = "insert into mygsm values('3209_양현승', 'gsm9',19)";
            String SQL2 = "insert into mygsm values('gsm', '12345',20)";
            Statement st = conn.createStatement();
            st.execute(delSQL);
            st.executeUpdate(SQL);
            st.executeUpdate(SQL2);
            System.out.println("입력 성공");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}