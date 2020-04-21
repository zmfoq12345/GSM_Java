import gsm.util.MyUtil;
import java.lang.System;
import java.lang.String;

public class GSM09 {
    public static void main(String[] args) {
        int v = MyUtil.hap(10, 20);
        System.out.println(v);

        MyUtil m = new MyUtil();
        float vv = m.hap(10.1f, 4.3f);
        System.out.println(vv);

        String su = "100";
        int s = Integer.parseInt(su);
        System.out.println(s);

        String a = "100";
        String b = "200";
        System.out.println(Integer.parseInt(a)+Integer.parseInt(b));
    }
}
