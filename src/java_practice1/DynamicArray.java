package java_practice1;

public class DynamicArray {
	
	public static int calculate(int... values) {
		int sum = 0;
		for (int value : values) {
			sum += value;
		}
		return sum;
	}
	
	static boolean booleanTest(int value) {
		boolean result = value==0 ? false : true ;
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(calculate(10,1010,12,10));
		System.err.println(booleanTest(0));
	}
}
