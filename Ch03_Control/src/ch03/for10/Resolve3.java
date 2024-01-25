/*
 * 3. 정수 3개를 입력받고 이 3개의 수로 삼각형을 만들 수 있는지를 판별하세요
 * 삼각형이 가능하려면 두 변의 합이 다른 한 변의 합보다 반드시 커야 합니다. (조건 연산자를 사용하세요)
 */

package ch03.for10;

import java.util.Scanner;

public class Resolve3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 >> ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		String str;
		str = num3 < (num1 + num2) ? "삼각형을 만들 수 있습니다." : "삼각형을 만들 수 없습니다.";
		System.out.println(str);
		
		sc.close();
	}

}
