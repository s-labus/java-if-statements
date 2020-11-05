// Straxinja Labus on 05/2020 

import java.util.Scanner;

public class AgeMessages3
{

	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int age;
	String name;

	System.out.print("What's your name? ");
	name = scan.next();
	
	System.out.print("How old are you? ");
	age = scan.nextInt();

	System.out.println("Your name: " + name);
	System.out.println("Your age: " + age);
	
	if(age < 16){System.out.println("You can't drive, " + name + ".");}
	if(age <= 17){System.out.println("You can drive, but not vote, " + name + ".");}
	if(age >= 18 && age <= 24){System.out.println("You can vote, but not rent a car, " + name + ".");}
	if(age >= 25){System.out.println("You can do pretty much anything, " + name + ".");}	
 }

}

