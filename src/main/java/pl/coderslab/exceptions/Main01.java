package pl.coderslab.exceptions;


public class Main01 {

    public static void main(String[] args) {
        System.out.println(factorial(5));

        try {
            System.out.println(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    static int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("number has to be positive");
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
