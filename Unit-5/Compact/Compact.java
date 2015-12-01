package Compact;
import java.util.Scanner;
import java.io.*;

public class Compact {
    public static void main(String[] args) {
        Compact startingArray = new Compact();
        startingArray.printList(startingArray.getArray());
    }

    public void printList(int[] list) {
        for (int index = 0; index < list.length; index++) {
            System.out.print(list[index] + "  ");
        }
        System.out.println();
        int nonZeroSize = 0;

        int last = list.length;

        for (int i = 0; i < last; ++i) {

            if (list[i] == 0) {
                last--;
                for (int j = i; j < last; ++j) {

                    list[j] = list[j + 1];
                }
            } else {
                ++nonZeroSize;
            }
        }
        for (int i = 0; i < nonZeroSize; ++i)
            System.out.print(" " + list[i]);
    }

    public int[] getArray() {
        int value;
        int count = 0;
        int[] scannedArray = new int[getListSize()];
        Scanner in;
        try {
            in = new Scanner(new File("Compact.txt"));
            while (in.hasNextInt()) {
                value = in.nextInt();
                scannedArray[count] = value;
                count++;
            }
        } catch (IOException z) {
            System.out.println("File Not Found");
        }

        return scannedArray;
    }

    public static int getListSize() {
        int count = 0;
        Scanner readText;
        try {
            readText = new Scanner(new File("Compact.txt"));
            while (readText.hasNextInt()) {
                count++;
                readText.nextInt();
            }
        } catch (IOException z) {
            System.out.println("File not found");
        }
        return count;
    }
}
