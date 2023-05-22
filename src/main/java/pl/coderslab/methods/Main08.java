package pl.coderslab.methods;

public class Main08 {
    public static void main(String[] args) {
        int a = 220;
        int b = 21434;
        int c = 1305;
        int max = maxOfThree(a, b, c);
        System.out.println(max);
    }
    public static int maxOfThree(int a, int b, int c) {

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}