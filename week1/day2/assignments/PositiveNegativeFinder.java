package week1.day2.assignments;
/*
 * Assignment:4

Problem statement: Check if the number is positive or negative-------------------------------------------------------
--------Pseudocode:---------- 1. Initialize a number, say, int number= 35; 
2. If a number is positive, print "The number is positive" 
If a number is negative, print "The number is negative" If it nether negative nor positive, 
print as "The number is neither positive nor negative"
 */
public class PositiveNegativeFinder {
public static void main(String[] args) {
	int num = 120;
	if (num>0) {
		System.out.println("The number is Positive");
	}else if (num < 0) {
		System.out.println("The number is Negative");
	}else {
		System.out.println("The number is neither positive nor negative");
	}
}
}
