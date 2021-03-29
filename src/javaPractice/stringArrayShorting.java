package javaPractice;

import java.util.Arrays;

public class stringArrayShorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = {"Ritam", "Singha", "East", "Bengal", "Kolkata"};
		System.out.println("Before Sorting : "+Arrays.toString(arr));
		
		for(int i=0; i<=arr.length-1; i++)
		{
			for(int j= i+1; j<arr.length; j++)
			{
				if(arr[i].compareTo(arr[j])>0)
				{
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		//Arrays.sort(arr);
		System.out.println("After Sorting : "+Arrays.toString(arr));

	}

}
