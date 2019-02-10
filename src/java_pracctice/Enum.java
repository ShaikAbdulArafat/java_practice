package java_pracctice;

import java.util.Enumeration;
import java.util.Vector;

public class Enum {

		public static void main(String args[]) {
			Enumeration days;
			Vector dayNames = new Vector();
			Vector year=new Vector();
			dayNames.add("Sunday");
			dayNames.add("Monday");
			dayNames.add("Tuesday");
			dayNames.add("Wednesday");
			dayNames.add("Thursday");
			dayNames.add("Friday");
			dayNames.add("Saturday");
			year.add("january");
			year.add("febraury");
			year.add("march");
			year.addElement(year);
			days = dayNames.elements();
			System.out.println("*********days are going to print*******");
		while (days.hasMoreElements()){
			System.out.println(days.nextElement());
			}
		/*days=year.elements();
		System.out.println("******years are going to print******");
		while(days.hasMoreElements()){
			System.out.println(days.nextElement());
		}*/
		}
}

