package PermutationGenerator;

import java.util.*;

public class PermutationGenerator {
    public static void main(String args[]) {
        List<Integer> permutation = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        for (int i = 0; i < 10; i++) {
            Collections.shuffle(permutation);
            System.out.println("list " + (i + 1) + ":  " + permutation);
            System.out.println(" Sum of first and last: " + (permutation.get(0) + permutation.get(9)));
        }
    }
}

