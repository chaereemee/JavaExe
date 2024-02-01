package ch09.resolve07;

public class ArrayUtility {
    // int 배열을 double 배열로 변환하는 메소드 
    public static double[] intToDouble(int[] source) {
        double[] result = new double[source.length];
        for (int i = 0; i < source.length; i++) {
        	result[i] = source[i];
        }
        return result;
    }
    
    // double 배열을 int 배열로 변환하는 메소드 
    public static int[] doubleToInt(double[] source) {
        int[] result = new int[source.length];
        for (int i = 0; i < source.length; i++) {
        	result[i] = (int) source[i];
        }
        return result;
    }
}
