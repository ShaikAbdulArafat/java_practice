package java_practice1;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vector1{
public static void main(String[] args) {
	Vector<Integer> v=new Vector<>();
	v.add(554);
	v.addElement(5654);
	v.add(4553);
	v.add(5463);
	v.forEach(a->System.out.println(a));
	System.out.println("First element of vector is  :"+v.firstElement());
	System.out.println("last elelment is  :"+ v.lastElement());
	v.add(2, 946545);
	System.out.println("modified vector is"+ v);
	System.out.println("element at 2nd index is  :"+v.get(2));
	System.out.println("does the vector is empty  ?  "+v.isEmpty());
	System.out.println("///reading vector using for each////1");
	v.forEach(a->System.out.println(a));
	System.out.println("///reading vector using iterator////2");
	Iterator<Integer> i=v.iterator();
	while(i.hasNext())
		System.out.println(i.next());
	System.out.println("///reading vector using enumarator///3");
	Enumeration<Integer> e= v.elements();
	while(e.hasMoreElements())
		System.out.println(e.nextElement());
	System.out.println("=====cpoying/cloning of vector=====");
	Vector<Integer> v1= (Vector<Integer>) v.clone();
	System.out.println("/////reading vector v1(cloned)/////");
	System.out.println(v1);
	}
}
