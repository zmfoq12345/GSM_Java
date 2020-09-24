package kr.gsm;

public class MyUtil {
	public int hap() {
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%3==0)
				sum+=i;
		}
		return sum;
	}
}
