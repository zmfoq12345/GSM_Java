public class GSM02 {
    public static void main(String[] args) {

        int[] a = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        int[] b = {10, 20, 30};
        for (int i = 0;i<b.length;i++){
            if(b[i]%2 == 0){
                System.out.println(b[i]);
            }
        }
        int even = 0;
        int odd = 0;

        for (int v: b){
            if(v%2==0){
                even+=v;
            }else{
                odd+=v;
            }
        }
    }
}
