package sample;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sampleTest {
	
	public static void main(String[] args) {
		sampleTest s = new sampleTest();
		s.getSmall_N_Big_Words("try to get the smallest and biggest word out this String");
	}

	public void getSmall_N_Big_Words(String str) {	
	String [] splitted_str = str.split(" ");
	int size_splt_str = Array.getLength(splitted_str);
	Arrays.sort(splitted_str);
	System.out.println("Biggest Word is : "+ splitted_str[0]);
	System.out.println("Smallest Word is : "+ splitted_str[size_splt_str-1]);
}
}















