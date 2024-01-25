package ch02.incDecOperator11;

public class IncDecOperator {

	public static void main(String[] args) {
		int num = 0;
		// num++과 ++num은 모두 num의 값을 1 증가시킨다.
		num++;
		System.out.println(num);
		++num;
		System.out.println(num);

		// 후위 증감연산자 : 다른 연산을 수행한 후에 피연산자의 값을 1 증가시킨다. 
		int result = num++;
		System.out.print("result = " + result);
		System.out.println("num = " + num);
		
		// 전위 증감연산자 : 피연산자의 값을 1 증가시킨다. 
		result = ++num;
		System.out.print("result = " + result);
		System.out.println("num = " + num);
		
		// 후위 : 다른 연산을 수행한 후에 피연산자의 값을 1 감소시킨다. 
		result = num--;
		System.out.print("result = " + result);
		System.out.println("num = " + num);
		
		// 전위 : 피연산자의 값을 1 감소시킨다. 
		result = --num;
		System.out.print("result = " + result);
		System.out.println("num = " + num);
	}

}
