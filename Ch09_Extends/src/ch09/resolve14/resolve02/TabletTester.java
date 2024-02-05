package ch09.resolve14.resolve02;

public class TabletTester {
	private final int TEST_NUM = 3;
	private ITablet tablet;
	
	public TabletTester(ITablet tablet) {
		this.tablet = tablet;
	}
	
	public TabletTester() {
		
	}
	
	public void setTablet(ITablet tablet) {
		this.tablet = tablet;
	}

	public int movieTest() throws InterruptedException {
		for(int i=0;i<TEST_NUM;i++) {
			tablet.movie();
			tablet.movie();
			tablet.movie();
		}
		return (int)(Math.random()*50) + 50;	
	}
	
	public int musicTest() throws InterruptedException {
		for(int i=0;i<TEST_NUM;i++) {
			tablet.music();
			tablet.music();
			tablet.music();
		}
		return (int)(Math.random()*50) + 50;	
	}
	
	public int readBookTest() throws InterruptedException {
		for(int i=0;i<TEST_NUM;i++) {
			tablet.readBook();
			tablet.readBook();
			tablet.readBook();
		}
		return (int)(Math.random()*50) + 50;	
	}
	
	public int tabletUseTest() throws InterruptedException {
		for(int i=0;i<TEST_NUM;i++) {
			tablet.movie();
			tablet.movie();
			tablet.music();
			tablet.music();
			tablet.readBook();
			tablet.readBook();
		}
		return (int)(Math.random()*50) + 50;	
	}
}
