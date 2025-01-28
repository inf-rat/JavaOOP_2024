public class Spielfeld {
    // Konstanten
    private static final byte SPALTEN = 7;
    private static final byte ZEILEN = 6;
    private static final char LEERES_SYMBOL = '◌';
    private static final char SYMBOL_1 = '●';
    private static final char SYMBOL_2 = '○';

    // Attribute
    private char[][] spielsteine = new char[ZEILEN][SPALTEN];

    // Konstruktor
    public Spielfeld() {
        for (int zeile = 0; zeile < ZEILEN; zeile++) {
            for (int spalte = 0; spalte < SPALTEN; spalte++) {
                spielsteine[zeile][spalte] = LEERES_SYMBOL;
            }
        }
    }

    // Methoden
    public void anzeigen() {
        for (int zeile = 0; zeile < ZEILEN; zeile++) {
            for (int spalte = 0; spalte < SPALTEN; spalte++) {
                System.out.print(spielsteine[zeile][spalte] + " ");
            }
            System.out.println();
        }
    }
    public int findeFreienPlatz(int spalte) {
        if (spalte < 0 || spalte >= SPALTEN) {
            return -1;
        }
        for (int zeile = ZEILEN - 1; zeile >= 0; zeile--) {
            if (spielsteine[zeile][spalte] == LEERES_SYMBOL) {
                return zeile;
            }
        }
        return -1;
    }
}
