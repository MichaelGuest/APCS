//Michael Guest
import apcslib.*;


public class Benzene {

	public static void main (String[]args_) {

		SketchPad paper=new SketchPad(500,500);
		
		DrawingTool pen=new DrawingTool(paper);
		//circle
		pen.drawCircle(150);
		//leaving circle
		pen.up();
		pen.move(176);
		pen.down();
		//Hexagon
		pen.turnRight(90);
		pen.move(100);
		pen.turnRight(60);
		pen.move(200);
		pen.turnRight(60);
		pen.move(200);
		pen.turnRight(60);
		pen.move(200);
		pen.turnRight(60);
		pen.move(200);
		pen.turnRight(60);
		pen.move(200);
		pen.turnRight(60);
		pen.move(200);
		
		

		
		
		
		
	}

}
