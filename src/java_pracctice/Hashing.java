package java_pracctice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashing {
public static void main(String []args){
	
	HashMap	hm= new HashMap<>();
	hm.put("arafat", "95427");
	hm.put("arif", "4526");
	hm.put("asalam", "5461");
	
	// to print the single entry...
	System.out.println(hm.get("arafat"));
	

	
	// to get all entries.....
	// first make all entries as a set with "entrySet()"
	Set hmset= hm.entrySet();
	
	
	// then initialize the iterator
	Iterator i = hmset.iterator();
	
	//then display values using while loop(if using iterator only)
		
	while(i.hasNext()){
		Map.Entry data = (Map.Entry)i.next();
		
		System.out.println(data.getKey() +":::"+ data.getValue());
	}
}
}
