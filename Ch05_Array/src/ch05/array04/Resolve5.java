package ch05.array04;

import java.util.Arrays;
import java.util.Scanner;

public class Resolve5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int total = 0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("값 입력 >> ");
			arr[i] = sc.nextInt();
			total += arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("총 : " + total);
		
		sc.close();
	}

}
