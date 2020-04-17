public class GSM05 {
    public static void main(String[] args) {

        Sungjuck sj = new Sungjuck();
        System.out.println(sj.b_num);
        System.out.println(sj.b_ban);
        System.out.println(sj.kor);
        System.out.println(sj.eng);

        Sungjuck sj1 = new Sungjuck(3209, 2, 99.9f, 0.11f);
        System.out.println(sj1.b_num);
        System.out.println(sj1.b_ban);
        System.out.println(sj1.kor);
        System.out.println(sj1.eng);
    }
}
