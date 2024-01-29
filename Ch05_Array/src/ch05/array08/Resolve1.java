// 정수 배열 5개를 할당하고 Arrays.sort를 활용해서 최소값과 최대값을 얻으세요

package ch05.array08;

import java.util.Arrays;

public class Resolve1 {

	public static void main(String[] args) {
		int[] numbers = { 94, 42, 87, 12, 66 };
		Arrays.sort(numbers);     // 정렬
		System.out.println("최소값 : " + numbers[0]);
		System.out.println("최대값 : " + numbers[numbers.length-1]);
	}

}
