package java_practice1;

class Constructor_Example3 extends Constructor_Example2{
	String name;
	int num;
	public Constructor_Example3(int amount,String name) {
		super(amount);
		this.name=name;
	}
	void show(){
		System.out.println("name of the employee=="+name);
		System.out.println("sal of employee=="+amount);
	}
}

 
