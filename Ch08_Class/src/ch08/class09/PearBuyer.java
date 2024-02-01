package ch08.class09;

import java.util.Scanner;

public class PearBuyer {
	private int money;
	private int numOfPear;
	final int PEAR_PRICE = 2500;
	Scanner sc = new Scanner(System.in);
	
	public PearBuyer() {
		System.out.print("구매할 배 개수와 사용할 돈을 입력하세요 >> ");
		this.numOfPear = sc.nextInt();
		this.money = sc.nextInt();
	}
	public void buyPear() {
		this.money = money - (numOfPear * PEAR_PRICE);
	}
	
	public void showBuyResult() {
		System.out.println("현재 잔액 : " + money);
		System.out.println("구매한 배 개수 : " + numOfPear);
	}
}
