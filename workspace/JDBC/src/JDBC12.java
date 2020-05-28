import kr.gsm.MemberDAO;
import kr.gsm.MemberScan;
import kr.gsm.MemberVo;

import java.util.ArrayList;

public class JDBC12 {
    public static void main(String[] args) {
        MemberScan ms = new MemberScan();
        MemberDAO dao = new MemberDAO();

        for (MemberVo i : dao.getAllList()){
            System.out.println(i.toString());
        }

    }
}