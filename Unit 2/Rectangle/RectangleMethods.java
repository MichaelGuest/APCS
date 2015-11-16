package RectangleMethods;

import apcslib.*;

public class RectangleMethods {
    //variables
    private double myX;
    private double myY;
    private double myWidth;
    private double myHeight;
    private static DrawingTool pencil = new DrawingTool(new SketchPad(500, 500));
    private double myDirection;

    //constructors
    public RectangleMethods() {
        myX = 0;
        myY = 0;
        myWidth = 0;
        myHeight = 0;
    }

    public RectangleMethods(double x, double y, double width, double height) {
        myX = x;
        myY = y;
        myWidth = width;
        myHeight = height;
    }

    //methods
    public double getPerimeter() {
        return 2.0 * (myWidth + myHeight);
    }

    public double getArea() {
        return (myWidth * myHeight);
    }

    public void setDirection(double direction) {
        myDirection = direction;
    }

    public void setWidth(double width) {
        myWidth = width;
    }

    public void setHeight(double height) {
        myHeight = height;
    }

    public double getDirection() {
        return myDirection;
    }

    public void setXPos(double X) {
        myX = X;
    }

    public void setYPos(double Y) {
        myY = Y;
    }

    public void draw() {
        pencil.up();
        pencil.move(myX, myY);
        pencil.down();
        pencil.setDirection(myDirection);
        pencil.forward(myHeight);
        pencil.turnLeft(90);
        pencil.forward(myWidth);
        pencil.turnLeft(90);
        pencil.forward(myHeight);
        pencil.turnLeft(90);
        pencil.forward(myWidth);
    }

    public void drawString(String str, double x, double y) {
        pencil.up();
        pencil.move(x, y);
        pencil.drawString(str);
    }

    public double getXPos() {
        return myX;
    }

    public double getYPos() {
        return myY;
    }

    public double getWidth() {
        return myWidth;
    }

    public double getHeight() {
        return myHeight;
    }

    public static void main(String[] args) {

        RectangleMethods rectA = new RectangleMethods(-10, 0, 200, 50);

        double turnInc = 30;
        double widthDec = 10;

        rectA.setDirection(270);
        rectA.setDirection(rectA.getDirection());
        rectA.draw();

        rectA.setDirection(rectA.getDirection() - turnInc);
        rectA.setWidth(rectA.getWidth() - widthDec);
        rectA.draw();

        rectA.setDirection(rectA.getDirection() - turnInc);
        rectA.setWidth(rectA.getWidth() - widthDec);
        rectA.draw();

        rectA.setDirection(rectA.getDirection() - turnInc);
        rectA.setWidth(rectA.getWidth() - widthDec);
        rectA.draw();

        rectA.setDirection(rectA.getDirection() - turnInc);
        rectA.setWidth(rectA.getWidth() - widthDec);
        rectA.draw();

        rectA.setDirection(rectA.getDirection() - turnInc);
        rectA.setWidth(rectA.getWidth() - widthDec);
        rectA.draw();

        rectA.setDirection(rectA.getDirection() - turnInc);
        rectA.setWidth(rectA.getWidth() - widthDec);
        rectA.draw();

        rectA.setDirection(rectA.getDirection() - turnInc);
        rectA.setWidth(rectA.getWidth() - widthDec);
        rectA.draw();

        rectA.setDirection(rectA.getDirection() - turnInc);
        rectA.setWidth(rectA.getWidth() - widthDec);
        rectA.draw();

        rectA.setDirection(rectA.getDirection() - turnInc);
        rectA.setWidth(rectA.getWidth() - widthDec);
        rectA.draw();

        rectA.setDirection(rectA.getDirection() - turnInc);
        rectA.setWidth(rectA.getWidth() - widthDec);
        rectA.draw();


        RectangleMethods rectB = new RectangleMethods(-50, 160, 200, 50);

        rectB.setDirection(90);
        rectB.draw();
        rectB.drawString("Area = " + rectB.getArea(), -220, 175);
        rectB.drawString("Perimeter = " + rectB.getPerimeter(), -255, 145);
        rectB.drawString("Width = " + rectB.getWidth(), -200, 215);
        rectB.drawString("Height = " + rectB.getHeight(), -35, 185);
    }

}
