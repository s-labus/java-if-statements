// Straxinja Labus on 04/23/2020 
// Yes, I was, it's just the comment, explaining what code does

import java.util.Scanner;
public class HowOldAreYou
{
 
	public static void main(String[] args){
		
	Scanner scan = new Scanner(System.in);
	System.out.print("Hey, what's your name? ");
	String name = scan.next();
	
	System.out.print("Ok, " + name + ", how old are you? ");
	int age  = scan.nextInt();

	if(age < 16){
	System.out.println("You can't drive, " + name + ".");
	}

	if(age < 18){
	System.out.println("You can't vote, " + name + ".");
	}

	if(age < 25){
	System.out.println("You can't rent a car, " + name + ".");
	}

	if(age >= 25) {
	System.out.println("You can do anything that's legal, " + name + ".");
	}
 }

}

