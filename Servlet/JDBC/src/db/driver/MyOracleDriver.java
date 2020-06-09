package db.driver;

public class MyOracleDriver implements DBDriver{
    @Override
    public void getConnect() {
        System.out.println("Oracle 데이터베이스에 접속합니다.");
    }
}