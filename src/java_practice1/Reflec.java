package java_practice1;

import java.lang.reflect.Method;

public class Reflec {
public static void main(String[] args) throws ClassNotFoundException, Exception, SecurityException {
	Class c1=Generics1.class;
	//Class c=Class.forName("java_practice1.Generics1");
	Method [] m=c1.getDeclaredMethods();
	for(Method m1:m){
		System.out.println(m1);
	}
	Method m1= c1.getMethod("dorunterst", null);
	m1.invoke(c1, null);
}
}
