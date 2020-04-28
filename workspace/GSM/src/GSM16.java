import gsm.util.Cat;
import gsm.util.Dog;

public class GSM16 {
    public static void main(String[] args) {
        Dog d = new Dog("댕댕이", 3);
//        d.setName("댕댕이");
//        d.setAge(3);
        System.out.println(d);

        Cat c = new Cat("냥이", 2);
        System.out.println(c);
    }
}
