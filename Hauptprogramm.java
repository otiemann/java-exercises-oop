public class Hauptprogramm {

    public static void main(String[] args) {
        Haustier henry = new Haustier("Katze", "Henry", "in der Sonne liegen");
        Mensch tina = new Mensch("Tina", 19);
        Mensch freddy = new Mensch("Freddy", 39);
        tina.adoptieren(henry);
        tina.vorstellen();
        Haustier gojira = new Haustier("Hund","", "");
        freddy.adoptieren(gojira);
        gojira.nameWechseln("Gojira");
        gojira.kunststueckErlernen("große Augen machen");
        gojira.setLieblingsmensch(tina);
        gojira.kunststueckErlernen("fressen");
        freddy.vorstellen();
        Mensch quinn = new Mensch("Quinn", 24);
        quinn.vorstellen();

    }

}