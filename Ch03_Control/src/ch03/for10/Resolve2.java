/*
 * 2. 369게임을 작성합니다.
 * 1~99까지의 정수를 입력받고
 * 3,6,9중 하나가 있으면 "박수짝"을 출력하고
 * 2개가 있으면 "박수짝짝"을 출력하세요
 * 예를 들어 13은 "박수짝"
 * 36인 경우는 "박수짝짝"을 출력하면 됩니다.
 */

package ch03.for10;

import java.util.Scanner;

public class Resolve2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~99 까지의 정수 입력 >> ");
		int num = sc.nextInt();
		
		int cnt = 0;
		
		if((num/10 == 3 || num/10 == 6 || num/10 == 9))
			cnt++;
		if((num%10 == 3 || num%10 == 6 || num%10 == 9))
			cnt++;
		
		System.out.print("박수");
		if(cnt == 1)
			System.out.print("짝");
		else if(cnt == 2)
			System.out.print("짝짝");
		
		sc.close();
	}

}