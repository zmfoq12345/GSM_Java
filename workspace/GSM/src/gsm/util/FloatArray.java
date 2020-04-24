package gsm.util;

public class FloatArray {
    private float[] arr;
    private int cnt = 0;

    public FloatArray() { this(10); }
    public FloatArray(int LEN){ arr = new float[LEN]; }

    public void add(float DATA){ arr[cnt++] = DATA; }
    public int size(){ return cnt; }

    public float get(int idx){ return arr[idx]; }

}
