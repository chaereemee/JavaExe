package ch04.primitive;

public class PremitiveTypeEx {

	public static void main(String[] args) {
		byte b = 10;
		char ch = 'A';
		short s = 10000;
		int i = 99999999;
		long l = 9999999999999999l;
		float f = 3.14f;
		double d = 3.14;
		
		System.out.printf("byte size : %d bit\n", Byte.SIZE);
		System.out.printf("char size : %d bit\n", Character.SIZE);
		System.out.printf("short size : %d bit\n", Short.SIZE);
		System.out.printf("int size : %d bit\n", Integer.SIZE);
		System.out.printf("long size : %d bit\n", Long.SIZE);
		System.out.printf("float size : %d bit\n", Float.SIZE);
		System.out.printf("double size : %d bit\n", Double.SIZE);
	}

}
