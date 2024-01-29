package ch05.array08;

import java.util.Arrays;

public class Resolve3 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int[] temp = new int[5];
		
		int[] arr1 = new int[5];
		for(int i=arr.length-1; i>=0; i--) {
			arr1[i] = arr[arr.length-i-1];
		}
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr1[i];
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
