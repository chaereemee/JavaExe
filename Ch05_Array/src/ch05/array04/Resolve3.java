package ch05.array04;

import java.util.Scanner;

public class Resolve3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] grade = new int[7];
		int total = 0;
		
		for(int i=0; i<grade.length; i++) {
			System.out.print((i+1) + "번째 학생의 학점 입력 >> ");
			grade[i] = sc.nextInt();
			total += grade[i];
		}
		
		double avg = total / grade.length;
		
		System.out.println(grade.length + "명의 학생들의 총점 : " + total + " , 평균 : " + avg);
		
		sc.close();
	}

}
