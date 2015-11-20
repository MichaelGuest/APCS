package Statistics;

import chn.util.*;

public class Statistics {
    int[] data = new int[1000];

    public Statistics() {
        FileInput inFile = new FileInput("numbers.txt");
        int index = 0;

        while (inFile.hasMoreTokens()) {
            int x = inFile.readInt();
            data[index] = x;
            index++;
        }
        inFile.close();
    }

    public double average() {
        double sum = 0;
        for (int a = 0; a < data.length; a++) {
            sum += data[a];
        }
        return sum / (data.length - 1);
    }

    public double sDev() {
        double ans = 0;
        double sum = 0;
        double num = 0;
        double avg = average();
        for (int x = 0; x < data.length; x++) {
            num = data[x];
            sum += Math.pow(num - average(), 2);
        }
        ans = Math.sqrt(sum / (data.length - 1));
        return ans;
    }

    public String mode() {
        int[] mode = new int[101];
        String modeValues = "";
        for (int elem : data) {
            mode[elem]++;
        }

        int MAX = 0, index = 0;
        for (int elem : mode) {
            if (elem > MAX) {
                MAX = elem;
            }
            index++;
        }
        index = 0;
        for (int elem : mode) {

            if (elem == MAX) {
                modeValues += " " + index;
            }
            index++;
        }
        return modeValues;
    }


    public static void main(String[] args) {
        Statistics stats = new Statistics();
        System.out.println("average " + stats.average());
        System.out.println("sDeviation " + stats.sDev());
        System.out.println("mode " + stats.mode());
    }
}
