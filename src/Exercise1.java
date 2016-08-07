import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class Exercise1 {

    public static void main(String[] args) {
    	
    	Robot r = new Robot();
    	
   	 	// 3. ask the user what color they would like the Robot to draw

    	String color = JOptionPane.showInputDialog("What color do you want?");
    	
   	 	// 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
    	
    	if (color.equalsIgnoreCase("red")) {
    		r.setPenColor(Color.red);
    	} else if (color.equalsIgnoreCase("green")) {
    		r.setPenColor(Color.green);
    	} else {
    		r.setPenColor(Color.black);
    	}
    	
   	 	// 2. set the pen width to 10

    	r.setPenWidth(10);
    	
   	 	// 1. make the Robot draw a shape
    	
    	r.penDown();
    	
    	for (int i = 0; i < 4; i++) {
    		r.move(200);
    		r.turn(90);
    	}
    }

}