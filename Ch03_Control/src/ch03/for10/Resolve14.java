// 14. 입력받은 숫자의 구구단을 출력하세요

package ch03.for10;

import java.util.Scanner;

public class Resolve14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 >> ");
		int num = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(num + " x " + i + " = " + num * i);
		}
		
		sc.close();
	}

}
