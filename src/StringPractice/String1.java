package StringPractice;

import java.util.Scanner;

///////////////////////string reverse

public class String1 {
public static void main(String args[]){

	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a message");
	String s=sc.nextLine();
	String result="";
	System.out.println(s);
	System.out.println(s.indexOf(" "));
	//System.out.println(s.length());
	//System.out.println(s.charAt(1));
	
	/// with while loop
	
	int j=0;
	while(j<s.length()){
		result = s.charAt(j)+result;
	j++;
	}
	System.out.println(result);
	
	////  with for loop 
	
	/*for(int i=0;i<s.length();i++){
	result=s.charAt(i)+result;
	}
System.out.println(result);

		// or other method

	String s1="arafat";
	String r="";

	for (int i=0;i<=s1.length()-1;i++)
	r=s.charAt(i)+r;
	System.out.println(r);*/
	
}
	
	
}
