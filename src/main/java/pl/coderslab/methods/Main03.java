package pl.coderslab.methods;


public class Main03 {
    public static void main(String[] args) {
        double pln = 100;
        double usd = convertToUsd(pln);
        System.out.printf("%.2f usd", usd);
    }

    public static double convertToUsd(double pln) {
        double usdRate = 4.08;
        return pln / usdRate;
    }
}