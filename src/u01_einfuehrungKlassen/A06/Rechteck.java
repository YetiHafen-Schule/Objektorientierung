package u01_einfuehrungKlassen.A06;

public class Rechteck {

    private int laenge = 5;
    private int breite = 10;
    private int xPos;
    private boolean ausgefuellt;

    public int berechneFlaeche() {
        return laenge * breite;
    }

    public void druckeRechteck() {
        System.out.print("\n\n\n\n");
        String offset = "";
        for(int offs = 0; offs < xPos; offs++)
            offset += "  ";

        if(ausgefuellt) {
            for(int y = 0; y < laenge; y++) {
                System.out.println(offset);
                for (int x = 0; x < breite; x++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else {
            StringBuilder template = new StringBuilder("+ ");
            for(int i = 1; i < breite - 1; i++) {
                template.append("- ");
            }
            template.append("+");
            String bounds = template.toString();
            String inner = template.toString().replace("+", "|").replace("-", " ");

            System.out.println(offset);

            System.out.println(bounds);

            for(int i = 0; i < laenge - 2; i++) {
                System.out.println(offset);
                System.out.println(inner);
            }
            System.out.println(offset);
            System.out.println(bounds);
        }
    }

    public void setAusgefuellt(boolean ausgefuellt) {
        this.ausgefuellt = ausgefuellt;
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
