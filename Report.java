package week1.day1;
/*Assignment 5
 * Create Class Student
declare variables
studentName
rollNo
collegeName
markScored
cgpa

Create a class Report and create object for student class in main method and print all the variables
 */
public class Report {
public static void main(String[] args) {
	Student obj = new Student();
	System.out.println(obj.studentName);
	System.out.println(obj.rollNo);
	System.out.println(obj.collegeName);
	System.out.println(obj.markScored);
	System.out.println(obj.cgpa);
}
}
