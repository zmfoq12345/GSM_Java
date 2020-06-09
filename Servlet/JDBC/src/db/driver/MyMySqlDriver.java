package db.driver;

public class MyMySqlDriver implements DBDriver{
    public void getConnect() {
        System.out.println("MySQL 데이터베이스에 접속합니다.");
    }
}