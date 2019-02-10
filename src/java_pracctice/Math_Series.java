package java_pracctice;

import java.util.Scanner;

public class Math_Series {

	public static void main(String[] args) {

		Scanner scr= new Scanner(System.in);
		int a=scr.nextInt();
		int b=scr.nextInt();
		int n=scr.nextInt();
		int square=0;
		for(int i=0;i<n;i++){
			square=a+(square*b+b);
			
			System.out.print(square+" ");
		}
	}

}
