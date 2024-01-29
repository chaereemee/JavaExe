// 정수 배열 5개를 할당하고 Arrays.sort를 사용하지 말고 최소값과 최대값을 얻으세요 

package ch05.array08;

public class Resolve2 {

	public static void main(String[] args) {
		int[] numbers = { 88, 14, 37, 100, 4 };
		
		int mixNum = numbers[0];
		for(int i=0; i<numbers.length; i++) {
			if(mixNum > numbers[i]) {
				mixNum = numbers[i];
			}
		}
		System.out.println("최소값 : " + mixNum);
		
		int maxNum = numbers[0];
		for(int i=0; i<numbers.length; i++) {
			if(maxNum < numbers[i]) {
				maxNum = numbers[i];
			}
		}
		System.out.println("최대값 : " + maxNum);
	}

}
