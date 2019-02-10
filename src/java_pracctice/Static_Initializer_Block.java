package java_pracctice;

import java.util.Scanner;

public class Static_Initializer_Block {
	static int B,H;
	
	
	public static void prarllogram(){
		
		Scanner s= new Scanner(System.in);
		B=s.nextInt();
		H=s.nextInt();
		if((B>=-2147483648 && B<=0)||(H>-2147483648 && B<=0))
			System.out.println("Given input is not Int");
		}
	public static void main(String[] args) {
			Static_Initializer_Block.prarllogram();
			int area=B*H;
			System.out.println(area);
	}
}
