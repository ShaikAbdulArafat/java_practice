package java_pracctice;

public class Biggest_Lowest {
public static int biggest;
public static int lowest;
	public static void main(String[] args) {
		
		int a[] =new int[7];
		a[0]=342;
		a[1]=243;
		a[2]=334;
		a[3]=234;
		a[4]=253;
		a[5]=223;
		a[6]=353;
	for (int i=0;i<a.length;i++){
			for (int j=0;j<a.length;j++){
				if(a[i]>a[j]){
					biggest=a[i];
				}else{
					lowest=a[j];
				}
			}
	}
	System.out.println("biggest number is :"+ biggest);
	System.out.println("lowest number is  :"+ lowest);
}
}
