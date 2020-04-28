package gsm.util;

public class MovieArray {
    private MovieVO[] arr;
    private int cnt;

    public int size() {
        return cnt;
    }
    public MovieArray() {
        this(10);
    }
    public MovieArray(int inital) {
        arr = new MovieVO[inital];
    }
    public void add(MovieVO data) {
        arr[cnt++] = data;
    }
    public MovieVO get(int index) {
        return arr[index];
    }
}