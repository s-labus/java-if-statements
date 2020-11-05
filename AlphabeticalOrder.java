// Straxinja Labus on 05/2020 
import java.util.Scanner;

public class AlphabeticalOrder
{

	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	String lastName;

	System.out.print("What's your last name? ");
	lastName = scan.next();
	
	int i = lastName.compareTo("Carswell");
	System.out.println(i);
 }

}

