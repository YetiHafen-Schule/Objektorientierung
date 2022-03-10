package u01_einfuehrungKlassen.A03;

public class Rechteck {

    private int laenge = 5;
    private int breite = 10;

    public int berechneFlaeche() {
        return laenge * breite;
    }

    public void druckeRechteck() {
        for(int y = 0; y < laenge; y++) {
            for(int x = 0; x < breite; x++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }
}