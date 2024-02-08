package ch13.sec01;

public class GenericExample {
	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		/*
		 * 위 코드 처럼 작성하면 컴파일러는 자동으로 클래스르 정의한다.
		 * class Box_String {
		 * 	public String content;
		 * }
		 */
		box1.content = "안녕하세요";
		String str = box1.content;
		System.out.println(str);
		
		Box<Integer> box2 = new Box<>();
		box2.content = 100;
		int value = box2.content;  // Boxing : Heap -> Stack
		System.out.println(value); // UnBoxing : Stack -> Heap
	}
}
