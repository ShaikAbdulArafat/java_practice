package java_practice1;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTable1 {
public static void main(String[] args) {
	Hashtable<String, String> ht=new Hashtable<>();
	ht.put("arafat", "electronics");
	ht.put("arif", "Mca");
	ht.put("aslam", "mba");
	System.out.println(ht);
	System.out.println(ht.size());
	System.out.println(ht.isEmpty());
	System.out.println(ht.remove("arif"));
	System.out.println(ht);
	System.out.println(ht.size());
	System.out.println("....iterating a hashtable...");
	Set<String> keys=ht.keySet();
	for(String key:keys)
		System.out.println(key+"::"+ht.get(key));
	
	System.out.println("---creating another hashtable---");
	Map<String, String> ht1= new Hashtable<>();
	ht1.put("naziya", "mba");
	ht1.put("saida", "b.tech");
	ht1.put("karishma", "B.tech");
	ht1.put("shakira", "m.form");
	System.out.println(ht1);
	
	System.out.println("///---getting keys set from hashtable----///");
	Set<String> key=ht1.keySet();
	for(String key1:key)
		System.out.println(key1+"::"+ht1.get(key1));
	
	
	System.out.println("-----copying hashtable to another table-----");
	ht.putAll(ht1);
	Set<String> k=ht.keySet();
	for(String kk:k)
	System.out.println(kk+"::"+ht.get(kk));
	
	if(ht.containsKey("aslam"))
		System.out.println(ht.get("aslam"));
	if(ht.containsValue("mba"))
		System.out.println(ht.get("arafat"));
	System.out.println("///----getting entry set hashtable------///");
	Set<Entry<String, String>> entries=ht.entrySet();
	for(Entry<String, String> entry:entries){
		System.out.println(entry.getKey()+"--->"+entry.getValue());
		
	}
		Enumeration<String> kee=ht.keys();
		while(kee.hasMoreElements()){
			//System.out.println(kee.nextElement());
			String kees=kee.nextElement();
			System.out.println(kees+"-->"+ht.get(kees));
		}
		Enumeration<String> e=ht.keys();
		List<String> names = new ArrayList<>();
		while(e.hasMoreElements()){
			String s=e.nextElement();
			names.add(ht.get(s));
		}
		names.forEach(a->System.out.println(a));
	}
}
