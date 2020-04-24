package gsm.util;

public class IntArray {
    private int[] arr;
    private int cnt = 0;

    public IntArray() { this(10); }
    public IntArray(int LEN){ arr = new int[LEN]; }

    public void add(int DATA){ arr[cnt++] = DATA; }
    public int size(){ return cnt; }

    public int get(int idx){ return arr[idx]; }

}
