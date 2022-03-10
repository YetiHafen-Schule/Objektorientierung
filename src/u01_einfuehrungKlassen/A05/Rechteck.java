package u01_einfuehrungKlassen.A05;

public class Rechteck {

    private int laenge = 5;
    private int breite = 10;
    private int xPos;

    public int berechneFlaeche() {
        return laenge * breite;
    }

    public void druckeRechteck() {
        System.out.print("\n\u008D");
        for(int y = 0; y < laenge; y++) {
            for(int offs = 0; offs < xPos; offs++)
                System.out.print("  ");
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

    public void setXPos(int xPos) {
        this.xPos = xPos;
    }
}