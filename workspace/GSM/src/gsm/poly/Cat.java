package gsm.poly;

public class Cat extends Animal {
    @Override
    public void eat(){
        System.out.println("고양이처럼 먹다.");
    }
    public void night(){
        System.out.println("밤에 눈에 불이 나온다.");
    }
    @Override
    public void move(){
        System.out.println("고양이들이 무리를 지어서 이동한다.");
    }
}
