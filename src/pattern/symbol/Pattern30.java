package pattern.symbol;

public class Pattern30 {

/*	55555
	 4444
	  333
	   22
	    1

*/	
	public static void main(String[] args) {
		int n = 5;	
		int m = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= m; k++) {
				System.out.print(m);
			}
			m--;
			System.out.println();
		}
	}

}
