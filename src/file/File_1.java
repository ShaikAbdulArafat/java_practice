package file;

import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class File_1 {
public static void main(String[] args) {
	File f=new File("D://testing//manual testing");
	String [] a=f.list(/*new FilenameFilter() {
			public boolean accept(File dir, String name) {
			if(name.toLowerCase().endsWith(".jpg"))
			return true;
		}
	}*/);
	System.out.println(f.toURI());
	System.out.println(a.length);
	List<String> l=Arrays.asList(a);
	//l.forEach(b->System.out.println(b));
	Iterator<String> i=l.iterator();
	while(i.hasNext()){
		String s=i.next();
		System.out.println(s);
		if(s.contains("Office Lens")){
			s.replaceFirst("Office Lens", "Manual Testing");
			System.out.println(s);
		}
				}
}
}
