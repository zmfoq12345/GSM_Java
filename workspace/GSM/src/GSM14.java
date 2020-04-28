import gsm.util.MovieArray;
import gsm.util.MovieVO;

public class GSM14 {
    public static void main(String[] args) {
        // 영화 3편을 MovieArray에 저장하고 출력하시오.
        MovieArray gsm = new MovieArray(3);

        gsm.add(new MovieVO("아이언맨1", "양현승", 101, 12));
        gsm.add(new MovieVO("아이언맨2", "김이박", 132320, 19));
        gsm.add(new MovieVO("아이언맨3", "홍길동", 10324, 15));

        for(int i = 0; i<gsm.size();i++){
            System.out.println(gsm.get(i));
        }
    }
}
