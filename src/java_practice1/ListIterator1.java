package java_practice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ListIterator1 {
	 static List<Integer> li;
	
public static void main(String[] args) {
	 li=new ArrayList<>();
	ListIterator<Integer> lit=null;
	li.add(456);
	li.add(466);
	li.add(463);
	li.add(124);
	li.add(6432);
	li.forEach(a->System.out.println(a));
	System.out.println("///////array lsit basic operations//////");
	System.out.println("value at index of 2 is by geting method  :"+li.get(2));
	System.out.println(" index of vlue 124 is  :"+li.indexOf(124));
	System.out.println("is the array empty  ?  "+ li.isEmpty());
	System.out.println("size of the array is :"+li.size());
	System.out.println("======");
	lit=li.listIterator();
	while(lit.hasNext()){
		System.out.println(lit.next());
			}
	System.out.println("=====");
	while(lit.hasPrevious()){
		lit.add(123);
		System.out.print(lit.previous());
		System.out.print(lit.previous());
			}
	System.out.println("========");
	System.out.println(li);
	System.out.println("========coping/clonig of arary list");
	List<Integer> li1= (List<Integer>) ((ArrayList<Integer>) li).clone();
	System.out.println(li1);
	System.out.println("==coping arraylist to array[]////");
	System.out.println("...first create araay of the sie of arraylist...");
	Integer arr[]=new Integer [li.size()];
	li.toArray(arr);
	for(Integer a:arr)
		System.out.print(a);
	System.out.println("......sorting of arrayList......");
	Collections.sort(li,(a,b)->{return b>a?1:-1;});
	System.out.println(li);
	System.out.println("==again changing the order of sorting==");
	Collections.reverse(li);
	System.out.println(li);
	System.out.println("after swaping index 1 and 5 of arraylist");
	Collections.swap(li, 1, 5);
	System.out.println(li);
	System.out.println("===after shufflling the arraylist ===");
	Collections.shuffle(li);
	System.out.println(li);

	}
}
