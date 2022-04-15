public class Ware {
    private double Preis;
    private int Anzahl;

    public Ware(double preis, int anzahl){
        Preis = preis;
        Anzahl = anzahl;
    }

    public void setPreis(double preis) {
        Preis = preis;
    }
    public double getPreis() {
        return Preis;
    }
    public void setAnzahl(int anzahl) {
        Anzahl = anzahl;
    }
    public int getAnzahl() {
        return Anzahl;
    }
}
