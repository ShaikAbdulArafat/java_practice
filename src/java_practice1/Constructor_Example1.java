package java_practice1;

public class Constructor_Example1 {
	String name;
	public Constructor_Example1() {
	System.out.println("this is inside a constructor");
	}
	
	Constructor_Example1(String string){
		name=string;
	}
	public static void main(String[] args) {
		Constructor_Example1 o1= new Constructor_Example1();
		Constructor_Example1 o2= new Constructor_Example1("arif");
		o1.setname("arafat");
		o2.getname();
		o1.getname();
			
	}
	
	 void setname(String string){
		name=string;
	}
	
	void getname(){
		System.out.println("name is:" + name);
	}
}
