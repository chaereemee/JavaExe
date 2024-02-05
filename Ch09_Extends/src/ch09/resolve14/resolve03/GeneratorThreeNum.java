package ch09.resolve14.resolve03;

// 난수 3개를 생성하는 역할 

public class GeneratorThreeNum {
	private int[] randomNums = new int[3];
	
	public int[] generate() {
		for(int i=0; i<3; i++) {
			randomNums[i] = (int)(Math.random()*10);
		}
		return randomNums;
	}
}
