import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ID :");
        String id = sc.next();

        System.out.println("PW :");
        String pw = sc.next();

        System.out.println("AGE :");
        int age = Integer.parseInt(sc.next());

        System.out.println(id +"\t"+ pw +"\t"+  age);

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
            String user = "hr";
            String password = "hr";
            Connection conn = DriverManager.getConnection(URL, user, password);
            Statement st = conn.createStatement();

            String SQL = "insert into tblmem values(?,?,?)";

            PreparedStatement ps = conn.prepareStatement(SQL);
            ps.setString(1, id);
            ps.setString(2, pw);
            ps.setInt(3, age);

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
