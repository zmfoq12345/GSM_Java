import java.sql.*;
public class JDBC04 {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String URL="jdbc:oracle:thin:@127.0.0.1:1521:XE";
            String user="hr";
            String password="hr";
            Connection conn=DriverManager.getConnection(URL, user, password);
            String SQL = "select * from mygsm order by id desc";

            Statement st = conn.createStatement();
            st.executeUpdate(SQL);
            ResultSet rs = st.executeQuery(SQL);
            System.out.println("3209 양현승");
            while (rs.next()){
                String id = rs.getString("id");
                String pwd = rs.getString("pwd");
                int age = rs.getInt("age");
                System.out.println(id+"\t"+pwd+"\t"+age);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}