package Permutationsgenerator;

import java.util.*;

public class PermutationsGenerator {
    public static void main(String args[]) {

        for (int i = 0; i < 10; i++) {
            ArrayList<Integer> perm;
            perm = perm();
            System.out.println(perm + " " + (perm.get(0) + perm.get(perm.size() - 1)));
        }
    }

    public static ArrayList<Integer> perm() {
        ArrayList<Integer> permutation = new ArrayList<Integer>();
        for (int x = 1; x <= 10; x++) {
            permutation.add(x);
        }
        ArrayList<Integer> newPerm = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int integer = (int) (permutation.size() * Math.random());
            int num = permutation.get(integer);
            newPerm.add(num);
            permutation.remove(integer);
        }
        return newPerm;
    }
}

