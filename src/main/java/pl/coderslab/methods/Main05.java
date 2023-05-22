package pl.coderslab.methods;


import java.text.DecimalFormat;

public class Main05 {
    public static void main(String[] args) {
        double gross = 100.0;
        double vat = 0.23;
        double netto = calculateNetto(gross, vat);
        System.out.println(netto);
    }

    public static double calculateNetto(double gross, double vat) {
        // obliczamy wartość netto odejmując od kwoty brutto wartość podatku VAT
        return gross / (1 + vat);

    }
}