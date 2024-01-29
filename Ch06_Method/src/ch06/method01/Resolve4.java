package ch06.method01;

public class Resolve4 {
	
	public static void gugudan(int num) {
		for(int i=1; i<=9; i++) {
			System.out.printf("%d x %d = %d\n", num, i, num*i);
		}
	}

	public static void main(String[] args) {
		gugudan(3);
	}

}
