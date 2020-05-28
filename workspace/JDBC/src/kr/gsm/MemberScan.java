package kr.gsm;

import java.util.Scanner;

public class MemberScan {
    public String scanData(String data){
        Scanner sc = new Scanner(System.in);
        System.out.println(data+" :");
        return sc.next();
    }
}
