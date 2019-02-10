package pattern.symbol;

public class pattern4 {

	/*
	 * to print AAAAA 
	 * 			BBBBB 
	 * 			CCCCC 
	 * 			DDDDD 
	 * 			EEEEE
	 */
	public static void main(String[] args) {
			for(char i='A';i<='Z';i++){
				for(char j='A';j<='Z';j++){
					System.out.print(i);
				}
				System.out.println();
			}
	}

}
