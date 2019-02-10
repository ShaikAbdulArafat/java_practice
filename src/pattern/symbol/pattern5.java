package pattern.symbol;

public abstract class pattern5 {

	/*
	 * to print ABCDE 
	 * 			ABCDE 
	 * 			ABCDE 
	 * 			ABCDE 
	 * 			ABCDE
	 */
	public static void main(String[] args) {
		for (char i = 'A'; i <= 'Z'; i++) {
			for (char j = 'A'; j <= 'Z'; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
