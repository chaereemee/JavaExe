package ch09.resolve14.resolve02;

public class Samsung implements ITablet {

	@Override
	public void movie() throws InterruptedException {
		System.out.println("Samsung - 영화좋다");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

	@Override
	public void music() throws InterruptedException {
		System.out.println("Samsung - 음악좋다");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

	@Override
	public void readBook() throws InterruptedException {
		System.out.println("Samsung - 독서좋다");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

}
