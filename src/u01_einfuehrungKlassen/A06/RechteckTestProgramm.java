package u01_einfuehrungKlassen.A06;

public class RechteckTestProgramm {

    public static void main(String[] args) {

        Rechteck r = new Rechteck();
        r.setBreite(5);
        r.setLaenge(5);
        boolean filled = false;
        for(int i = 0; true; i++) {
            r.setXPos(i);
            r.setAusgefuellt(filled = !filled);
            r.druckeRechteck();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i >= 40) i = 0;
        }
    }
}

