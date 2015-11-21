/**
 * Created by: Tom Lauwers
 * Date: 10/15/2010
 * Simple program to have the Finch do a dance
 */

import edu.cmu.ri.createlab.terk.robot.finch.Finch;


public class Main
{

   public static void main(final String[] args)
   {
	  // Instantiating the Finch object
      Finch myFinch = new Finch();

      /********** OBSTACLE 1 **************/ 
      /********** PASS A LINE **************/ 
      //myFinch.setWheelVelocities(255,255,10000);
      
      /********** OBSTACLE 2 **************/ 
      /********** SAY COMPUTER SCIENCE IS FUN AND GO UP RAMP **************/ 
      //myFinch.saySomething("I love Computer Science");
      //myFinch.setWheelVelocities(255,255,10000);
      //myFinch.sleep(5000);
      
      /********** OBSTACLE 3 **************/ 
      /********** SPIN AROUND 5 TIMES  **************/ 
      //myFinch.setWheelVelocities(255, 0, 1000);
      
      /********** OBSTACLE 4 **************/ 
      /********** MOVE TO TARGET  **************/ 
      //myFinch.setWheelVelocities(255, 0,800); //turning right
      //myFinch.setWheelVelocities(255, 255, 10000); //straight
      //myFinch.setWheelVelocities(255, 0,800); //turning left
      
      /********** OBSTACLE 5 **************/ 
      /********** MOVE TO TARGET  **************/
      myFinch.setLED(255, 0, 0);
      myFinch.sleep(5000);
      myFinch.saySomething("CS is fun");
      //dependents on obstacles
      
      // Always end your program with finch.quit()
      myFinch.quit();
      System.exit(0);
    }
}

