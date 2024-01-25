/*
 * 15. 사용자로부터 정수를 입력받습니다
 * 입력 받은 값을 계속 더합니다
 * 사용자가 0을 입력하면 합을 출력합니다
 * 프로그램을 종료합니다
 */

package ch03.for10;

import java.util.Scanner;

public class Resolve15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
			System.out.print("정수 입력 >> ");
			int num = sc.nextInt();
			if(num == 0)
				break;
			else
				sum += num;
		}
		System.out.println("합: " + sum);
		
		sc.close();
	}
}
