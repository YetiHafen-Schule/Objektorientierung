package u11_einsZuEinsAssoziation;

public class Mitarbeiter {
    private String name;
    private Kunde meinKunde;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Kunde getMeinKunde() {
        return this.meinKunde;
    }

    public void setMeinKunde(Kunde meinKunde) {
        this.meinKunde = meinKunde;
    }
}