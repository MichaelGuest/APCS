package Taxes;

import chn.util.ConsoleIO;
import apcslib.*;

class Taxes
{
    public static void main(String[] args)
    {
        int HoursWorked;

        double HourlyRate;
        double GP; //Gross Pay
        final double  FT; //Fed Tax
        final double FICA; //Social Security Tax
        final double ST; //State Tax
        double NP; //Net Pay


        ConsoleIO console = new ConsoleIO();

        System.out.print("Hours Worked ");
        HoursWorked = console.readInt();

        System.out.print("Hourly Rate ");
        HourlyRate = console.readDouble();

        GP = HoursWorked * HourlyRate;
        System.out.println(("Gross pay            ") + (Format.center(GP, 15, 2)));

        FT = GP * .15;
        System.out.println(("Federal tax (15%)    ") + (Format.center(FT, 15, 2)));

        FICA = GP * .08 ;
        System.out.println(("FICA (8%)            ") + (Format.center(FICA, 15, 2)));

        ST = GP * .04;
        System.out.println(("State tax (4%)       ") + (Format.center(ST, 15, 2)));

        NP = GP - FT - FICA - ST;
        System.out.println(("Net pay              ") + (Format.center(NP, 15, 2)));















    }
}
