package IRSS;

public class Taxpayer {

    private char myStatus;
    private double myIncome;

    public Taxpayer(char status, double income) {
        myStatus = status;
        myIncome = income;
    }

    public double getIncome() {
        return myIncome;
    }

    public char getStatus() {
        if (myStatus == 's' || myStatus == 'm') {
            if (myStatus == 's') {
                System.out.println("Single");
            } else if (myStatus == 'm') {
                System.out.println("Married");
            }
        }
        return myStatus;
    }

    public double calculateTax() {
        if (myStatus == 's' || myStatus == 'm') {
            if (myStatus == 's') {
                return singleTax();
            } else if (myStatus == 'm') {
                return marriedTax();
            }
        }
        return myIncome;
    }


    private double marriedTax() {


        if (myIncome <= 45200) {
            return myIncome * 0.15;

        } else if (45200 < myIncome && myIncome <= 109250) {
            myIncome = (myIncome - 45200) * 0.275;
            return 6780.0 + myIncome;

        } else if (109250 < myIncome && myIncome <= 166500) {
            myIncome = (myIncome - 109250) * 0.305;
            return 24393.75 + myIncome;

        } else if (166500 < myIncome && myIncome <= 297350) {
            myIncome = (myIncome - 166500) * 0.355;
            return 41855.0 + myIncome;

        } else if (297350 < myIncome) {
            myIncome = (myIncome - 297350) * 0.391;
            return 88306.0 + myIncome;
        }
        return myIncome;
    }


    private double singleTax() {

        if (myIncome <= 27050) {
            return myIncome * 0.15;

        } else if (27050 < myIncome && myIncome <= 65550) {
            myIncome = (myIncome - 27050) * 0.275;
            return 4057.5 + myIncome;

        } else if (65550 < myIncome && myIncome <= 136750) {
            myIncome = (myIncome - 65550) * 0.305;
            return 14645.0 + myIncome;

        } else if (136750 < myIncome && myIncome <= 297350) {
            myIncome = (myIncome - 136750) * 0.355;
            return 36361.0 + myIncome;

        } else if (297350 < myIncome) {
            myIncome = (myIncome - 297350) * 0.391;
            return 93374.0 + myIncome;
        }
        return myIncome;
    }
}




