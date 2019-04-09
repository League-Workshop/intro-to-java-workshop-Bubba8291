package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public static void main(String[] args) {
		Robot zRobot = new Robot("mini");
		zRobot.setX(50);
		zRobot.setY(600);
		zRobot.penDown();
		zRobot.setSpeed(100);
		for(int i = 0; i < 5; i++) {
			int math1 = (int )(Math.random() * 500 + 100);
			int math2 = (int )(Math.random() * 500 + 100);
			zRobot.setRandomPenColor();
			zRobot.move(math1);
			zRobot.turn(45);
			zRobot.move(150);
			zRobot.turn(90);
			zRobot.move(150);
			zRobot.turn(45);
			zRobot.move(math1);
			zRobot.turn(-90);
			zRobot.setPenColor(Color.green);
			zRobot.move(100);
			zRobot.turn(-90);
			zRobot.setRandomPenColor();
			zRobot.move(math2);
			zRobot.turn(90);
			zRobot.move(150);
			zRobot.turn(90);
			zRobot.move(math2);
			zRobot.turn(-90);
			zRobot.setPenColor(Color.green);
			zRobot.move(100);
			zRobot.turn(-90);
		}
	}
}