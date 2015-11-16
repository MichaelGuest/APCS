package Rectangle;

import apcslib.*;

public class Rectangle

{
	private double myX;
	private double myY;
	private double myWidth;
	private double myHeight;
	private static DrawingTool pencil = new DrawingTool(new SketchPad(500, 500));
	
	public Rectangle ()
	{
		myX = 0;
		myY = 0;
		myWidth = 0;
		myHeight = 0;
	}
	public Rectangle (double x, double y, double width, double height)
	{
		myX = x;
		myY = y;
		myWidth = width;
		myHeight = height;
	}
	public double getPerimeter()
	{
		
		return 2.0 * (myWidth + myHeight);
	}
	public double getArea()
	{
	
		return myWidth * myHeight;
	}
	public void draw()
	{
		pencil.drawRect(200, 200);//location
		pencil.drawRect(75, 200);
		pencil.drawRect(200, 75);

	}

	public static void main(String[] args)
	{

		Rectangle rectA = new Rectangle(40, 30, 40, 4);// x y w h
		rectA.draw();
		Rectangle rectB = new Rectangle(100, 100, 45, 4);
		rectB.draw();
		Rectangle rectC = new Rectangle(40, 30, 40, 4);
		rectC.draw();

		System.out.println("Perimeter: = " + rectA.getPerimeter());
		System.out.println("Area: = " + rectA.getArea());


		System.out.println("Perimeter: = " + rectB.getPerimeter());
		System.out.println("Area: = " + rectB.getArea());

		System.out.println("Perimeter: = " + rectC.getPerimeter());
		System.out.println("Area: = " + rectC.getArea());
	}
}
