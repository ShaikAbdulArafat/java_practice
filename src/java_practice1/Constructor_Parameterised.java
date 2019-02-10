package java_practice1;

public class Constructor_Parameterised {
	private String scale;
	int num;
	String name;
	
	public Constructor_Parameterised() {
	num=1;
	System.out.println("this is a constructtor");
	}
	
	public Constructor_Parameterised(int num,String scale,String employee){
	this.scale=scale;
	this.num=num;
	name=employee;
	System.out.println(num+":"+"range of emp is=="+scale+"==name of employee is=="+employee);
	}
	public static void main(String[] args) {
		Constructor_Parameterised obj=new Constructor_Parameterised(1, "medium", "arafat");
		Constructor_Parameterised obj1=new Constructor_Parameterised();
			
	}
	
}
