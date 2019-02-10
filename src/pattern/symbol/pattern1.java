package pattern.symbol;

public class pattern1 {

	/*
	 * to print ***** 
	 * 			***** 
	 * 			***** 
	 * 			***** 
	 * 			*****
	 */
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//Or //OR
	
	public pattern1(){
		for(int i=5;i>=1;i--){
			for(int j=5;j>=1;j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
