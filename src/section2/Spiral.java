package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot i = new Robot();
		// 5. Set your robot's pen down 
		i.penDown();
		// 3. Set the robot to go at max speed (100)
		i.setSpeed(100);
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		for(int j = 0; j < 75; j++) {
			// 7. Change the pen color to random
			i.setRandomPenColor();
			// 6. Move the robot 5 times the loop counter (5*i)
			i.move(5 * j);
			// 2. Turn the robot 360/7 degrees to the right
			i.turn(360 / 7);
			// 8. Set the pen width to i
			i.setPenWidth(j);
		}
	}
}
