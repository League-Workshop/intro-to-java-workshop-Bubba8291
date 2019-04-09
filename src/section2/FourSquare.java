package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	Robot i = new Robot();
	// 2. Create a new Robot

	void go() {
		
		// 4. Make the robot move as fast as possible
		i.setSpeed(7);
		// 5. Set the pen width to 5
		i.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
		for(int j = 0; j < 4; j++) {
			i.setRandomPenColor();
			drawSquare();
			i.turn(90);
		}
			// 7. Set the pen color to random
	
			// 1. Call the drawSquare() method
		
			// 8. Turn the robot 90 degrees to the right

	}

	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		i.penDown();
		for(int j = 0; j < 4; j++) {
			i.move(100);
			i.turn(90);
		}
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



