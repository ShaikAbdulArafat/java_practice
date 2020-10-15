package sample;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import java_pracctice.Arraylist;

public class sampleTest {
	
	public static void main(String[] args) {
		sampleTest s = new sampleTest();
		s.maxOccuringCharInString("HelloWorldAmStartedCodingInBothJavaAndPython");
		
	}

		public void maxOccuringCharInString(String str) {
		int len_str = str.length();
		Map< Integer ,Character> map = new HashMap<>(); 

		for(int i =0;i<len_str;i++) {
			int count = 0;
			for(int j=0;j<len_str;j++) {
				if(str.charAt(i) == str.charAt(j)) {
					count += 1;
				}
			}
			map.put(count, str.charAt(i));
			if(i == 0) {
				System.out.println("The character '"+ str.charAt(i) +"' is repeated for : " +count +" times");
				
			}else if (i>0 && !str.substring(0, i).contains(str.substring(i, i+1))) {
				System.out.println("The character '"+ str.charAt(i) +"' is repeated for : " +count +" times");
			}
		}
		System.out.println(map);
		System.out.println("The character that occred maximun times is :'"+map.get(Collections.max(map.keySet()))+"' It iterated for : '"+Collections.max(map.keySet()) +"' times");
		System.out.println("The character that occred minimum times is :'"+map.get(Collections.min(map.keySet()))+"' It iterated for : '"+Collections.min(map.keySet()) +"' times");
		}
		
		//https://www.java67.com/2018/04/21-string-programming-and-coding-interview-questions-answers.html
		//https://www.geeksforgeeks.org/finding-minimum-and-maximum-element-of-a-collection-in-java/
}















