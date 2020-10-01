package StringPractice;

import java.lang.reflect.Array;

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
		System.out.println("smallest words is : "+ small_word);
		System.out.println("Biggest word is : " + Big_word);
	}
}
