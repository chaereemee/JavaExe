package ch09.resolve07;

public class Triangle {
	private int base;
	private int height;

	// 생성과 동시에 초기화가 가능한 생성자 
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	
	// 밑변과 높이 정보를 변경시킬 수 있는 메소드 
	public void setTriangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	
	// 삼각형의 넓이를 계산해서 반환하는 메소드
	public double area() {
		double area = ((double)base * height) / 2;
		return area;
	}
	
	
}
