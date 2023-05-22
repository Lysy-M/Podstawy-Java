package pl.coderslab.arrays;

public class Main01 {

    public static void main(String[] args) {
        Main01 main01 = new Main01();
        main01.printArraysNumbers();
    }

    public String[] createBigArray() {
        String[] bigArray = new String[50];
        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = String.valueOf(i);
        }
        return bigArray;
    }

    public void printArraysNumbers() {
        String[] array = createBigArray();
        for (int i = 0; i < array.length; i++) {
            String valueToPrint = array[i];
            if (i >= 0 && i < 10) {
                valueToPrint = "0" + valueToPrint;
            }
            System.out.print(valueToPrint + " ");
        }
    }
}