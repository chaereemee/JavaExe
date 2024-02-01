package ch08.class09.answer01;

public class FruitBuyer {
	private int money;
	private int numOfApple;
	final int APPLE_PRICE = 1000;     // 사과가격 (상수)
	
	public FruitBuyer(int money) {
		this.money = money;
		this.numOfApple = 0;
	}
	
	public void buyApple(int money) {
		int num = money/APPLE_PRICE;
		this.numOfApple += num;
		this.money -= money;
	}
	
	public void showBuyResult() {
		System.out.println("*** 과일 구매자의 현재 상황 ***");
		System.out.println("현재 잔액 : " + money);
		System.out.println("사과 개 : " + numOfApple);
	}
}
