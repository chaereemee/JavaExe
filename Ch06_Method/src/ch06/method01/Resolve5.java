package ch06.method01;

public class Resolve5 {
	
	public static void star(int num) {
		for(int i=1; i<=num; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		star(5);
	}

}
