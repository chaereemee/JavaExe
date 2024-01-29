package ch05.array08;

import java.util.Arrays;

public class Resolve4 {

	public static void main(String[] args) {
		int[] numbers = { 87, 39, 29, 334, 1 };
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers.length-1; j++) {
				if(numbers[j] > numbers[j+1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(numbers));
	}

}
