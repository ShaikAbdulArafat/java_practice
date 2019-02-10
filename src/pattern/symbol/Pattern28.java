package pattern.symbol;

public class Pattern28 {
/*
    A
   AB
  ABC
 ABCD
ABCDE

*/	
	public static void main(String[] args) {

		int n = 5;

		for (int i = 1; i <= n; i++) {
			for (int j = n - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i - 1; k++) {
				System.out.print((char) (65 + k));
			}
			System.out.println();
		}
	}

}
