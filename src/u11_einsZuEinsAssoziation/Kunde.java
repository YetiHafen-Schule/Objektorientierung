package u11_einsZuEinsAssoziation;

public class Kunde {

    private String name;
    private Mitarbeiter meinBetreuer;


    public Kunde(Mitarbeiter meinBetreuer) {
        this.meinBetreuer = meinBetreuer;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mitarbeiter getMeinBetreuer() {
        return this.meinBetreuer;
    }

    public void setMeinBetreuer(Mitarbeiter meinBetreuer) {
        this.meinBetreuer = meinBetreuer;
    }
}