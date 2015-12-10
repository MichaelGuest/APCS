package Life;

import chn.util.FileInput;

public class Life {
    private int col = 0;
    private int row = 0;
    private int[][] dish;
private int[][]scratch;
    public void dish() {
        System.out.print("            ");
        for (int row = 1; row < dish[row].length; row++) {
            for (int col = 1; col < dish[col].length; col++) {
                if (dish[row][col] == 1) {
                    System.out.println("*");
                } else {
                    System.out.println(' ');
                }
                System.out.println("   ");
            }
        }
    }

    public Life() {
        FileInput infile = new FileInput("life100.txt");
        scratch = new int[22][22];
        dish = new int[22][22];
        while (infile.hasMoreTokens()) {
            row.infile.readint();
            col = infile.readint();
            dish[row][col] = 1;
        }
    }
    public void equals(){
        for (int x = 0; x < 22; x++){
            for (int y = 0; y < 22; y++){

            }
        }
    }

    public void print() {

    }

    public int countNeighbors(int row, int col) {
        int count = 0;
        for (int r = row - 1; r <= row + 1; r++) {
            for (int c = col - 1; c <= col + 1; c++) {
                if (dish[r][c] == 1) {
                    count++;
                }
            }
        }
        if (dish[row][col] == 1) {
            count--;
        }
        return count;
    }

    public void nextGen() {
        for (int row = 1; row < 20; row++) {
            for (int col = 1; col < 20; col++) {
                int count = countNeighbors(row, col);
                if (count == 3 && dish[row][col] == 0) {
                    dish[row][col] = 1;
                }
                if (count == 1 || count == 0) {
                    dish[row][col] = 0;
                }
                else if ((count == 2 || count == 3) && dish[row][col] == 1) {

                }

               /*
               * First: Get the amt of neigbors for current cell
               *
               * Apply Rules of Life
               *
               * Every empty cell with three living neighbors will come to life in the next generation (a "birth").

Any cell with one or zero neighbors will die of loneliness, while any cell with four or more neighbors will die from overcrowding (a "death").

Any cell with two or three neighbors will live into the next generation (no change).

All births and deaths occur simultaneously.
               * */
            }
        }
    }

    public void run(int amount) {

    }

    public static void main(String[] args) {

    }

}
