package week1.day2.assignments;

import java.util.Arrays;

//Find the Second smallest number in the array {23,45,67,32,89,22 }
public class SecondSmallest {
public static void main(String[] args) {
	int [] arr= {23,45,67,32,89,22};
	Arrays.sort(arr);
	int small = arr[1];
	System.out.println(small);
}
}
