package pl.coderslab.arrays;

import java.util.Arrays;

public class Main06 {

    public static void main(String[] args) {
        int[] numbers = {2, 3};
        int[] secondNumbers = {3, 4};
        int[] sums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            sums[i] = numbers[i] + secondNumbers[i];
        }

        System.out.println(Arrays.toString(sums));
    }
}



