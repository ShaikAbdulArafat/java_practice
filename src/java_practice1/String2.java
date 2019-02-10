package java_practice1;

public class String2 {
public static void main(String[] args) {
	String s="this is a   normal  Program  for   Me";
	String []s1=s.split(" ");
	for(String ss:s1)
		System.out.println(ss);
	String []s2=s.split("\\s+");
	for(String sss:s2)
		System.out.println(sss);
}
}
