package pattern.symbol;

public class Pattern8 {

	/*
	 * to print ZZZZZ 
	 * 			YYYYY 
	 * 			XXXXX 
	 * 			WWWWW 
	 * 			.....
	 * 			AAAAA
	 */
	public static void main(String[] args) {
		for (char i = 'Z'; i >= 'A'; i--) {
			for (char j = 'Z'; j >= 'A'; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
