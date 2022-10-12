package u24_bauernhof;

public class Bauernhof {

    public static void main(String[] args) {
        Tier tier1 = new Kuh("Kuh 1", -300, 0);
        Tier tier2 = new Schnecke("Schnecke 1", 20, false);

        System.out.println(tier1);
        System.out.println(tier2);

        tier1.laufen();
        tier2.laufen();
    }
}
