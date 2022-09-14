package u12_beziehungZuEinemObjekt;

public class Verwaltung {

    public static void main(String[] args) {
        Konto k1 = new Konto(4711);
        Mitglied m1 = new Mitglied("Kek", -4, k1);

        System.out.println("Name: " + m1.getName());
        System.out.println("Alter: " + m1.getAlter());
        System.out.println("KontoNr: " + m1.getMeinKonto().getKontoNr());
    }
}
