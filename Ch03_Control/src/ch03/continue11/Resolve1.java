// 3번

package ch03.continue11;

public class Resolve1 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i % 3 != 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("1~100 사이의 3의 배수의 총합 : " + sum);

	}

}
