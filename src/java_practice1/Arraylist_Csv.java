package java_practice1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Arraylist_Csv {
public static void main(String[] args) {
	LinkedList<String> name=new LinkedList<String>();
	ArrayList<String> names=new ArrayList<String>();

	name.add("arafat");
	name.add("asalam");
	name.add("mushaheda");
	name.add("farheen");
	name.add("naziya");
	name.add("shahistha");
	System.out.println(name);

	StringBuilder sb=new StringBuilder();
	for(String s:name){
		if(sb.length()!=0){
			sb.append(",");
			System.out.println(s);
		}
		sb.append(s);
				
	System.out.print(s);
	
	
	}
}
}
