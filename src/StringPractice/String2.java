package StringPractice;

import java.util.Scanner;

public class String2 {
public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        //System.out.println("A".equals("B"));
        System.out.println("No");
        A=A.replace("h","H");
        B=B.replace("j","J");
        System.out.println(A+" "+B);
        
	        
        

}
}