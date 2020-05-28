import kr.gsm.MemberDAO;
import kr.gsm.MemberVo;

import java.util.Scanner;

public class JDBC09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ID :");
        String id = sc.next();

        System.out.println("PW :");
        String pw = sc.next();

        System.out.println("AGE :");
        int age = Integer.parseInt(sc.next());

        System.out.println(id +"\t"+ pw +"\t"+  age);


        MemberVo vo = new MemberVo(id, pw, age);
        MemberDAO dao = new MemberDAO();

        if (dao.memInssert(vo) > 0) {
            System.out.println("삽입 성공");
        } else {
            System.out.println("삽입 실패");
        }
    }
}