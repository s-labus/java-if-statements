// Straxinja Labus on 04/23/2020 
// Yes, I was, it's just the comment, explaining what code does

import java.util.Scanner;

public class HowOldAreYou2
{

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		String name;
		int age;

		System.out.print("Hey, what's your name? (Sorry, I keep forgetting.) ");
		name = scan.next();
		
		System.out.print("Ok, " + name + ", how old are you? ");
		age = scan.nextInt();

		if(age < 16){
			System.out.println("You can't drive, " + name + ".");
		}else if(age <= 17){
			System.out.println("You can drive but can't vote, " + name + ".");
		}else if(age <= 24){
			System.out.println("You can vote but can't rent a car, " + name + ".");
		}else{
			System.out.println("You can do pretty much anything, " + name + ".");
		}	
	}

}
