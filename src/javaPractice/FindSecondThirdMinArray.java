package javaPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindSecondThirdMinArray {
	

	static void FindSecondThirdMinfromArray(Integer arr[], int n) {

		List<Integer> intList = convertArrayToList(arr);
		Collections.sort(intList);

		System.out.println("Second Min No is : " + intList.get(1));
		System.out.println("Third Min No is : " + intList.get(2));
	}

	public static <T> List<T> convertArrayToList(T array[]) {
		// create a list from the Array
		return Arrays.stream(array).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = {2,4,3,5,1,9,10};
		int n = arr.length;
		FindSecondThirdMinfromArray(arr, n);

	}

}
