package section2;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		// START HERE
		Robot bob = new Robot();
		bob.penDown();
		bob.setSpeed(100);
		for (int i = 0; i < 4; i++) {
			bob.move(100);
			bob.turn(90);
		}
		bob.sparkle();

	}
}
