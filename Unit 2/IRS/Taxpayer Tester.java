package IRS;

import chn.util.ConsoleIO;

public class App {

    public static void main(String[] args) {
        ConsoleIO console = new ConsoleIO();

        String statusStr;
        System.out.println("Filing status: Single or Married");
        statusStr = console.readToken();
        char status = statusStr.charAt(0);

        System.out.println("Enter Taxable Income:");
        double income = console.readDouble();


        Taxpayer person = new Taxpayer(status, income);
        
        System.out.println(person.getStatus());
        System.out.println("Taxable income = $" + person.getIncome());
        System.out.println("Federal tax = $" + person.calculateTax());

    }
}




