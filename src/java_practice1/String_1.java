package java_practice1;

public class String_1 {
public static void main(String[] args) {
	/*String str="helllo this is arafat";
	byte[] b=str.getBytes();
	System.out.println(b.length);
	System.out.println(str.length());
	for( byte a:b)
		System.out.println(a);*/
	char ch[] =new char[26];
	char c = 0;
		for(int o=0,i=97;i<=122;o++,i++){
		c=(char)i;
		ch[o]=c;
		System.out.print(c);
		System.out.print("\n");

	}
		
	String s=String.valueOf(ch);
	System.out.println(s);
	System.out.println(s.toUpperCase());

}
}