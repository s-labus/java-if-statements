// Straxinja Labus on 04/23/2020 
// Yes, I was, it's just the comment, explaining what code does

import javax.swing.*;

public class UsingSwingForInput
{

	public static void main(String[] args){
	
	// opens dialog box and stores value in string variable name
	String name = JOptionPane.showInputDialog("What is your name?");
	// opens dialog box and stores value in string variable input
	String inputAge = JOptionPane.showInputDialog("How old are you?");
	// converts string value to integer and stores it in var age
	int age = Integer.parseInt(inputAge);

	System.out.println("Hello, " + name + ".");
	System.out.println("Next year, you'll be " + (age+1) + ".");

	System.exit(0);
 }

}
