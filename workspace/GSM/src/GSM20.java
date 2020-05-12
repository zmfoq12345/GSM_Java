import gsm.poly.Animal;
import gsm.poly.Cat;
import gsm.poly.Dog;

public class GSM20 {
    public static void main(String[] args) {
        Dog d = new Dog();
        display(d);

        Cat c = new Cat();
        display(c);
    }

    private static void display(Animal a) {
        a.eat();
        a.move();

        if (a instanceof Cat){
            ((Cat)a).night();
        }
    }
}
