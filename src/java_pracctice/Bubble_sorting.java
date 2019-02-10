package java_pracctice;

public class Bubble_sorting {
	public static void main(String[] args) {
		int biggest;
		int lowest;
				int a[] =new int[7];
				a[0]=342;
				a[1]=243;
				a[2]=334;
				a[3]=234;
				a[4]=253;
				a[5]=223;
				a[6]=353;
			for (int i=0;i<a.length;i++){
					for (int j=i+1;j<a.length;j++){
						if(a[i]>a[j]){
							biggest=a[i];
							a[i]=a[j];
							a[j]=biggest;
						}
						}
			}
					for(int k=0;k<a.length;k++)
						System.out.println(a[k]);
					
					System.out.println("biggest"+a[a.length-1]);
					System.out.println("second biggest"+ a[a.length-2]);
			}
			
	}
