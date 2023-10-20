import java.util.List;
import java.util.ArrayList;

public class Haustier {

    private String art;
    public String name;
    private List<String> kunststueck = new ArrayList<>();
    private Mensch besitzer;
    private Mensch lieblingsmensch;

    public Haustier(String p_art, String p_name, String p_kunststueck) {
        art = p_art;
        name = p_name;
        kunststueck.add(p_kunststueck);
    }

    public void nameWechseln(String p_neuerName) {
        this.name = p_neuerName;
    }

    public void kunststueckErlernen(String p_kunststueck) {
        if (this.kunststueck.get(0) == "") {
            this.kunststueck.set(0, p_kunststueck);
        }
        else {
            this.kunststueck.add(p_kunststueck);
        }

    }

    public List<String> getKunststueck() {
        return this.kunststueck;
    }

    public void setLieblingsmensch(Mensch p_lieblingsmensch) {
        this.lieblingsmensch = p_lieblingsmensch;
    }

    public Mensch getLieblingsmensch() {
        return this.lieblingsmensch;
    }

    public int anzahlKunststuecke() {
        return this.kunststueck.size();
    }

    public void setBesitzer(Mensch p_besitzer) {
        this.besitzer = p_besitzer;
    }

}
