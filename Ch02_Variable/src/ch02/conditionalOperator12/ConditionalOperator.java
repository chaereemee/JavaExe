package ch02.conditionalOperator12;

import java.util.Scanner;

public class ConditionalOperator {

	public static void main(String[] args) {
		int num;
		String str;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0~100 사이의 숫자 입력 >> ");
		num = sc.nextInt();
		
		/*
		 * 조건 연산자를 사용하는 방법
		 * A ? B : C;
		 * 항목의 조건 ? true면 실행 " false면 실행 
		 */
		str = num >= 85 ? "상위권입니다." : "상위권에 미치지 못합니다.";
		
		/*
		조건문을 사용하는 방
		if(num >= 85)
			str = "상위권입니다.";
		else
			str = "상위권에 미치지 못합니다.";
		*/
		
		System.out.println(str);
		
		sc.close();
	}

}
