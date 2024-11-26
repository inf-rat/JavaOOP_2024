import java.util.Scanner; // Die Scanner-Klasse importieren

public class Aufg1UserInput {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in); // Scanner-Objekt erzeugen
        //System.out.println("Hallo, wer bist du denn?");
        String userName = scObj.nextLine(); // User-Input einlesen
        // a)  wenn man nix angibt, das Programm wird beendet.//
        // b)
//        if (userName.isEmpty()) {
//            System.out.println("Fehler! Es wurde kein Name angegeben.");
//        } else {
//            System.out.println("Welcome " + userName);
//        }

        // c)
        while (userName.isEmpty()) {
            System.out.println("Bitte gib deinen Namen ein: ");
            userName = scObj.nextLine().trim();
            if (userName.isEmpty()) {
                System.out.println("Die Eingabe darf nicht leer sein. Bitte versuche es erneut.");
            } else {
                System.out.println("Welcome " + userName);
            }
        }
    }
}

