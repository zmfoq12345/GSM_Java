import db.driver.*;

public class JDBC01 {

    public static void main(String[] args) {
        db.driver.DBDriver driver = new MyOracleDriver();
        driver.getConnect();

        driver = new MyMySqlDriver();
        driver.getConnect();
    }

}