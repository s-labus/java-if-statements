// Straxinja Labus on 05/2020 

import java.util.Scanner;

public class TwoMoreQuestions
{

	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);

	String aOne;
	String aTwo;
	String guess = "";

	System.out.println("TWO MORE QUESTIONS, BABY!");

	System.out.println();	
	System.out.println("Think of something and I will try to guess it!");
	System.out.println();	
	System.out.print("Question 1) Does it stay inside or outside or both? ");
		aOne = scan.next().toLowerCase();

	System.out.print("Question 2) Is it a living thing? ");
		aTwo = scan.next().toLowerCase();	

	if(aOne.equals("inside") && aTwo.equals("no")){ guess = "jakuzzi";}
	if(aOne.equals("outside") && aTwo.equals("no")){ guess = "my car";}
	if(aOne.equals("both") && aTwo.equals("no")){ guess = "basket ball";}

	if(aOne.equals("inside") && aTwo.equals("yes")){ guess = "R2D2";}
	if(aOne.equals("outside") && aTwo.equals("yes")){ guess = "palm tree";}
	if(aOne.equals("both") && aTwo.equals("yes")){ guess = "iguana";}
	
	System.out.println();
	System.out.println("Then what else could you be thinking of besides a " + guess + "?!?");
 }

}

