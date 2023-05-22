package pl.coderslab.methods;

public class Main10 {

    public static void main(String[] args) {
        int goalsA1 = 0;
        int goalsB1 = 2;
        int goalsA2 = 3;
        int goalsB2 = 1;

        String result = footballWin(goalsA1, goalsB1, goalsA2, goalsB2);

        System.out.println("Wynik dwumeczu: " + result);
    }
    public static String footballWin(int goalsA1, int goalsB1, int goalsA2, int goalsB2) {
        int totalGoalsA = goalsA1 + goalsA2;
        int totalGoalsB = goalsB1 + goalsB2;

        if (totalGoalsA > totalGoalsB) {
            return "1";
        } else if (totalGoalsB > totalGoalsA) {
            return "2";
        } else {
            if (goalsA2 > goalsB1) {
                return "1";
            } else if (goalsB1 > goalsA2) {
                return "2";
            } else {
                return "X";
            }
        }
    }
}


