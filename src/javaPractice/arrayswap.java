package javaPractice;

import java.util.Arrays;

public class arrayswap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {50, 10, 20, 40, 80};
		System.out.println("Before Swaping : "+Arrays.toString(arr));
		int x = arr[0];
		arr[0] = arr[arr.length -1];
		arr[arr.length -1] = x;
		System.out.println("After Swaping : "+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After Sorting : "+Arrays.toString(arr));
	}

}
