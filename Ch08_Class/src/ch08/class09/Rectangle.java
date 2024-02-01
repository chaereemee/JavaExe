package ch08.class09;

public class Rectangle {
	private int x1, y1, x2, y2;  // 사각형을 구성하는 두 점의 좌표 
	private int area;
	
	public void set(int x1, int y1, int x2, int y2) {  // 좌표 설정 
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public int square() {
		area = (x2-x1) * (y2-y1);
		return area;
	}
	
	public void show() {
		System.out.printf("좌표 : (%d, %d) (%d, %d)\n", x1, y1, x2, y2);
		System.out.println("넓이 : " + area);
	}
}
