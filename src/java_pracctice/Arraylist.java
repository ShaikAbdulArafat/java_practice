package java_pracctice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Arraylist {
public static void main(String [] args){
	Collection<String> a=new ArrayList<>();

	
	
	int b =7;
	int arafat=Integer.valueOf(b);
	System.out.println(arafat);
	
}
 public void a(){
	 Map map= new HashMap<>();
	 map.put(1, "dsfasdf");
	 map.put(2, "gagdfa");
	 map.put(3, "fdafd");
	 map.put(4, "fassa");
	 System.out.println(map);
	 
	 Set keys = map.keySet();
	 Iterator l = keys.iterator();
	 while(l.hasNext())
		 System.out.println(map.get(l.next()));
	 
	 
	 Map<Integer, String> map1= new Hashtable<>();
	 map1.put(4, "dfad");
	 map1.put(5, "fafadsfasfd");
	 map1.put(6, "afsddfa");
	 map1.put(7, "sdfasdf");
	 
	  Set<Entry<Integer, String>> ent = map1.entrySet();
	 Iterator it = ent.iterator();
	 
	 for(Map.Entry<Integer, String> e:ent)
		 System.out.println(e.getKey()+"--"+e.getValue());
 }
}

