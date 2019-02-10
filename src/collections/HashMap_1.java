package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_1 {
public static void main(String[] args) {
	Map<Integer, String> hm=new HashMap<>();
	hm.put(1, "arafat");
	hm.put(2, "arif");
	hm.put(3, "asalam");
	hm.put(4, "shahistha");
	hm.put(5, "naziya");
	hm.put(6, "badar");
	System.out.println(hm);
	System.out.println("size of hashmap is  :"+hm.size());
	System.out.println("is the hamshmap empty ? :"+hm.isEmpty());
	System.out.println("what is the value of key 3 ? :"+hm.get(3));
	System.out.println("does hm contains the value arif: ?"+hm.containsValue("arif"));
	System.out.println("\n");
	System.out.println(".......iterating through iterator...");
	System.out.println("it is not posibble for hashtable  &  hashmap...");
	
	System.out.println("\n");
	System.out.println("////iterating using set key/////");
	Set<Integer> se=hm.keySet();
	for(Integer set:se)
		System.out.println(set+"-->"+hm.get(set));
	System.out.println("\n");
	System.out.println("...iterating using entry set.....");
	Set<Entry<Integer, String>> e=hm.entrySet();
	for(Entry<Integer, String> ee:e)
		System.out.println(ee.getKey()+"-->"+ee.getValue());
	
	System.out.println("\n");
	System.out.println("copying of hashmap to another hashmap");
	Map<Integer, String> hm1= new HashMap<>();
	hm1.put(2, "arif");
	hm1.put(7, "sajida");
	hm1.put(8, "farheen");
	
	System.out.println(hm1);
	hm.putAll(hm1);
	Set<Entry<Integer, String>> en=hm.entrySet();
	for(Entry<Integer, String> enn:en)
		System.out.println(enn.getKey()+"-->"+enn.getValue());
}
}
