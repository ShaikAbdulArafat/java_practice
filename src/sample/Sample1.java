package sample;


// i/p = a1b2c3 -> o/p = abbccc
// i/p = abc1def2ghi3  -> o/p = abcdefdefghighighi

public class Sample1{
	public static void main(String[] args) {
		String str = "abcd1";
		String first_str = "";
		
		while(!(latestIndexOfStr(str) == 0)) {
			int value_to_repeat = getRepeatValue(str);
			
			for(int i=1;i<=value_to_repeat;i++) {
				System.out.print(getFirstString(str));
			}
			str = first_str+str.substring(latestIndexOfStr(str+1));
		}

		
	}
	
	public static boolean isNumeric(char cha) {
		boolean result = false;
		if((cha == '0')||(cha == '1')||(cha == '2')||(cha == '3')||(cha == '4')||(cha == '5')||(cha == '6')||(cha == '7')||(cha == '8')||(cha == '9')) {
			result = true;
		}else {
			result = false;
		}
		return result;
	}
	
	public static int getRepeatValue(String str) {
		int start_result = 0;
		int end_result = 0;
		for(int i =0;i<str.length();i++) {
			if(isNumeric(str.charAt(i)) == true) {
				start_result = i;
				break;
			}
		}
		for(end_result = start_result;end_result<str.length();end_result++) {
			if(isNumeric(str.charAt(end_result))==false) {
				break;
			}
		}
		return Integer.parseInt(str.substring(start_result, end_result));
	}
	
	public static String getFirstString(String str) {
		String result = null;
		int start_index =0;
		for(int i =0;i<str.length();i++) {
			if(isNumeric(str.charAt(i))==true) {
				start_index = i;
				break;
			}
		}
		result = str.substring(0, start_index);
		return result;
	}

	public static int latestIndexOfStr(String str) {
		int result = 0;
		int start_index =0;
		int end_index=0;
		for(int i = 0;i<str.length();i++) {
			if(isNumeric(str.charAt(i))==true) {
				start_index =i;
				break;
			}
		}
		for(int i=start_index;i<str.length();i++) {
			if(isNumeric(str.charAt(i))==false);
			end_index = i+1;
			break;
		}
		result = end_index;
		return result;
	}
	
	
}