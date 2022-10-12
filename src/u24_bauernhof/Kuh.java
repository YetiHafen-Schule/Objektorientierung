package u24_bauernhof;

public class Kuh extends Tier {

    private int futtermenge;

    public Kuh(String name, int alter, int futtermenge) {
        super(name, alter, "Heu", "Kuh");
        this.futtermenge = futtermenge;
    }

    @Override
    public void laufen() {
        System.out.println("Die Kuh " + getName() + " läuft");
    }

    @Override
    public String toString() {
        return super.toString() + """
                Diese Kuh frisst %d kg Heu
                """.formatted(futtermenge);
    }
}
