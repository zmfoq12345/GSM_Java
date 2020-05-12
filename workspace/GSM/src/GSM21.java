import gsm.poly.Animal;
import gsm.poly.Dog;
import gsm.poly.Cat;

public class GSM21 {
    public static void main(String[] args) {
        Animal[] a = new Animal[2];
        a[0] = new Dog();
        a[1] = new Cat();
        display(a);

    }
    private static void display(Animal a[]) {
        for(int i=0; i<a.length; i++){
            a[i].eat();
            a[i].move();
            if (a[i] instanceof Cat){
                ((Cat)a[i]).night();
            }
        }
    }
}
