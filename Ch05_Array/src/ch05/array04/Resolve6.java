package ch05.array04;

import java.util.Scanner;

public class Resolve6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] names = new String[5];
		int[] scores = new int[5];
		
		for(int i=0; i<names.length; i++) {
			System.out.print("학생의 이름과 점수를 입력 >> ");
			names[i] = sc.next();
			scores[i] = sc.nextInt();	
		}
		
		for(int i=0; i<scores.length; i++) {
			System.out.print(names[i] + " 학생의 학점은 ");
			if(scores[i] >= 90)
				System.out.println("A");
			else if(scores[i] >= 80)
				System.out.println("B");
			else if(scores[i] >= 70)
				System.out.println("C");
			else if(scores[i] >= 60)
				System.out.println("D");
			else if(scores[i] < 60)
				System.out.println("F");
		}

	}
}
