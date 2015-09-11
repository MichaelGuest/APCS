/*
 * Author: Michael Guest
 * Lab: LA1.1 DrawHouse
 * Creates a piece of paper and a pen, and draws a house with 2 windows and a door.
 */
import apcslib.*;

public class drawHouse {

	public static void main (String[]args_) {
	
		SketchPad paper=new SketchPad(500,500);
		
		DrawingTool pen=new DrawingTool(paper);
		
		pen.forward(300);
		pen.turnRight(90);
		pen.forward(300);
		pen.turnRight(90);
		pen.forward(300);
		pen.turnRight(90);
		pen.forward(300);
		pen.turnRight(90);
		pen.move(300);
		pen.turnRight(30);
		pen.move(300);
		//triangle
		pen.turnRight(120);
		pen.move(300);
		pen.turnRight(120);
		pen.move(300);
		pen.turnLeft(90);
		pen.move(300);
		pen.turnLeft(90);
		//door
		pen.move(115);
		pen.turnLeft(90);
		pen.move(100);
		pen.turnRight(90);
		pen.move(80);
		pen.turnRight(90);
		pen.move(100);
		pen.turn(180);
		pen.move(100);
		//window
		pen.up();
		pen.move(50);
		pen.down();
		pen.move(50);
		pen.turnRight(90);
		pen.move(50);
		pen.turnRight(90);
		pen.move(50);
		pen.turnRight(90);
		pen.move(50);

		
		
	}

}
