package java_practice1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator1 {
public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("df");
	list.add("sfa");
	list.add("dfa");
	System.out.println(list);
	Iterator<String> it= list.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
			}
	Iterator<String> it1= list.iterator();
	while(it1.hasNext()){
	if("sfa".equals(it1.next()))
		it1.remove();
	}
	list.forEach(a->System.out.println(a));
}
}
