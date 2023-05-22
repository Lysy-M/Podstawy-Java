package pl.coderslab.methods;

public class Main06 {

    public static void main(String[] args) {
        int age = 16;
        boolean isMature = checkMaturity(age);
        if (isMature) {
            System.out.println("Użytkownik jest pełnoletni.");
        } else {
            System.out.println("Użytkownik nie jest pełnoletni.");
        }
    }
    /**
     * Metoda sprawdza, czy użytkownik jest pełnoletni na podstawie jego wieku.
     * Użytkownik jest pełnoletni, jeśli jego wiek wynosi 18 lub więcej.
     * @param age wiek użytkownika
     * @return true, jeśli użytkownik jest pełnoletni, false w przeciwnym przypadku
     */
    public static boolean checkMaturity(int age) {
        return age >= 18;
    }
}

