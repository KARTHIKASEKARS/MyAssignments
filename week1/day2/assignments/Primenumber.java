package week1.day2.assignments;

public class Primenumber {
public static void main(String[] args) {
	int n =13;
	boolean flag = false;
	for (int i=2; i<12; i++) {
		if (n%i == 0) {
			flag= true;
			break;
		}
	}
	if (flag == true) {
		System.err.println("Not a prime number");
	}else {
		System.err.println("It is a prime number");
	}
}
}
