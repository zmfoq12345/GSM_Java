package kr.gsm.model;

public class MyUtil {
	public int totHap() {
		int sum = 0;
		for (int i = 1; i<= 100; i++) {
			sum+=i;
		}
		return sum;
	}
	public int totHap(int n1, int n2) {
		int sum = 0;
		for (int i = n1; i<= n2; i++) {
			sum+=i;
		}
		return sum;
	}

	public int toCnt(int n1, int n2) {
		// �μ������� 3�� ����̰� 5�� ����� ����
		int cnt = 0;
		for (int i = n1; i<= n2; i++) {
			if (i % 3 == 0&& i % 5 == 0) {
				cnt++;
			}
		}
		return cnt;
	} 
}
