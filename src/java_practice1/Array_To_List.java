package java_practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Array_To_List {
public static void main(String[] args) {
	
	
	String [] name={"arafat","shaik","arif","asalam","abd","adsfa","gdfgf"};
	List<String> names= Arrays.asList(name);
	System.out.println(names);
	//names.add("shaik");   // this will give an error.because array working as list(not converted to array lsit)
	System.out.println(names);
	
	
	for(String nam:names)
	System.out.println(nam);
	
	
	List<String> ids=new ArrayList<>(Arrays.asList(name));
	System.out.println(ids);
	ids.add("arafat1");			 // see here array converted to arraylsit. so addition is working.
	ids.add("arif1");
	ids.add("asalam1");
	ids.add("hello");
	System.out.println(ids);
	System.out.println("=============");
	ids.forEach(id->System.out.println(id));
	
	System.out.println("===========");
	
	Arrays.sort(name,new Comparator<String>() {

		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return o1.compareTo(o2);
		}
	});
	for(String na:name)
	System.out.println(na);
	System.out.println("============");
	String [] name1={"arafat","arif","asalam"};
	List<String> name2=Arrays.stream(name1).collect(Collectors.<String>toList());
	System.out.println(name2);
	name2.add("selenium");
	System.out.println(name2);
	System.out.println("size 0f array name=:"+name.length);
	System.out.println("sie of converted array name as names =:"+ids.size());
	System.out.println("size of array name1=:"+name1.length);
	System.out.println("size of converd array as arraylist =:"+name2.size());
}
}
