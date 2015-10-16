package Grades;

import chn.util.*;
import apcslib.*;
import apcslib.*;

public class Grades {

    public static void main(String[] args) {

        ConsoleIO console = new ConsoleIO();

        int myNumGrades = 0;
        int myTotalPoints = 0;
        char grade = 'p';
        do {
            System.out.println("Enter Letter Grades for Eligibility(Press q to quit):");
            String grades = console.readLine();
            grade = grades.charAt(0);

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
                    break;

                case 'q':
                case 'Q':
                    break;
                    
                default:
                	break;
            }
        }
        while (grade != 'q' && grade != 'Q');
        double GPA = (double)myTotalPoints / (double)myNumGrades;

        if (myNumGrades < 4) {
            System.out.println("Ineligible, taking less than 4 classes");
        } else if (GPA >= 2.0) {
            System.out.println("Ineligible, GPA above 2.0 but has F grade");
        } else if (GPA < 2.0) {
            System.out.println("Ineligible, GPA below 2.0 but has F grade");
        } else if (GPA < 2.0) {
            System.out.println("Ineligible, GPA below 2.0");
        } else if (GPA >= 2.0) {
            System.out.println("Eligible");
        }
        System.out.print("GPA = " + Format.left((GPA),5,2));
    }
}

