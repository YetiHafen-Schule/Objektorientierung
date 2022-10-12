package u24_bauernhof;

public abstract class Tier {
    private String name;
    private int alter;
    private String futter;
    private String tierart;

    public Tier(String name, int alter, String futter, String tierart) {
        this.name = name;
        this.alter = alter;
        this.futter = futter;
        this.tierart = tierart;
    }

    @Override
    public String toString() {
        return """
                Tierart: %s,
                Name: %s,
                Alter: %d,
                Futter: %s,
                """.formatted(tierart, name, alter, futter);
    }

    public abstract void laufen();

    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    public String getFutter() {
        return futter;
    }

    public String getTierart() {
        return tierart;
    }
}
