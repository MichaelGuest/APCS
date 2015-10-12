package pictures;

import apcslib.Format;

public class Pictures {
    public static void printTable(int rows, int cols) {
        System.out.print("            ");
        for (int c = 1; c <= cols; c++) {
            System.out.print(c + "      ");
        }
        System.out.println();
        System.out.println();

        for (int r = 1; r <= rows; r++) {
            System.out.print(r + "        ");

            for (int c = 1; c <= cols; c++) {
                System.out.print(Format.center(r * c, 7));
            }
            System.out.println();
        }
        System.out.print("__________________________________________________________________________________________________");
    }

    public static void pyramid(int lines) {
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < lines - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
