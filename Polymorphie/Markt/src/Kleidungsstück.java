public class Kleidungsstück extends Ware{
    protected int Groesse;
    protected String Art;
    protected String Farbe;
    protected String Material;

    public Kleidungsstück(double preis, int anzahl, int groesse, String art, String farbe, String material){
        super(preis, anzahl);
        Groesse = groesse;
        Art = art;
        Farbe = farbe;
        Material = material;
    }

    public int getGroesse() {
        return Groesse;
    }
    public String getArt() {
        return Art;
    }
    public String getFarbe() {
        return Farbe;
    }
    public String getMaterial() {
        return Material;
    }

    public void gebeKleidungsstückAus(){
        System.out.println(getAnzahl() + " " + getArt() + " kostet " + getPreis() + "€. Es ist " + getFarbe() +
                " und hat Größe " + getGroesse() + ". Das " + getArt() + " ist aus " + getMaterial() + ".");
    }
}
