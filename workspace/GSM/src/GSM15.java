import gsm.util.Cat;
import gsm.util.Dog;

public class GSM15 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setName("댕댕이");
        d.setAge(3);

        System.out.println(d);

        Cat c = new Cat();
        c.setName("냥이");
        c.setAge(2);

        System.out.println(c);
    }
}
