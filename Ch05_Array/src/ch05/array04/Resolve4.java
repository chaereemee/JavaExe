package ch05.array04;

public class Resolve4 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = 3 * (i+1);
		}
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
