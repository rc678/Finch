import java.util.*;
import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class finchMethods
{

   public static void main(final String[] args)
   {

      Finch myFinch = new Finch();

      int numberGuessed = 2;/*insert number they guessed here*/
      if(numberGuessed == 5)/*you can pick any number*/
      {
      	changeNoseColor(myFinch, "blue");
      }else{
      	/*Finch does nothing*/
      }
      myFinch.quit();
      System.exit(0);
    }
   
static void goForward(int timeToHold, Finch finch){
		finch.setWheelVelocities(128, 128, timeToHold * 1000);
}

static void goBackward(int timeToHold, Finch finch){
		finch.setWheelVelocities(-128, 128, timeToHold * 1000);
}

static void turnLeft(int timeToHold, Finch finch){
	finch.setWheelVelocities(128, -128, timeToHold * 1000);
}

static void turnRight(int timeToHold, Finch finch){
	finch.setWheelVelocities(-128, 128, timeToHold * 1000);
}

static void dance(Finch finch){
    finch.setLED(0, 255, 0);
    finch.setWheelVelocities(255,255,1000);
    finch.setWheelVelocities(-180,180,500);
    finch.setWheelVelocities(-255,-255,1000);;
    finch.setWheelVelocities(180,-180,500);
    finch.setWheelVelocities(255,255,1000);
}

static void changeNoseColor(Finch finch, String color){
	switch(color){
		case "red":
			finch.setLED(255, 0, 0, 1000);
			break;
		case "green":
			finch.setLED(0, 255, 0, 1000);
			break;
		case "blue":
			finch.setLED(0, 0, 255, 1000);;
			break; 
		case "white":
			break;
	}
}

}//end of class

