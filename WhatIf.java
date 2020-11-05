// Straxinja Labus on 04/23/2020 
// Yes, I was, it's just the comment, explaining what code does
import java.util.Scanner;

public class WhatIf
{
 
	public static void main(String[] args){
	
	int people = 30;
	int cats = 30;
	int dogs = 15;

	if(people < cats){
		System.out.println("Too many cats! The world is doomed!");
	}

	if(people > cats){
		System.out.println("Not many cats! The world is saved!");
	}

	if(people < dogs){
		System.out.println("The wolrd is drooled on!");
	}

	if(people > dogs){
		System.out.println("The world is dry!");
	}

	dogs += 5;

	if(people >= dogs){
		System.out.println("People are greater than or equal to dogs.");
	}

	if(people <= dogs){
		System.out.println("People are less than or equal to dogs.");
	}

	if(people == dogs){
		System.out.println("People are dogs.");
	}
 }

}

// 1. compares two values and gives true value back
// 2. the code in curly braces will execute
// 3. changed
