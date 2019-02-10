package com.java.forLoop;

import java.sql.Array;

public class ForLoop1 {
	public static void main(String[] args) {
		int i=0;
		
		String a[][] = {{"sun","mon","tue","wed","thu","fri","sat"},{"a","b","c","d","e","f","g"}};
		String b[] = {"sun","mon","tue","thu","fri","sat","sun"};
		
				
		for ( System.out.println(i); i < 10; i++) {
			System.out.println(i);
			
		}
		
		for (int j=0; j < a[0].length; j++) {
			for (int j2 = 0; j2 < a[1].length; j2++) {
				System.out.print(a[j][j2]+'\t');
			}
			System.out.println();
		}
		
		for (int j = 0; j < b.length; System.out.println()) {
			System.out.print(b[j]);
			j++;
		}
		
	}

}
