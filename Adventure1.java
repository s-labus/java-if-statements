// Straxinja Labus on 05/2020 

import java.util.Scanner;

public class Adventure1
{

	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	String ansOne;	
	String ansTwo;
	String ansThree;
	
	System.out.println("WELCOME TO MY LITTLE ADVENTURE!");
	
	System.out.println("You are in the old creepy and wet house. Would you like to go 'upstairs' or into the 'kitchen'?");
	ansOne = scan.next().toLowerCase();
// kitchen	
	if(ansOne.equals("kitchen")){

	System.out.println("There is a good old fridge and something on shelf. Dirty dishes everywhere, old used food, a lot of trash. You may open 'fridge' or look on the 'shelf'?");
	ansTwo = scan.next().toLowerCase();
		if(ansTwo.equals("fridge")){
			System.out.println("There is some old food and other staff, creepy spiders walking over old blue bread. Suddenly you are verrrry hungry. Eat? 'yes' or 'no' ...");
			ansThree = scan.next().toLowerCase();
			if(ansThree.equals("yes")){System.out.println("You poisoned yourself.");}
			else if(ansThree.equals("no")){System.out.println("You died starving...");}
		}
		if(ansTwo.equals("shelf")){
	System.out.println("There is a letter, with today's date? Read: 'yes' or 'no' ...");
			ansThree = scan.next().toLowerCase();
			if(ansThree.equals("yes")){System.out.println("You find there is no way out.");}
			else if(ansThree.equals("no")){System.out.println("Your curiosity kills you...");}
		
}
	}
// upstairs
	if(ansOne.equals("upstairs")){

		System.out.println("Two doors. One for 'living room' the other for 'bathroom'... You choose?");
		ansTwo = scan.next().toLowerCase();
			if(ansTwo.equals("living room")){
				System.out.println("There is a tape some playing on fucking tv... See it 'yes' or 'no' ...");
				ansThree = scan.next().toLowerCase();
				if(ansThree.equals("yes")){System.out.println("Tabitha on tv... It will end just like in the circle movie... Sorry.");}
				else if(ansThree.equals("no")){System.out.println("Well, feel free to play anything you like, there are bunch of dvds from 50's... You will be bored till the end.");}
			}
			if(ansTwo.equals("bathroom")){
		System.out.println("There is a shower turned on and woman of your dreams calls you in, wanna join her ...'yes' or 'no' ...");
				ansThree = scan.next().toLowerCase();
				if(ansThree.equals("yes")){System.out.println("You wake up.");}
				else if(ansThree.equals("no")){System.out.println("What's wrong with you?!");}
		
	}
		}
 }

}

