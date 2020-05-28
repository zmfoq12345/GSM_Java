import kr.gsm.MemberDAO;
import kr.gsm.MemberScan;
import kr.gsm.MemberVo;

import java.util.ArrayList;

public class JDBC13 {
    public static void main(String[] args) {
        MemberScan ms = new MemberScan();
        MemberDAO dao = new MemberDAO();

        ArrayList<MemberVo> list  = dao.memSelect(ms.scanData("ID"));

        for (MemberVo i : list){
            System.out.println(i.toString());
        }

    }
}