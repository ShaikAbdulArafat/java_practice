package collections;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Treemap_1 {
public static void main(String[] args) {
	TreeMap<Integer, String> tm=new TreeMap<Integer,String>((a,b)->{return a>b?1:-1;});
	tm.put(1, "arafat");
	tm.put(2, "arif");
	tm.put(7, "sajida");
	tm.put(8, "farheen");
	tm.put(3, "asalam");
	tm.put(4, "shahistha");
	tm.put(5, "naziya");
	tm.put(6, "badar");
	System.out.println(tm.lowerEntry(6));
	System.out.println(tm.get(4));
	Set<Integer> s= tm.keySet();
	for(int a:s)
		System.out.println(a+"-->"+tm.get(a));
	Set<Entry<Integer, String>>	s1=tm.entrySet();
	for(Entry<Integer, String> s11:s1)
		System.out.println(s11.getKey()+"-->"+s11.getValue());
	System.out.println(tm.descendingMap());
	System.out.println(tm.descendingKeySet());
}
}
