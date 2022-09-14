public class Ware {
    private double Preis;
    private int Anzahl;

    public Ware(double preis, int anzahl){
        Preis = preis;
        Anzahl = anzahl;
    }

    public double getPreis() {
        return Preis;
    }
    public int getAnzahl() {
        return Anzahl;
    }
}
