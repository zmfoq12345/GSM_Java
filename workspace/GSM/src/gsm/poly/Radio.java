package gsm.poly;

public class Radio implements RemoCon {
    @Override
    public void volUP() {
        System.out.println("Radio 소리가 올라간다.");
    }

    @Override
    public void volDOWN() {
        System.out.println("Radio 소리가 내려간다.");
    }

    @Override
    public void internet() {
        System.out.println("Radio 인터넷이 된다.");

    }
}
