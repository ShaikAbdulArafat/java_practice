package algorithms.sorting;

import java.util.Arrays;

public class AlternateSort {

	public static void main(String[] args) {
		int arr[] = { 4, 2, 63, 48, 6, 7, 1, 9, 45, 63 };
		Arrays.sort(arr);
		
		for(int a : arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		int firstIndex = 0;
		int lastIndex = arr.length - 1;
		while (firstIndex < lastIndex) {
			System.out.print(arr[lastIndex] + ",");
			lastIndex--;
			System.out.print(arr[firstIndex] + ",");
			firstIndex++;
		}
		if (arr.length % 2 != 0)
			System.out.println(arr[firstIndex]);

	}
}
