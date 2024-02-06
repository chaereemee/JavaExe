package ch11.string01;

public class StringHashCode {
	public static void main(String[] args) {
		String str0 = "Hello, Java";
		String str1= "Hello, Java";
		String str2 = new String("Hello, Java");
		
		System.out.println(str0);
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str0.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
	}
}
