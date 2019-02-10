package java_pracctice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Frame_work1 {

	public static void main(String[] args) {
			List a1 = new ArrayList();
			a1.add("Zara");
			a1.add("Mahnaz");
			a1.add("Ayan");
			System.out.println(" ArrayList Elements");
			System.out.println("\t" + a1);
		
			
			Map m1 = new HashMap();
			m1.put("Zara", "8");
			m1.put("Mahnaz", "31");
			m1.put("Ayan", "12");
			m1.put("Daisy", "14");
			System.out.println();
			System.out.println(" Map Elements");
			System.out.print("\t" + m1);
		
		
			
			HashMap hm = new HashMap();
			// Put elements to the map
			hm.put("Zara", new Double(3434.34));
			hm.put("Mahnaz", new Double(123.22));
			hm.put("Ayan", new Double(1378.00));
			hm.put("Daisy", new Double(99.22));
			hm.put("Qadir", new Double(-19.08));
			
			
			//Get individual entry
			System.out.println(hm.get("Zara"));

			
			// Get a set of the entries
			Set set = hm.entrySet();
			// Get an iterator
			Iterator i = set.iterator();
			// Display elements
			while(i.hasNext()) {
			Map.Entry me = (Map.Entry)i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
			}
			System.out.println();
			// Deposit 1000 into Zara's account
			double balance = ((Double)hm.get("Zara")).doubleValue();
			hm.put("Zara", new Double(balance + 1000));
			System.out.println("Zara's new balance: " +	hm.get("Zara"));
			
			
			
		
		/*int count[] = {34, 22,10,60,30,22};
		Set<Integer> set = new HashSet<Integer>();
		try{
		for(int i = 0; i<5; i++){
		set.add(count[i]);
		}
		System.out.println(set);
		}
		catch(Exception e){}*/
	}

}
