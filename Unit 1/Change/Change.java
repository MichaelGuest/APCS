package Change;

import chn.util.ConsoleIO;

class Change {

	public static void main(String[] args) {

		double purchase;
		double cash;
		double total;
		double quarters = 25;
		double dimes = 10;
		double nickels = 5;
		double pennies = 1;
	    

		ConsoleIO console = new ConsoleIO();

		System.out.print("Enter the amount of purchase:");
		purchase = console.readDouble();

		System.out.print("Amount of cash tendered:");
		cash = console.readDouble();

		System.out.println("Amount of coins needed ");
		total = cash - purchase;     
		total = total - (int)total;              
		int change = (int)(total * 100); 
		System.out.println((change) + (" cents = "));


		int q = (int) (change / quarters);
		change = (int) (change - (quarters * q));
		System.out.println("Quarters " + q);

		int d = (int) (change / dimes);
		change = (int) (change - (dimes * d));
		System.out.println("Dimes " + d);


		int n = (int) (change / nickels);
		change = (int) (change - (nickels * n));
		System.out.println("Nickels " + n);

		int p = (int) (change / pennies);
		change = (int) (change - (quarters * p));
		System.out.println("Pennies " + p);

	}


}

