package Squeeze;

import chn.util.*;

public class Squeeze {
    public static void main(String[] args) {
        FileInput inFile = new FileInput("inFile.txt");
        FileOutput outFile = new FileOutput("outFile.txt");
        String line;
        while (inFile.hasMoreLines()) {
            line = inFile.readLine();
            int spaces = 0;
            for (int a = 0; a < line.length(); a++) {
                if (line.charAt(a) == ' ') {
                    spaces++;
                } else {
                    break;
                }
            }
            line = line.trim();
            outFile.println(spaces + line);
        }
        outFile.close();
        inFile.close();
    }
}

