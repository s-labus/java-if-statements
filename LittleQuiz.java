// Straxinja Labus on 04/23/2020 
// Yes, I was, it's just the comment, explaining what code does

import java.util.Scanner;

public class LittleQuiz
{

	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
	String answer;
	int intAnswer;
	int ctn = 0;
	int totalQuestions = 0;

	System.out.print("Are you ready for a quiz? ");
	answer = scan.next();
	
	System.out.println("Okay, here it comes!");
	
	System.out.println();

	System.out.println("Q1) What is the capital of Alaska? ");
	totalQuestions++;
	System.out.println("1) Melbourne");
	System.out.println("2) Anchorage");
	System.out.println("3) Juneau");
	intAnswer = scan.nextInt();

	if(intAnswer ==  3){
		System.out.println("That's right!");
		ctn++;		
	}else{
		System.out.println("Wrong!");
	}

	System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?");
	totalQuestions++;
	System.out.println("1) yes");
	System.out.println("2) no");

	intAnswer = scan.nextInt();
	if(intAnswer == 1){
	System.out.println("Sorry, \"cat\" is a string. ints can only store numbers");
	}else{
	System.out.println("Correct");
	ctn++;
	}
	
	System.out.println("Q3) What is the result 9+6/3?");
	totalQuestions++;	
	System.out.println("1) 5");
	System.out.println("2) 11");
	System.out.println("3) 15/3");

	intAnswer = scan.nextInt();

	if(intAnswer == 2){
		System.out.println("That's correct!");
		ctn++;
	}else{System.out.println("Wrong");}

	System.out.println("Overall, you got " + ctn + " out of "+ totalQuestions + " correct.");
	System.out.println("Thanks for playing!");				
 }

}
