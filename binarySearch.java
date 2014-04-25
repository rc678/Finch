import java.util.*;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;


/*This is a simple program that demonstrates binary search.
 * A number from 1 to 100 will be generated and the user must 
 * guess the number.
 */

public class binarySearch {
	
	public static void main(String[] args) {
		Finch finch = new Finch();
		int Low = 1;
		int High = 100;
		Random r = new Random();
		int R = r.nextInt(High - Low) + Low;

		System.out.println("ENTER NUMBER BETWEEN 1 AND 100");
		Scanner scanner = new Scanner(System.in);
		int userNumber = scanner.nextInt();
		
		//System.out.println(R); //Prints the correct answer 
		
		while (true) {
			System.out.println("in loop");
			if ( userNumber == R) // user guesses the number correctly
			{
				
				finch.saySomething("You guessed correctly!");
				finch.setWheelVelocities(255,255,1000);
			    finch.setWheelVelocities(-180,180,500);
			    finch.setWheelVelocities(-255,-255,1000);;
			    finch.setWheelVelocities(180,-180,500);
			    finch.setWheelVelocities(255,255,1000);
			    break;
			}

			if (userNumber < R) {
				finch.saySomething("My number is higher than your the number you entered.");
				userNumber = scanner.nextInt();
			}

			if (userNumber > R) {
				finch.saySomething("My number is lower than the number you entered.");
				userNumber = scanner.nextInt();
			}
		}// end of while

		System.out.println("outside loop");
	}// end of main
}
