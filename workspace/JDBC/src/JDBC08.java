import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDBC08 {
    public static void main(String[] args) {
        String id = "java";
        String pw = "java3209";
        int age = 19;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
            String user = "hr";
            String password = "hr";
            Connection conn = DriverManager.getConnection(URL, user, password);
            Statement st = conn.createStatement();

            String SQL = "UPDATE tblmem SET pw = ?, age = ? where id = ?";

            PreparedStatement ps = conn.prepareStatement(SQL);
            ps.setString(1, pw);
            ps.setInt(2, age);
            ps.setString(3, id);

            int cnt = ps.executeUpdate();

            if (cnt > 0) {
                System.out.println("수정성공");
            } else {
                System.out.println("수정실패");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
