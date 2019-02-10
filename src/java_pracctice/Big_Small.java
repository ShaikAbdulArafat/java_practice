package java_pracctice;

import java.util.ArrayList;
import java.util.List;

public class Big_Small {
	
public static void main(String[] args) {
	
	int [] a= {125,15151,554,154,1,545,5151};
	int biggest = 0;
	for(int i=0;i<a.length;i++){
		for(int j=i+1;j<a.length;j++){
			if(a[i]>a[j]){
				biggest =a[i];
				a[i]=a[j];
				a[j]=biggest;
			}
		}
	}
	System.out.println("Biggest number is ;"+biggest);
	for(int m=0;m<a.length;m++)
		System.out.println(a[m]);
	
	methodd();
	for(int m=0;m<a.length;m++)
		System.out.println(a[m]);
	
	
}
	public static void methodd(){ 
		List<Integer> a = new ArrayList<>();
		a.add(312);
		a.add(413);
		a.add(241);
		a.add(6223);
		a.add(743);
		a.add(976);
		for (Integer as : a) {
			System.out.println("as is as :"+as);
		}
		System.out.println(a);
		
				
}
}
