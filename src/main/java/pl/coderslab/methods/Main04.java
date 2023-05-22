package pl.coderslab.methods;

public class Main04 {

    public static void main(String[] args) {

        String name = "Mateusz";
        String surname = "Morawiecki";
        String nickname = "Przygłup";
        String fullName = createName(name, surname, nickname);
        System.out.println(fullName);
    }

    public static String createName(String name, String surname, String nickname) {
        return name + " " + nickname + " " + surname;
    }
}


