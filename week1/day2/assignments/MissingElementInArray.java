package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6,8};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != i+1) {
				System.out.println("Missing number is " + (i+1));
				break;
			}
		}
	}
}
