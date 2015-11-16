package Pictures;

import chn.util.*;

public class PicturesApp {
    public static void main(String[] args) {

        ConsoleIO keyboard = new ConsoleIO();

        Pictures picture = new Pictures();
        String get;

        Pictures.printTable(4, 6);
        get = keyboard.readLine(); // freezes the output screen to see the picture
        Pictures.printTable(11, 12);
        get = keyboard.readLine();
        Pictures.pyramid(10);
        get = keyboard.readLine();
        Pictures.pyramid(25);
        get = keyboard.readLine();

    }

}
