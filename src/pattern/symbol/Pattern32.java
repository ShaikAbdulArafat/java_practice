package pattern.symbol;
/*
EEEEE
DDDD
 CCC
  BB
   A
*/
public class Pattern32 {
	public static void main(String[] args) {
		/*int n = 5;
		for (int i = n; i >= 1; i--) {
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print((char)(64+i));
			}
			System.out.println();
		}*/
		
		//Or
		
		int n=5;
		int m=5;
		for(int i = 1;i <= n;i ++){
			for(int j = 1 ;j <= i-1  ; j++){
				System.out.print(" ");
			}
			for(int k = 1;k <= m ; k++){
				System.out.print((char)(64+m));
			}
			m--;
			System.out.println();
		}
		
	}
}
