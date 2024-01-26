// 7

package ch03.continue11;

import java.util.Scanner;

public class Resolve3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean key = true;
		int money = 0;
		
		while(key) {
			System.out.println("-------------------------------");
			System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------");
			System.out.println("선택>");
			int num = sc.nextInt();
			
			if(num == 4)
				key = false;
			else if(num == 1) {
				System.out.println("예금액>");
				int plus = sc.nextInt();
				money += plus;
			}
			else if(num == 2) {
				System.out.println("출금액>");
				int minus = sc.nextInt();
				money -= minus;
			}
			else if(num == 3) {
				System.out.println("잔고>" + money);
			}
		}
		sc.close();
	}

}
