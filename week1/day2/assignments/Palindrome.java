package week1.day2.assignments;
/*
 * Assignment:2
Check the given number is palindrome or not 
Int num =34343
Initialize a  temporary variable.
Reverse the number (using for loop and add to the temporary variable)
Compare the temporary number with reversed number
If both numbers are same, print "palindrome number"
Else print "not palindrome number"
 */
public class Palindrome {
public static void main(String[] args) {
	int num = 34343;
	int temp=0;
	for(int i=num;i>0;i--) {
		int rem= num %10;
		temp=(temp*10)+rem;
		num = num/10;
	}
	if(temp == num) {
		System.out.println("Palindrome number");
	}else {
		System.out.println("Not a palindrome number");
	}
}
}
