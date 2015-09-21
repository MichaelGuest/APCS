package Fun;

import apcslib.Format;

public class Fun {

    public static double fToC(double fahrenheit) {
        double celsius = 5.0 / 9 * (fahrenheit - 32);
        return celsius;
    }

    public static double ctoF(double celsius) {
        double fahrenheit = (9 * celsius / 5) + 32;
        return fahrenheit;
    }

    public static double volumeOfSphere(double radius) {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return volume;

    }

    public static double hypoTenuse(double legA, double legB) {
        double hypotenuse = Math.sqrt(legA * legA + legB * legB);
        return hypotenuse;
    }

    public static void main(String[] args) {

        System.out.println("212 degrees F is " + (Format.left(fToC(212), 3, 2) + " degrees C"));
        System.out.println("98.6 degrees F is " + (Format.left(fToC(98.6), 3, 2) + " degrees C"));
        System.out.println("10 degrees F is " + (Format.left(fToC(10), 3, 2) + " degrees C"));


        System.out.println("-15 degrees C is " + (Format.left(ctoF(-15), 3, 2) + " degrees F"));
        System.out.println("0 degrees C is " + (Format.left(ctoF(0), 3, 2) + " degrees F"));
        System.out.println("70 degrees C is " + (Format.left(ctoF(70), 3, 2) + " degrees F"));


        System.out.println("Volume Of Sphere with radius of = " + (Format.left(volumeOfSphere(1.0), 3, 2)));
        System.out.println("Volume Of Sphere with radius of = " + (Format.left(volumeOfSphere(2.25), 3, 2)));
        System.out.println("Volume Of Sphere with radius of = " + (Format.left(volumeOfSphere(7.50), 3, 2)));


        System.out.println("Right Triangle with sides 6.75 and 12.31 has a hypotenuse of " + (Format.left(hypoTenuse(6.75, 12.31), 3, 2)));
        System.out.println("Right Triangle with sides 3.0 and 4.0 has a hypotenuse of " + (Format.left(hypoTenuse(3.0, 4.0), 3, 2)));
    }
}
