import java.sql.*;
public class JDBC03 {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String URL="jdbc:oracle:thin:@127.0.0.1:1521:XE";
            String user="hr";
            String password="hr";

            Connection conn=DriverManager.getConnection(URL, user, password);
            // 수정SQL=>id가 gsm인 회원의 비밀번호=1004, 나이=15로 수정하시오.
            String SQL = "UPDATE mygsm SET pwd = 1004, age = 15 where id = 'gsm'";

            Statement st = conn.createStatement();
            st.executeUpdate(SQL);
            System.out.println("수정성공_3209_양현승");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}