public class Mensch {

    private String name;
    private int alter;
    private Haustier haustier;

    public Mensch(String p_name, int p_alter) {
        this.name = p_name;
        this.alter = p_alter;
    }

    public void vorstellen() {
        System.out.println("Meine Vorstellung:");
        System.out.println("---");
        System.out.println("Name:" + this.name);
        System.out.println("Alter:" + this.alter);
        if (this.haustier == null) {
            System.out.println("Ich habe kein Haustier.");
        } else {
            System.out.println("Mein Haustier heißt: " + haustier.name);
            if (this.haustier.anzahlKunststuecke() == 1) {
                System.out.println("Mein Haustier kann: " + haustier.anzahlKunststuecke() + " Kunststück, nämlich: " + haustier.getKunststueck());
            }
            else {
                System.out.println("Mein Haustier kann: " + haustier.anzahlKunststuecke() + " Kunststücke, nämlich: " + haustier.getKunststueck());
            }
            if (this.haustier.getLieblingsmensch() == null) {
                System.out.println("Mein Haustier hat keinen Lieblingsmensch.");
            }
            else {
                System.out.println("Der Lieblingsmensch meines Haustiers ist: " + haustier.getLieblingsmensch().name);
            }
        }
        System.out.println("");
    }

    public void adoptieren(Haustier p_haustier) {
            this.haustier = p_haustier;
            this.haustier.setBesitzer(this);
    }


}
