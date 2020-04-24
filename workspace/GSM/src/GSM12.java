import gsm.util.IntArray;

public class GSM12 {
    public static void main(String[] args) {
        IntArray gsm = new IntArray(7);
        gsm.add(3209);
        gsm.add(1);
        gsm.add(2);
        gsm.add(3);
        gsm.add(4);
        gsm.add(5);
        gsm.add(6);

        for(int i = 0; i<gsm.size();i++){
            System.out.println(gsm.get(i));
        }

    }
}
