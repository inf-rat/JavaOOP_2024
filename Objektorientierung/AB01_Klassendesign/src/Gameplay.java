public class Gameplay {
    private static Spielfeld feld = new Spielfeld();
    public static void main(String[] args) {
        feld.anzeigen();
        System.out.println(feld.findeFreienPlatz(4));
    }
}
