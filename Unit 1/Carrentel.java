package carrentel;
import chn.util.ConsoleIO;

class Carrentel {

    public static void main(String[] args) {


        String carLetters;
        String Make;
        String Model;
        int carNumber;
        int total;
    

        ConsoleIO console = new ConsoleIO();
        System.out.print("Enter license plate (3 letters - 3 digits) --> ");
        carLetters = console.readToken();
        carNumber = console.readInt();

        System.out.print("Enter Make");
        Make = console.readToken();
        System.out.print("Enter Model");
        Model = console.readToken();

        char c1 = carLetters.charAt(0);
        char c2 = carLetters.charAt(1);
        char c3 = carLetters.charAt(2);
        total = c1 + c2 + c3 + carNumber;
        carNumber = total % 26;
        char letter = (char)(carNumber+65);

        System.out.println(("Make = ") + (Make));
        System.out.println(("Model = ") + (Model));
        System.out.println("RJK = " + letter + total);




    }

}
