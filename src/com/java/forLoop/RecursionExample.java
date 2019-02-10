package com.java.forLoop;

import java.util.Scanner;

public abstract  class RecursionExample {

	static long n=0;
	public static int factorial(long a){
		return (int) ((a==0 |a==1) ? 1 : (a*factorial(a-1)));
	}
	
	/*public static void main(String[] args) {
		do{
		Scanner s= new Scanner(System.in);
		System.out.println("enter a value which is non zero");
		n= s.nextInt();
		System.out.println("enter 0 to quit");
		System.out.println("factorial of value is:"+factorial(n));
		}
		
		while(n!=0);{
			System.out.println("factorial of value is:"+factorial(n));
		}
	}*/
	public static void main(String[] args) {
		int i=5;
		i= i++ ;
		System.out.println("i value is :"+ i);
	}
	 abstract void run();
}

class Helper extends RecursionExample{

	@Override
	void run() {
System.out.println("Run as fast as you can");		
	}
	
}
