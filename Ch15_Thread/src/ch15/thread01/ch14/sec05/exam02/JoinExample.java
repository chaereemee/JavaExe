package ch15.thread01.ch14.sec05.exam02;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
		System.out.println("1~100 합 : " + sumThread.getSum());
	}

}
