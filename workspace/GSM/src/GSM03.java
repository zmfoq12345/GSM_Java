public class GSM03 {
    public static void main(String[] args) {
        int b_num=3209;
        int b_ban=2;
        float kor=33.3f;
        float eng=66.6f;

        Sungjuck sj = new Sungjuck();
        sj.b_num = b_num;
        sj.b_ban = b_ban;
        sj.kor = kor;
        sj.eng = eng;
        System.out.println(sj.b_num);
        System.out.println(sj.b_ban);
        System.out.println(sj.kor);
        System.out.println(sj.eng);
    }
}
