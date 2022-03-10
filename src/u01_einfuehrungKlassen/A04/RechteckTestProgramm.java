package u01_einfuehrungKlassen.A04;

import util.Eingabe;

public class RechteckTestProgramm {

    public static void main(String[] args) {
        Rechteck r = new Rechteck();
        r.setBreite(Eingabe.readInt("Breite: "));
        r.setLaenge(Eingabe.readInt("Laenge: "));
        r.setXPos(5);
        System.out.println(r.berechneFlaeche());
        r.druckeRechteck();
    }
}