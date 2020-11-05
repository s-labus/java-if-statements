// Straxinja Labus on 05/2020 

import java.util.Scanner;
public class TwentyQuestions
{

	public static void main(String[] args){
	
	System.out.println("TWO QUESTIONS!");
	System.out.println("Think of an object, and I'll try to guess it.");	

	Scanner scan = new Scanner(System.in);
	String ansOne;
	String ansTwo;
	String guess = "";

	System.out.print("Question 1) Is it animal, vegetable, or mineral? ");
	ansOne = scan.next().toLowerCase();	

	System.out.print("Question 2) Is it bigger than a breadbox? ");
 
	ansTwo = scan.next().toLowerCase();

	if(ansOne.equals("animal")){
		if(ansTwo.equals("yes")){
		guess = "horse";
		}else{guess = "cat";}
	}else if(ansOne.equals("vegetable")){
		if(ansTwo.equals("yes")){guess = "coconut";}
		else{guess = "pineapple";}	
	}else if(ansOne.equals("mineral")){
		if(ansTwo.equals("yes")){guess = "asteroid";}else{guess = "kitchen salt";}
	}
	String think = "My guess is that you are thinking of a " + guess + ".";
	String doIcare = "I would ask you if I'm right, but I don't actually care.";
	
	System.out.println(think);
	System.out.println(doIcare);	
}

}

/*
ANIMAL yes horse, no cat 
VEGETABLE yes coconut, no pineapple	
MINERAL yes asteroid, no kitchen salt 
*/

