// Straxinja Labus on 05/2020 

import java.util.Scanner;

public class GenderGame
{

	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
	String name;
	String lastName;
	int age;
	char gender;
	char status;
	String prefix = "";

	System.out.print("What is your gender (M or F): ");
	gender = scan.next().charAt(0);
	
	System.out.print("First name: ");
	name = scan.next();

	System.out.print("Last name: ");
	lastName = scan.next();

	System.out.print("Age: ");
	age = scan.nextInt();
	
	
	
if(age >= 20 && gender == 'F'){
System.out.print("Are you married, Kim (Y or N)? ");
	status = scan.next().charAt(0);

		if(status == 'Y'){ prefix = "Mrs.";}else{prefix = "Ms.";}
System.out.println("Then I shall call you " + prefix + " " + lastName + ".");
		}
else if(age < 20 && gender == 'F'){
System.out.println("Then I shall call you " + name + " " + lastName + ".");
}

else if(age >= 20 && gender == 'M'){
System.out.print("Are you married, Kim (Y or N)? ");
	status = scan.next().charAt(0);
prefix="Mr.";
System.out.println("Then I shall call you " + prefix + " " + lastName + ".");
}
else if(age < 20 && gender == 'M'){
System.out.println("Then I shall call you " + name + " " + lastName + ".");
}

				
 }

}

