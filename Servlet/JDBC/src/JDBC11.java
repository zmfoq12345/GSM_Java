import kr.gsm.MemberDAO;
import kr.gsm.MemberScan;
import kr.gsm.MemberVo;

public class JDBC11 {
    public static void main(String[] args) {
        MemberScan ms = new MemberScan();
        MemberDAO dao = new MemberDAO();

        if (dao.memDelete(ms.scanData("ID")) > 0) {
            System.out.println("삭제 성공");
        } else {
            System.out.println("삭제 실패");
        }
    }
}