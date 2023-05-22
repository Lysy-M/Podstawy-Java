package pl.coderslab.methods;

public class Main07 {

    public static void main(String[] args) {
        int number = 6;
        String result = checkEvenOdd(number);
        System.out.println("Liczba " + number + " jest " + result + ".");
    }
    /**
     * Metoda sprawdza, czy liczba jest parzysta czy nieparzysta.
     * @param number liczba do sprawdzenia
     * @return "even", jeśli liczba jest parzysta, "odd", jeśli liczba jest nieparzysta
     */
    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
}

