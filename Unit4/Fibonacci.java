package Fibonacci;

public class Fibonacci {
    public static int rec(int num) {
        if (num == 1 || num == 0) {
            return num;
        } else {
            return rec(num - 1) + rec(num - 2);
        }
    }


    public static int nonRecFib(int num) {
        if (num == 1 || num == 0) {
            return 1;
        }
        int fibol = 0, fibo2 = 1, fibonacci = 3;
        for (int i = 2; i <= num; i++) {
            fibonacci = fibol + fibo2;
            fibol = fibo2;
            fibo2 = fibonacci;
        }
        return fibonacci;
    }

    public static int mult(int a, int b) {
        if (b == 0) {
            return 0;
        } else if (b == 1) {
            return a;
        } else
            return a + mult(a, b - 1);
    }


    public static void main(String[] args) {

        int recursive0 = rec(0);
        System.out.println(recursive0);

        int recursive3 = rec(3);
        System.out.println(recursive3);

        int recursive11 = rec(11);
        System.out.println(recursive11);


        int nonrecursive1 = nonRecFib(1);
        System.out.println(nonrecursive1);

        int nonrecursive5 = nonRecFib(5);
        System.out.println(nonrecursive5);

        int nonrecursive14 = nonRecFib(14);
        System.out.println(nonrecursive14);


        int recursivemulti = mult(0, 4);
        System.out.println(recursivemulti);

        int recursivemulti2 = mult(3, 1);
        System.out.println(recursivemulti2);

        int recursivemulti3 = mult(7, 8);
        System.out.println(recursivemulti3);
    }


}
