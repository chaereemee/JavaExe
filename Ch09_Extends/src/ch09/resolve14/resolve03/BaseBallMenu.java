package ch09.resolve14.resolve03;

import java.util.Scanner;

// 메뉴를 담당하는 역할 

public class BaseBallMenu {
	private int[] playerNums = new int[3];
	Scanner sc = new Scanner(System.in);
	
	public void viewMenu() {
		System.out.print("첫번째 숫자 입력 >> ");
		playerNums[0] = sc.nextInt();
		System.out.print("두번째 숫자 입력 >> ");
		playerNums[1] = sc.nextInt();
		System.out.print("세번째 숫자 입력 >> ");
		playerNums[2] = sc.nextInt();
	}
	
	public int[] getPlayerNums() {
		return playerNums;
	}
}
