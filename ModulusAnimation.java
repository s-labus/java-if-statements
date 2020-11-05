// Straxinja Labus on 04/23/2020 
// Yes, I was, it's just the comment, explaining what code does

public class ModulusAnimation
{

	public static void main(String[] args){
		
	int repeats = 5;
	int stepsPerSecond = 10;
	
	for(int i=0; i<repeats*11; i++){
		
		if(i%11 == 0) {System.out.print("Tigar..... \r");}
		else if(i%11 == 1) {System.out.print(".Tigar.... \r");}
		else if(i%11 == 2) {System.out.print("..Tigar... \r");}
		else if(i%11 == 3) {System.out.print("...Zvani.. \r");}
		else if(i%11 == 4) {System.out.print("....Zvani. \r");}
		else if(i%11 == 5) {System.out.print(".....Zvani \r");}
		else if(i%11 == 6) {System.out.print("......BAN. \r");}
		else if(i%11 == 7) {System.out.print(".......BAN \r");}
		else if(i%11 == 8) {System.out.print("........BA \r");}
		else if(i%11 == 9) {System.out.print(".........B \r");}
		try {
		    Thread.sleep(2500/stepsPerSecond);
		} 
		catch(InterruptedException e){

		}
	 }
 }

}
