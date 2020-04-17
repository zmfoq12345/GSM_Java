public class GSM01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

//        hap(a, b, c);

        int[] arr = new int[3];
        System.out.println(arr.length);
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        hap(arr);
    }

    public static void hap(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length;i++){
             sum += arr[i];
        }
        System.out.println(sum);
    }
}