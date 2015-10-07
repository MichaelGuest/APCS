package loanTable;

import apcslib.Format;
import chn.util.*;

public class loanTable {


    public static void main(String[] args) {
        //Declaring Variables
        double k;
        double n;
        double c;
        double p;
        double a;
        double low;
        double high;

        int time;

        //Getting User Input
        ConsoleIO console = new ConsoleIO();

        System.out.println("Amount of the loan: ");
        p = console.readDouble();
        System.out.println("Principal = $" + p);

        System.out.println("The length of loan in years: ");
        time = console.readInt();
        System.out.println("Time = " + time + " years");

        System.out.println("A low interest rate in %: ");
        low = console.readDouble() / 100;
        System.out.println("Low rate = " + low + "%");

        System.out.println("A high interest rate in %: ");
        high = console.readDouble() / 100;
        System.out.println("High rate = " + high + "%");

        //While Loop
        while (low <= high) {

            k = low / 1200.0;
            n = time * 12;
            c = Math.pow((1 + k), n);
            a = (p * k * c) / (c - 1);

            System.out.println("Annual interest rate: " + low * 100);
            System.out.println("Monthly Payment: " + Format.left(a, 2, 2));

            low += (0.25 / 100);
        }
    }

}
