// Straxinja Labus on 04/23/2020 
// Yes, I was, it's just the comment, explaining what code does

import java.util.Scanner;
public class UserInputData
{
 
	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);

	String firstName;
	String lastName;
	int grade;
	int student_id;
	String username;
	double GPA;

	System.out.print("First name: ");
	firstName = scan.next();

	System.out.print("Last name: ");
	lastName = scan.next();

	System.out.print("Grade (9-12): ");
	grade = scan.nextInt();

	System.out.print("Student ID: ");
	student_id = scan.nextInt();

	System.out.print("Username: ");
	username = scan.next();

	System.out.print("GPA (0.0 - 4.0): ");
	GPA = scan.nextDouble();

	System.out.println("Your information:");
		System.out.println("	Username: " + username);	
		System.out.println("	ID: " + student_id);
		System.out.println("	Name: " + lastName + ", " + firstName);
		System.out.println("	GPA: " + GPA);
		System.out.println("	Grade: " + grade);	
	}

}

