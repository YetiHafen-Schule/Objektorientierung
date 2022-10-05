package u22_mitglied;

public class Mitglied extends Person {

    private int alter;

    public Mitglied(String name, int alter) {
        super(name);
        this.alter = alter;
    }

    public int getAlter() {
        return alter;
    }

    @Override
    public String toString() {
        return "Mitglied:[alter = %d, name = %s]".formatted(alter, getName());
    }
}
