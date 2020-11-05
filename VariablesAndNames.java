// Straxinja Labus on 04/23/2020 
// Yes, I was, it's just the comment, explaining what code does

public class VariablesAndNames
{
 
	public static void main(String[] args){

		int cars, drivers, passengers, cars_not_driven, cars_driven;
		double space_in_a_car, carpool_capacity, average_passengers_per_car;
		
		// ass int val 100
		cars = 100; 
		// ass float/double val 4.0
		space_in_a_car = 4.0;
		// ass int val 30 
		drivers = 30;
		// ass int val 90
		passengers = 90;
		// ass int val cars - drivers
		cars_not_driven = cars - drivers;
		// ass int val from drivers to cars_driven
		cars_driven = drivers;
		// ass double multipl. value to carpool_capacity
		carpool_capacity = cars_driven * space_in_a_car;
		// count average passenger per car
		average_passengers_per_car = passengers / cars_driven;

	
		System.out.println("There are " + cars + " cars available.");
		System.out.println("There are only " + drivers + " drivers available.");
		System.out.println("There will be " + cars_not_driven + " empty cars today.");
		System.out.println("We can transport " + carpool_capacity + " people today.");
		System.out.println("We have " + passengers + " to carpool today.");
		System.out.println("We need to put about " + average_passengers_per_car + " in each car.");
	}

}

