// Straxinja Labus on 05/2020 

import java.util.Scanner;

public class BMICategories
{

	public static void main(String[] args){
	
	/* Let's make BMI - body mass index calculator
	* BMI = weight kg / squared height meters
	*/

	Scanner scan = new Scanner(System.in);
	double height;
	double weight;

	System.out.print("Your height in cm: ");
	height = scan.nextDouble()/100;

	System.out.print("Your weight in kg: ");
	weight = scan.nextDouble();
	
	double bmi = weight/ (height*height);

	String category ="";
	
	if(bmi < 18.5){category = "underweight";}
	else if(bmi < 24.9){category = "normal weight";}
	else if(bmi < 29.9){category = "overweight";}
	else{category = "obese";}

	System.out.println("Your BMI is: " + bmi + ", you are " + category + " category.");
 }

}

