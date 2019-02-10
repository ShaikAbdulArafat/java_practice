package java_practice1;

import java.util.Arrays;

public class Chararray_Binary_search {
	
	public static void main(String[] args) {
		char [] name={'h','b','z','d','e','f'};
		int index=Arrays.binarySearch(name, 'e');
		System.out.println("'e'is present at index of  :"+index);
		System.out.println("size of array name=:  "+name.length);
		System.out.println("----------------");
		char[] names= Arrays.copyOf(name, 15);
		System.out.println("size of modified array names:  "+names.length);
		Arrays.fill(names, 14, 15, 'f');;
		for(char nam:names)
			System.out.println(nam);
		System.out.println("---------------");
		
		char[] names1=Arrays.copyOfRange(name, 0, 3);
		System.out.println(names1);
		System.out.println("-----------------1");
		
		System.out.println(Arrays.equals(name, name));
		System.out.println(Arrays.equals(name, names));
		
		System.out.println("--------------");
	
		Arrays.sort(name);
		System.out.println(name);
		System.out.println("=========");
		
		
	}
} 	
