package pattern.symbol;

public class pattern3 {

	/*
	 * to print 12345 
	 * 			12345 
	 * 			12345 
	 * 			12345 
	 * 			12345
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
