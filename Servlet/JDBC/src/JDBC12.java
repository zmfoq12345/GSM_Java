import kr.gsm.MemberDAO;
import kr.gsm.MemberScan;
import kr.gsm.MemberVo;

import java.util.ArrayList;

public class JDBC12 {
    public static void main(String[] args) {
        MemberScan ms = new MemberScan();
        MemberDAO dao = new MemberDAO();

        ArrayList<MemberVo> mv = dao.getAllList();

        if (mv.size() > 0){
            System.out.println("ID      PW     AGE");
            System.out.println("--------------------");
            for (MemberVo i : mv){
                System.out.println(i.getId() + "     " + i.getPw() + "     " + i.getAge());
            }
            System.out.println("");
            System.out.println("ID      PW     AGE");
            System.out.println("--------------------");
            for (MemberVo i : dao.getAllList()){
                System.out.println(i.toString());
            }
        }else {
            System.out.println("데이터가 없습니다!");
        }

    }
}