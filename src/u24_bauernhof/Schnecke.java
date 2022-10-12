package u24_bauernhof;

public class Schnecke extends Tier {

    private boolean mitHaus;

    public Schnecke(String name, int alter, boolean mitHaus) {
        super(name, alter, "Salat", "Schnecke");
        this.mitHaus = mitHaus;
    }

    @Override
    public void laufen() {
        System.out.printf("Die Schnecke %s kriecht langsam\n", getName());
    }

    public boolean isMitHaus() {
        return mitHaus;
    }
}
