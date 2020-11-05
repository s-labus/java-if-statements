// Straxinja Labus on 04/23/2020 
// Yes, I was, it's just the comment, explaining what code does

import java.util.Scanner;

public class SpaceBoxing
{

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		double weight;
		int planet;

		System.out.print("Please enter your current earth weight in kg: ");
		weight = scan.nextDouble();

		System.out.println("I have information for the following planets: ");
		System.out.println("1. Venus 	2. Mars		3. Jupiter");
		System.out.println("4. Saturn 	5. Uranus 	6. Neptune");

		System.out.print("Which planet are you visiting? ");
		planet = scan.nextInt();

		if(planet == 1){
		System.out.println("Your weight would be " + (weight*0.78) + " on that planet.");
		}else if(planet == 2){
		System.out.println("Your weight would be " + (weight*0.39) + " on that planet.");
		}else if(planet == 3){
		System.out.println("Your weight would be " + (weight*2.65) + " on that planet.");		
		}else if(planet == 4){
		System.out.println("Your weight would be " + (weight*1.17) + " on that planet.");
		}else if(planet == 5){
		System.out.println("Your weight would be " + (weight*1.05) + " on that planet.");
		}else if(planet == 6){
		System.out.println("Your weight would be " + (weight*1.23) + " on that planet.");
		}
	}

}
