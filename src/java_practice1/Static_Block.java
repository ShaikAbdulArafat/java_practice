package java_practice1;

import java.util.ArrayList;
import java.util.List;

public class Static_Block {

	
	 static List<String> list;
	static{
		list=new ArrayList();
		list.add("arif");
		list.add("arafat");
		list.add("asalam");
		
	}
	
	public void test(){
		System.out.println(list);
	}
	public static void main(String[] args) {
		Static_Block obj=new Static_Block();
		obj.test();

	}

}
