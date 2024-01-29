package ch06.method01;

import java.util.Scanner;

public class Resolve1 {
	public static int MaxNum(int n1, int n2) {
		int maxNum = n1;
		if (maxNum < n2)
			maxNum = n2;
		return maxNum;
	}

	public static int MinNum(int n1, int n2) {
		int minNum = n1;
		if (minNum > n2)
			minNum = n2;
		return minNum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("2개의 정수를 입력 >> ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int max = MaxNum(num1, num2);
		int min = MinNum(num1, num2);
		System.out.println("큰 값 : " + max + ", 작은 값 : " + min);

		sc.close();
	}

}
