import kr.gsm.MemberDAO;
import kr.gsm.MemberScan;
import kr.gsm.MemberVo;

import java.util.Scanner;

public class JDBC10 {
    public static void main(String[] args) {
        MemberScan ms = new MemberScan();
        MemberVo vo = new MemberVo(ms.scanData("ID"), ms.scanData("PW"), Integer.parseInt(ms.scanData("AGE")));
        MemberDAO dao = new MemberDAO();

        if (dao.memUpdate(vo) > 0) {
            System.out.println("수정 성공");
        } else {
            System.out.println("수정 실패");
        }
    }
}