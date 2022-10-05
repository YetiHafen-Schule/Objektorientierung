package u23_woIstDerFehler;

public class EineTestKlasse {
    public static void main(String[] args) {
        FragWuerdigeKlasse einObjekt = new VervollstaendigungsKlasse();
        einObjekt.methodeEins();
        einObjekt.methodeZwei();
    }
}

abstract class FragWuerdigeKlasse {
    public void methodeEins() {
        System.out.println("Ich bin Methode_1.");
    }
    public abstract void methodeZwei();
}

class VervollstaendigungsKlasse extends FragWuerdigeKlasse {

    @Override
    public void methodeZwei() {
        System.out.println("Ich bin Methode_2.");
    }
}
