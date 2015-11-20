package Statistics;

import chn.util.FileInput;

public class Statistics {
    Fileinput inFile = new Fileinput("numbers.txt");
    int[] data = new int[1000];
    int index = 0;
    public Statistics(){
        while(inFile.hasMoreToekns()){
            int x = inFile.readInt;
            data[index] = x;
            index++;
        }
        inFile.close();
    }

    public double average() {
        double sum = 0;
        return average();
    }

    public double sDeviation() {
        return sDeviation();
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
        
    }
}
