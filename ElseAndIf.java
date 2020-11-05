// Straxinja Labus on 04/23/2020 
// Yes, I was, it's just the comment, explaining what code does


public class ElseAndIf
{
 
	public static void main(String[] args){
		
	int people = 30;
	int cars = 40;
	int buses = 15;

	if(cars > people){
		System.out.println("We should take the cars.");
	} else if(cars < people){
		System.out.println("We should not take the cars.");
	}else{
		System.out.println("We can't decide.");
	}

	

	if(buses > cars){
		System.out.println("That's too many buses.");
	}else if(buses < cars){
		System.out.println("Maybe we could take the buses.");
	}else{
		System.out.println("We still can't decide.");
	}

		
	if(people > buses){
		System.out.println("All right, let's just take the buses.");
	}else{
		System.out.println("Fine, let's stay home then.");
	}
	
 }

}

// 1. else if is alternative case for if statement
// else is alternative code to be executed in case if or else if doesn't meet the 
// requirements

// 2. removing else statements in this case doesn't make difference
// because the condition is executed earlier in the if/elseif tree
