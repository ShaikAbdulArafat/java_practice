package StringPractice;

import java.lang.reflect.Array;

/*
 Removing duplicates from given Array
 I/P =[1,2,3,1,2,3]  o/p= [1,2,3]
*/
public class RemoveDuplicates {
	public static void main(String[] args) {
		int [] arr = {1,323,2323,23,23,12,2,34};

		int [] arr1=RemoveDuplicates(arr);
		for(int a :  arr1) {
			System.out.println(a);
		}
	}
	
	public static int[] RemoveDuplicates(int[] intarr) {
		int intarr_size = Array.getLength(intarr);
		int[] result =  new int[intarr_size];
		int i =0;
		for(int a=0;a<intarr_size;a++) {
			for(int b=0;b<intarr_size;b++) {
				if(a == b) {
					result[i]=intarr[a];
					i++;
					break;
				}else if (a!=b){
					if(intarr[a] == intarr[b]) {
						result[i]=0;
						i++;
						break;
					}
				}
			}
		}
		return result;
	}
}
