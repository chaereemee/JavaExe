package ch09.extends05;

public class GrandFather {
	
	private int handsomeScore = 10;
	
	public GrandFather() {
		System.out.println("GrandFather 생성자");
	}
	
	public GrandFather(int score) {
		this.handsomeScore = score;
		System.out.println("GrandFather 매개변수 생성");
	}
	
	public void handsome() {
		System.out.println("잘 생겼다~");
	}
}
