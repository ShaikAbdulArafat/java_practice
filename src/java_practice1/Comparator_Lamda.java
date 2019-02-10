package java_practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator_Lamda {
public static void main(String[] args) {
	
	String [] names={"mohan","lakshmi","suuresh","mahesh","gopal","nithin","swami"};
	List<String> name= new ArrayList<String>(Arrays.asList(names));
	System.out.println(name);
	System.out.println("========");
	name.forEach(nam->System.out.println(nam));
	System.out.println("========");
	
	Collections.sort(name);
	System.out.println(name);
	
	Comparator<String> com= new Comparator<String>() {
		@Override
		public int compare(String o1, String o2) {
			return o2.compareTo(o1);
		}
	};
	Arrays.sort(names, com);
	
	//			or			/// by using anonymous class
	
	Arrays.sort(names, new Comparator<String>() {
		@Override
		public int compare(String o1, String o2) {
			return o1.compareTo(o2);
		}
	});
	
	//// 		or 			//by using lambda expression
	
	Arrays.sort(names, (a,b)-> {return(b.compareTo(a));});
	
	for(String s:names)
	System.out.println(s);
	
	System.out.println(Integer.MIN_VALUE+"==="+Integer.MAX_VALUE);
	System.out.println(Long.MIN_VALUE+"==="+Long.MAX_VALUE);
	System.out.println(Short.MIN_VALUE+"==="+Short.MAX_VALUE);
	System.out.println(Byte.MIN_VALUE+"==="+Byte.MAX_VALUE);
}
}
