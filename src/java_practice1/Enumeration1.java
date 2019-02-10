package java_practice1;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration1 {
public static void main(String[] args) {
	Vector<Integer> v=new Vector<>();
	v.add(35654);
	v.addElement(56);
	v.add(445);
	v.add(444554);
	System.out.println(v);
	v.forEach(a->System.out.println(a));
	Enumeration<Integer> e=v.elements();
	while(e.hasMoreElements()){
		System.out.println(e.nextElement());
	}
}
}
