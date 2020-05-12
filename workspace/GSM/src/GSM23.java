import gsm.poly.A;
import gsm.poly.B;

public class GSM23 {
    public static void main(String[] args) {
        Object[] o = new Object[2];
        o[0] = new A();
        o[1] = new B();

        display(o);


    }
    private static void display(Object[] obj) {
        for (int i = 0; i < obj.length; i++){
            if (obj[i] instanceof A)
                ((A)obj[i]).ptr();
            else
                ((B)obj[i]).ptr();
        }
    }
}
