package ch09.resolve14.resolve02;

public class Sony implements ITablet {

	@Override
	public void movie() throws InterruptedException {
		System.out.println("Sony - 영화좋다");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

	@Override
	public void music() throws InterruptedException {
		System.out.println("Sony - 음악좋다");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

	@Override
	public void readBook() throws InterruptedException {
		System.out.println("Sony - 독서좋다");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

}
