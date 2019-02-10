package pattern.symbol;

public class Pattern27 {
/*
    A
   BB
  CCC
 DDDD
EEEEE

*/	
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = n-1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print((char) (64 + i));
			}
			System.out.println();
		}
	}

}
