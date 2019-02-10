package pattern.symbol;

public class Pattern9 {

	/*
	 * to print ZXYWVU...CBA 
	 * 			ZXYWVU...CBA 
	 * 			ZXYWVU...CBA 
	 * 			ZXYWVU...CBA 
	 * 			.....
	 * 			ZXYWVU...CBA
	 */
	public static void main(String[] args) {
		for (char i = 'Z'; i >= 'A'; i--) {
			for (char j = 'Z'; j >= 'A'; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}
}
