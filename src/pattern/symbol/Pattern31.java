package pattern.symbol;

public class Pattern31 {

/*	12345
	 1234
	  123
	   12
	    1

*/	
	public static void main(String[] args) {
		
		int n=5;
		 for(int i=n;i>=1;i--){
			 for(int j=n-1;j>=i;j--){
				 System.out.print(" ");
			 }
			 for(int k=1;k<=i;k++){
				 System.out.print(k);
			 }
			 System.out.println();
		 }
		
		 //Or
		 
		 
	/*	int n = 5;
		int m = 5;
		for (int i = 1; i <= n; i++) {
			{
				for (int j = 1; j <= i - 1; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= m; k++) {
					System.out.print(k);
				}
				m--;
				System.out.println();
			}
		}
	*/}

}
