package ch09.resolve07;

public class ArrayUtility2 {
    public static int[] concat(int[] s1, int[] s2) {
        int[] result = new int[s1.length + s2.length];
        for (int i = 0; i < s1.length; i++) {
            result[i] = s1[i];
        }
        for (int i = 0; i < s2.length; i++) {
            result[s1.length + i] = s2[i];
        }
        return result;
    }
    
    public static int[] remove(int[] s1, int[] s2) {
    	int[] toRemove = new int[s1.length];
    	return toRemove;
    }
}
