package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_1 {
public static void main(String[] args) {
	Set<Integer> se=new HashSet<>();
	se.add(3551);
	se.add(4665);
	se.add(543);
	se.add(435);
	se.add(222);
	se.add(435);
	System.out.println(se);
	System.out.println("size of hashset is  :"+se.size());
	System.out.println(se.isEmpty());
	System.out.println(se.contains(435));
	se.remove(435);
	
	System.out.println("siz"
			+ "e of hashset is  :"+se.size());
	System.out.println(se);
	System.out.println("....iterating the hashset....");
	Iterator<Integer> it= se.iterator();
	while(it.hasNext())
		System.out.println(it.next());
	System.out.println("---iterating with foreach---");
	se.forEach(a->System.out.println(a));
	/*for (Integer i : se) {
		System.out.println(i);
	}*/
	
	Set<Integer> se1=new HashSet<>();
	se1.add(355);
	se1.add(465);
	se1.add(543);
	System.out.println(se1);
	System.out.println("....copying hash set values to other hashset...");
	se.addAll(se1);
	System.out.println(se);
	System.out.println("size of hashset 'se' is :"+se.size());
	System.out.println("...copying of hashset values to array...");
	Integer [] a= new Integer[se.size()];
	se.toArray(a);
	for(Integer aa:a)
		System.out.println(aa);
	System.out.println("size of array 'a' is  :"+a.length);
	
	System.out.println("....comparing to hashsets....");
	se.retainAll(se1);
	System.out.println(se);
}
}
