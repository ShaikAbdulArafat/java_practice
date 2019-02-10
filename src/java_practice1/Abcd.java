package java_practice1;

public class Abcd {
	public static void main(String[] args) throws Exception {
		int i=-64356;
		String v=null;
		double d=-48643.86446134d;
		short s=-5466;
		long l=-213156464354643166L;
		float f= (float)-112.43234343;
		byte b=-128;
		byte b1=127;
		short s1= -32768;
		short s2= 32767;
		
		String st="adad";
		System.out.println(Math.abs(d));
		System.out.println(Math.abs(s));
		System.out.println(Math.abs(i));
		System.out.println(Math.abs(f));
		System.out.println(Math.abs(l));
		System.out.println(Math.ceil(f)+"==="+Math.ceil(d));
		System.out.println(Math.floor(f)+"==="+Math.floor(d));
		System.out.println(Math.hypot(3, 4));
		System.out.println(Math.abs(Math.pow(2,3)));
		System.out.println(Math.log10(0));
		
		for(int i1=1;i1<15;i1++){
			System.out.println(Math.round((Math.random())));
		}	
}
}