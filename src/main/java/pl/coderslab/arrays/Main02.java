package pl.coderslab.arrays;

import java.util.Random;

public class Main02 {

    public static void main(String[] args) {
        Main02 m = new Main02();
        m.printMinimalValueFromArray(m.createTableWithRandomNumber());

    }
    public int[] createTableWithRandomNumber() {
        Random random = new Random();
        int[] randomTable = new int[100];
        for (int i = 0; i < randomTable.length; i++) {
            randomTable[i] = random.nextInt( 101);
        }
        return randomTable;
    }
    public void printMinimalValueFromArray(int[] array) {
        int min = 100;
        for (int number : array) {
            if
            (number < min) {
                min = number;
            }
        }
        System.out.println(min);

    }
}
