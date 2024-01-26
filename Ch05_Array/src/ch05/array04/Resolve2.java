package ch05.array04;

public class Resolve2 {
	public static void main(String[] args) {
		String[] names = {
				"이름1", "이름2", "이름3", "이름4", "이름5",
				"이름6", "이름7", "이름8", "이름9", "이름10"
		};
		
		for(int i=names.length-1; i>=0; i--) {
			System.out.print(names[i] + " ");
		}
	}

}
