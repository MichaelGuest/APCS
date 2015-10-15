package Grades;

import chn.util.*;
import apcslib.*;


public class Grades {

    public static void main(String[] args) {

        ConsoleIO console = new ConsoleIO();

        int myNumGrades = 0;
        int myTotalPoints = 0;
        boolean hasF = false;
        boolean done = false;
        do {
            System.out.println("Enter Letter Grades for Eligibility(Press q to quit):");
            String grades = console.readLine();
            char grade = grades.charAt(0);

            switch (grade) {
                case 'a':
                case 'A':
                    myTotalPoints += 4;
                    myNumGrades++;
                    break;

                case 'b':
                case 'B':
                    myTotalPoints += 3;
                    myNumGrades++;
                    break;

                case 'c':
                case 'C':
                    myTotalPoints += 2;
                    myNumGrades++;
                    break;

                case 'd':
                case 'D':
                    myTotalPoints += 1;
                    myNumGrades++;
                    break;

                case 'f':
                case 'F':
                    myTotalPoints += 0;
                    myNumGrades++;
                    hasF = true;
                    break;

                case 'q':
                case 'Q':
                default:
                    done = true;
                    break;
            }
        }
        //while (grade != 'q' && grade != 'Q');
        while (done = false);
        double GPA = myTotalPoints / myNumGrades;

        if (myNumGrades < 4) {
            System.out.println("Ineligible, taking less than 4 classes");
        } else if (GPA >= 2.0 && hasF) {
            System.out.println("Ineligible, GPA above 2.0 but has F grade");
        } else if (GPA < 2.0 && hasF) {
            System.out.println("Ineligible, GPA below 2.0 but has F grade");
        } else if (GPA < 2.0) {
            System.out.println("Ineligible, GPA below 2.0");
        } else if (GPA >= 2.0) {
            System.out.println("Eligible");
        }
        System.out.print("GPA = " + GPA);
    }
}


