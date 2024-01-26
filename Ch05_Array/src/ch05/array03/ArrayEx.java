package ch05.array03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		int[] kor = { 98, 99, 89 };
		System.out.println("배열의 크기: " + kor.length);
		
		int[] mat = { 100, 80, 78, 68, 90 };
		System.out.println("배열의 크기: " + mat.length);
		
		int[] eng = { 100, 80, 78, 68 };
		System.out.println("배열의 크기: " + eng.length);
		
		System.out.println(Arrays.toString(kor));
		System.out.println(Arrays.toString(mat));
		System.out.println(Arrays.toString(eng));
		System.out.println();
		
		for(int i=0; i<kor.length; i++) {
			System.out.print(kor[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<mat.length; i++) {
			System.out.print(mat[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<eng.length; i++) {
			System.out.print(eng[i] + " ");
		}
		System.out.println();
	}

}
