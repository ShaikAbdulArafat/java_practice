package java_practice1;

public class Static_Var {

static String s="arafat";
String name;
 String s1="arif";
public void Static_var(String name1){
	this.name=name1;
}
public void nonstatmethod(){
	Static_Var obj=new Static_Var();
	String abc=s+s1;
	System.out.println(abc);
	
	String a="asalam";
	System.out.println(s+"-----"+s1+"------");
	Static_Var.method2();
}
public static String method2(){
	String abc=s+Static_Var.s;
	//System.out.println(abc);
	return abc;
}

public static void main(String[] args) {
	
Static_Var obj= new Static_Var();
obj.nonstatmethod();
}
}
