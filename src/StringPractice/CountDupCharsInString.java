package StringPractice;

public class CountDupCharsInString {
	public static void main(String[] args) {
		CountDupCharsInString cdcis = new CountDupCharsInString();
		cdcis.countCharOccurances("Hello World");
	}
	
public void countCharOccurances(String str) {
		
		if (str != null && !str.isBlank()) {
			int len_str = str.length();
			
			char first_char  = str.charAt(0);
			
			for(int i =0;i<len_str;i++) {
				int count = 0;
				for(int j=0;j<len_str;j++) {
				if(str.charAt(i) == str.charAt(j)) {
					count = count+1;
				}}
				if(i>0 && !str.substring(0, i).contains(str.substring(i, i+1))) {
					System.out.println("for the character '"+str.charAt(i)+"' count = "+count);
				}else if (i==0) {
					System.out.println("for the character '"+str.charAt(i)+"' count = "+count);
				}
				}
			}
		
			else {
				System.out.println("Please provide input String...");
			}
	}

}
