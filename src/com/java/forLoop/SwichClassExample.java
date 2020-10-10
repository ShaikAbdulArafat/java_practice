package com.java.forLoop;

public class SwichClassExample {

	public static void getName(int value) {
		switch (value) {
		case 0:
			System.out.println("zero");
		case 1:
			System.out.println("One");
		case 2:
			System.out.println("two");
//			break;

//		default:
			System.out.println("not handled");;
		}
	}
	public static void main(String[] args) {
		getName(0);
	}
}
