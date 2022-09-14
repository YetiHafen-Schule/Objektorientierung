package u12_beziehungZuEinemObjekt;

public class Mitglied {

    private Konto meinKonto;
    private String name;
    private int alter;

    public Mitglied(String n, int a, Konto k) {
        this.name = n;
        this.alter = a;
        this.meinKonto = k;
    }

    public int getAlter() {
        return alter;
    }

    public Konto getMeinKonto() {
        return meinKonto;
    }

    public String getName() {
        return name;
    }
}
