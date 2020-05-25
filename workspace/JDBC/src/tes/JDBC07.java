package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC07 {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String URL="jdbc:oracle:thin:@127.0.0.1:1521:XE";
            String user="hr";
            String password="hr";
            Connection conn= DriverManager.getConnection(URL, user, password);
            Statement st=conn.createStatement();

            String SQL = "delete from mygsm where id='gsm'";

            int cnt = st.executeUpdate(SQL);

            if (cnt > 0) {
                System.out.println("삭제성공");
            } else {
                System.out.println("삭제실패");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
