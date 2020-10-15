package StringPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringSplitFilter {

	public static void main(String[] args) {
		String given_string = "my name is Arafat";
		String[] words_in_given_string = given_string.split(" ");
		int len_given_word = Array.getLength(words_in_given_string);
		
		int small_word_size = words_in_given_string[0].length();
		int big_word_size = words_in_given_string[0].length();
		
		String small_word = words_in_given_string[0];
		String Big_word = words_in_given_string[0];
		
		if(len_given_word == 0) {
			System.out.println("There are no words in the given String");
			System.exit(0);
		}
		
		for (int i=0 ; i<len_given_word ;i++) {
			if(small_word_size > words_in_given_string[i].length()) {
				small_word = words_in_given_string[i];
				small_word_size = words_in_given_string[i].length();
				}
			if(big_word_size < words_in_given_string[i].length()) {
				big_word_size = words_in_given_string[i].length();
				Big_word = words_in_given_string[i];
			}
		}
		System.out.println("Smallest words is : "+ small_word);
		System.out.println("Biggest word is : " + Big_word);
	}
	
	//4 line code to find biggest and smallest words of given Statement
	
	public void getSmall_N_Big_Words(String str) {	
		String [] splitted_str = str.split(" ");
		int size_splt_str = Array.getLength(splitted_str);
		Arrays.sort(splitted_str);
		System.out.println("Biggest Word is : "+ splitted_str[0]);
		System.out.println("Smallest Word is : "+ splitted_str[size_splt_str-1]);
	}
}
