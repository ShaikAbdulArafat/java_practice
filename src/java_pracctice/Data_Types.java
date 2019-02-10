package java_pracctice;

import java.util.Scanner;

public class Data_Types {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
			 int t=s.nextInt();
			 long s1=9223372036854775807L;

	        for(long i=0;i<t;i++)
	        {

	            try
	            {
	                Long x=new Long(s.nextLong());
	                System.out.println(x+" can be fitted in:");
		                if(x>=-128 && x<=127)System.out.println("* byte");
		                if(x>=-32768 && x<=32767)System.out.println("* short");
		                if(x>=-2147483648 && x<=2147483647)System.out.println("* int");
		                if(x>=-9223372036854775807L && x<=9223372036854775807L)System.out.println("*. long");
	                //Complete the code
	            }
	            catch(Exception e)
	            {
	                System.out.println(s.next()+" can't be fitted anywhere.");
	            }

	        }
		
	}

}
