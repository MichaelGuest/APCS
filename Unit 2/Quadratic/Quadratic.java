package Quadratic;

import apcslib.*;
import chn.util.ConsoleIO;

public class Quadratic
{
    public static void main(String[] args)
    {
        double a;
        double b;
        double c;

        double x1;
        double x2;

        ConsoleIO console = new ConsoleIO();
        System.out.println("Input the values a,b,c for ax^2+bx+c = 0");
        System.out.print("Input a: ");
        a = console.readDouble();

        System.out.print("Input b: ");
        b = console.readDouble();

        System.out.print("Input c: ");
        c = console.readDouble();


        x1 = (-b+Math.sqrt(b*b-4*a*c)) / (2*a);
        x2 = (-b-Math.sqrt(b*b-4*a*c)) / (2*a);

        System.out.println("x1 = " + (Format.center(x1, 15, 4)));
        System.out.println("x2 = " + (Format.center(x2, 15, 4)));








    }
}
