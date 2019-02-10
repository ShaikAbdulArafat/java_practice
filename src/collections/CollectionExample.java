package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CollectionExample {

	public static void main(String[] args) {
		Collection<String> collection1 = new ArrayList<String>();
		Collection<String> collection2 = new ArrayList<String>();
		
		Collection<Student> student = new ArrayList<>();
		
		Predicate<String> prediate = p -> p.length()==10;
		Consumer<String> consumer = a -> a.isEmpty();
		
		FunctInterface fi;
		fi = (a,b) -> (int)Math.random() *b;
		String b1="hi";
		FunctInterface fi1 = (a,b) -> {
			a=b1;
//			b1="hl";
			return b;
		};
		student.add(new Student("arafat",2));
		student.add(new Student("shaik",3));
		student.add(new Student("anji",4));
		student.add(new Student("abdul",5));
		student.forEach(a->System.out.println(a));
		student.forEach((a)->System.out.println(a.getStudentId()+a.getStudentName()));
		
		collection1.add("english");
		collection1.add("telugu");
		collection1.add("tamil");
		collection1.add("telugu");
//		collection1.add(null);
	
//		System.out.println(collection1.remove("telugu"));
		System.out.println("Collection 1 consists of :" + collection1);
		
		collection2.add("urdu");
		collection2.add("arabic");
		collection2.add("hindi");
//		collection2.add(null);
		collection2.add(" ");
		collection2.add("english");

		System.out.println("Collection 1 is " + collection1);
		System.out.println("Collection 2 is :" + collection2);
		System.out.println("Does the Collection 2 contians all Collection 1 elements?  :"+collection2.containsAll(collection1));
		collection1.add(String.join("_", collection1));
		System.out.println(collection1);
		
		collection1.forEach(System.out::println);
		collection1.stream();
		
		collection1.forEach(System.out::println);
		
		collection2.removeIf(a->a.length()<=3);
		collection1.removeIf(a->a.isEmpty());
		collection2.forEach((a)->System.out.println(a.toString()));
	}
}
