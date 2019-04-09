package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot gjd = new Robot();
  
	void go() {
		gjd.setSpeed(10000);
		
		gjd.penDown();
		gjd.setPenWidth(5);
		
		// 4. Make the robot move as fast as possible

		// 5. Set the pen width to 5

		// 6. Use a for loop to repeat steps #7 to #8, four times...
		for(int i =0; i<4; i++) {
			gjd.setRandomPenColor();
			drawSquare();
			gjd.turn(90);
		}
			// 7. Set the pen color to random
	
			// 1. Call the drawSquare() method
		
	
			//////////////////////8. Turn the robot 90 degrees to the right

	}

	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "YOU LOST LOSER!!!!");
		/* 3. Fill in the code to draw a square inside the method below. */
		for(int i =0; i<4; i++) {
		gjd.move(100);
		gjd.turn(90);
		}
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



