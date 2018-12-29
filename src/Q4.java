/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tarc
 */
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i <= 100; ++i) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        return isPrime(n, n - 1);
    }

    private static boolean isPrime(int n, int divisor) {
        if (n == 1) {
            return false;
        }
        if (divisor == 1) {
            return true;
        }

        if (n % divisor == 0) {
            return false;
        }
        return isPrime(n, divisor - 1);
    }
}
