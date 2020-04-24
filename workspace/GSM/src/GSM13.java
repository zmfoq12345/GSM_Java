import gsm.util.FloatArray;

public class GSM13 {
    public static void main(String[] args) {
        FloatArray gsm = new FloatArray(5);
        gsm.add(3209f);
        gsm.add(1f);
        gsm.add(2f);
        gsm.add(3f);
        gsm.add(4f);

        for(int i = 0; i<gsm.size();i++){
            System.out.println(gsm.get(i));
        }

    }
}
