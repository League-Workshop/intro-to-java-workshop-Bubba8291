package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		Robot i = new Robot();
		int number =  0;
		i.setSpeed(7);
		i.setRandomPenColor();
		while(number < 4) {
		i.penDown();
		i.move(100);
		i.turn(90);
		number = number + 1;
		}
		
		for(int j = 0; j < 4; j++) {
			
		}
	}
}
