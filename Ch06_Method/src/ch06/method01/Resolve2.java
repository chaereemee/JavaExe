package ch06.method01;

import java.util.Scanner;

public class Resolve2 {

	public static int absNum(int n1, int n2) {
		return Math.abs(n1 - n2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("두 개의 정수 입력 >> ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int result = absNum(num1, num2);
		System.out.println("두 수의 차의 절대값 : " + result);
		
		sc.close();
	}

}
