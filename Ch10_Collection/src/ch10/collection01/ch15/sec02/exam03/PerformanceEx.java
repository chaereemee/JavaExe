package ch10.collection01.ch15.sec02.exam03;

public class PerformanceEx {

	public static void main(String[] args) {
		
		long cnt = 0;
		long result = 1;
		long sum = 0;
		
		for(int i=0; i<32; i++) {
			for(int j=0; j<cnt; j++) {
				result *= 2;
			}
			sum += result;
			cnt++;
		}
		System.out.println("트리 최대 32 검색할 수 있는 최대 수는 " + sum + "입니다.");
	}

}
