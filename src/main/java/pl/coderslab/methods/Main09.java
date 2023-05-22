package pl.coderslab.methods;

public class Main09 {

    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.println(n + "! = " + result);
    }
    /**
     * Metoda oblicza wartość n!, czyli wynik mnożenia wszystkich liczb naturalnych w zakresie 1...n.
     * @param n liczba naturalna
     * @return wartość n!
     */
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}


