package loanTable;

import apcslib.Format;
import chn.util.*;

public class loanTable {


    public static void main(String[] args) {

        //Getting User Input
        ConsoleIO console = new ConsoleIO();

        System.out.println("Amount of the loan: ");
        double p = console.readDouble();
        System.out.println("Principal = $" + p);

        System.out.println("The length of loan in years: ");
        int time = console.readInt();
        System.out.println("Time = " + time + " years");

        System.out.println("A low interest rate in %: ");
        double lowInt = console.readDouble() / 100;
        System.out.println("Low rate = " + lowInt + "%");

        System.out.println("A high interest rate in %: ");
        double highInt = console.readDouble() / 100;
        System.out.println("High rate = " + highInt + "%");

        //While Loop
        while (lowInt <= highInt) {

            double k = lowInt / 12;
            double n = time * 12;
            double c = Math.pow((1 + k), n);
            double a = (p * k * c) / (c - 1);

            System.out.println("Annual interest rate: " + lowInt * 100);
            System.out.println("Monthly Payment: " + Format.left(a, 2, 2));

            //Incrementing by .25
            lowInt += (0.25 / 100);
        }
    }

}
