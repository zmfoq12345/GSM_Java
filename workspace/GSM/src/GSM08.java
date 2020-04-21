public class GSM08 {
    public static void main(String[] args) {
        int v = total(1, 2); // parameter passing(인수전달기법)
        System.out.println(v);

        GSM08 g = new GSM08();

        int v2 = g.twoHap(1, 100);
        System.out.println(v2);
    }

    public int twoHap(int a, int b) {
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        int sum = 0;
        for (int i=a;i<=b;i++){
            sum+=i;
        }
        return sum;
    }

    public static int total(int a, int b) {
        int value = a + b;
        return value;
    }
}
