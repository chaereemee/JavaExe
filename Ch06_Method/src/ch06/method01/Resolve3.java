package ch06.method01;

public class Resolve3 {

	public static int total(int n1, int n2) {
		int sum = 0;
		for (int i = n1; i <= n2; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		int result = total(10, 100);
		System.out.println(result);
	}

}
