package ch05.array01;

import java.util.Scanner;

public class NeedToArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 학생 수가 만약 3명이 아니라 전교, 전국 학생이라면
		 * 아래처럼 변수를 선언하는 것은 불가능하다.
		 * 그래서 새로운 문법이 필요해서 만들어진다.
		 * kor1, kor2, kor3의 공통점은
		 * 3개 모두 int 자료형, kor 이라는 이름
		 * 그리고 뒤에 붙은 숫자를 나타낸다는 것이다.
		 */
		
		// 3명의 국어점수 입력
		System.out.print("1번째 학생 국어점수 입력 >> ");
		int kor1 = sc.nextInt();
		System.out.print("2번째 학생 국어점수 입력 >> ");
		int kor2 = sc.nextInt();
		System.out.print("3번째 학생 국어점수 입력 >> ");
		int kor3 = sc.nextInt();
		
		int total = kor1 + kor2 + kor3;
		double avg = (double)total / 3;
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		System.out.printf("평균 : %.2f\n", avg);
	}

}
