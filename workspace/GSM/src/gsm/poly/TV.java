package gsm.poly;

public class TV implements RemoCon{

    @Override
    public void volUP() {
        System.out.println("TV 소리가 울라간다.");
    }

    @Override
    public void volDOWN() {
        System.out.println("TV 소리가 내려간다.");
    }

    @Override
    public void internet() {
        System.out.println("TV가 인터넷이 된다.");
    }
}
