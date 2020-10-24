package StringPractice;

//i/p = India is great , in -> o/p = da s great

public class RmvDupChar {

	public static void main(String[] args) {
		System.out.println(removeDupChars("India is great", " "));
//		System.out.println(isCharIsIn('a', "star"));
	}
	
	public static String removeDupChars(String inStr,String ignoreStr) {
		String result= "";
		int instr_length = inStr.length();
		for(int i=0;i<instr_length;i++) {
				if(!isCharIsIn(inStr.charAt(i), ignoreStr)) {
					result = result+inStr.charAt(i);
				}
			}
				
		return result;
	}
	
	public static boolean isCharIsIn(char cha,String str) {
		boolean result = false;
		cha = Character.toLowerCase(cha);
		for(int i=0; i <str.length();i++) {
			if (cha == str.toLowerCase().charAt(i)) {
				result = true;
				break;
			}
		}
		return result;
	}

}
