package u11_einsZuEinsAssoziation;

public class Verwaltung {
    public static void main(String[] args) {
        Mitarbeiter m1 = new Mitarbeiter();
        m1.setName("Anders");

        Kunde k1 = new Kunde(m1);
        k1.setName("Schulz");

        System.out.println("Herr " + k1.getName() + " wird betreut von Herrn " + m1.getName());
        System.out.println("Herr " + k1.getName() + " betreut Herrn " + k1.getName());
    }
}