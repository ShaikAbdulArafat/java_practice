package java_pracctice;

import java.io.File;

public class File_handling {
public static void main(String args[]){
	int i=0;
	File f= new File("D:\\testing\\unit 1_1");
		File[] li= f.listFiles();
	System.out.println(li.length);
	/*for ( i=0;i<li.length;i++){
		File name= new File(li[i].getName());
		System.out.println(name);*/
	
	/*for( File name: li)
		System.out.println(name);*/
	
	
	/*	name.renameTo(new File("D:\\testing\\unit 1_1\\"+i+".jpg"));
		}
		for(int j=0;j<li.length;j++)
			System.out.println(li[j].getName());
			*/	
}
}