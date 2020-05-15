import gsm.poly.Radio;
import gsm.poly.RemoCon;
import gsm.poly.TV;

public class GSM26 {
    public static void main(String[] args) {
        RemoCon tv = new TV();
        tv.volUP();
        tv.volDOWN();
        tv.internet();

        RemoCon radio = new Radio();
        radio.volUP();
        radio.volDOWN();
        radio.internet();

    }
}
