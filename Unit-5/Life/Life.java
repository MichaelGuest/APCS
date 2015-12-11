package Life;

import chn.util.FileInput;

public class Life {

    private int[][] dish =  new int[22][22];
    private int[][] scratch = new int[22][22];

    public void dish() {
        System.out.print("     ");
        for (int i = 0; i < 20; i++){
            System.out.print(i);
        }
        System.out.println();
        for (int row = 1; row <= dish.length - 1; row++) {
            System.out.print(row + "     ");
            for (int col = 1; col < dish[row].length - 1; col++) {
                if (dish[row][col] == 1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public Life() {
        FileInput infile = new FileInput("life100.txt");
        scratch = new int[22][22];
        dish = new int[22][22];
        infile.readInt();
        while (infile.hasMoreTokens()) {
            int row = infile.readInt();
            int col = infile.readInt();
            scratch[row][col] = 1;
        }
        infile.close();
        equals();
    }

    public void equals() {
        for (int x = 0; x < 22; x++) {
            for (int y = 0; y < 22; y++) {
                scratch[x][y] = dish[x][y];
            }
        }
    }

    public int countNeighbors(int row, int col) {
        int count = 0;
        for (int r = row - 1; r <= row + 1; r++) {
            for (int c = col - 1; c <= col + 1; c++) {
                if (scratch[r][c] == 1) {
                    count++;
                }
            }
        }
        if (scratch[row][col] == 1) {
            count--;
        }
        return count;
    }

    public void nextGen() {
        for (int row = 1; row < 20; row++) {
            for (int col = 1; col < 20; col++) {
                int count = countNeighbors(row, col);
                if (count == 3 && scratch[row][col] == 0) {
                    dish[row][col] = 1;
                }
                if (count == 1 || count == 0) {
                    dish[row][col] = 0;
                } else if ((count == 2 || count == 3) && scratch[row][col] == 1) {

                }
            }
        }
        equals();
    }

    public void run(int amount) {
        for (int i = 0; i < amount; i++) {
            dish();
            nextGen();

        }

    }

    public static void main(String[] args) {
        Life life = new Life();
        life.run(5);

    }

}
