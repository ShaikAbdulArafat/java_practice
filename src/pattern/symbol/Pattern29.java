package pattern.symbol;

public class Pattern29 {

/*	
	*****
	 ****
	  ***
	   **
	    *

    */
	public static void main(String[] args) {
		int n = 5;
		/*for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 5; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}*/
	
		//Or
		
		
		for(int i=n;i>=1;i--){
			for(int j=n-1;j>=i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	
	}
}
