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

    public void setGroesse(int groesse) {
        Groesse = groesse;
    }
    public int getGroesse() {
        return Groesse;
    }
    public void setArt(String art) {
        Art = art;
    }
    public String getArt() {
        return Art;
    }
    public void setFarbe(String farbe) {
        Farbe = farbe;
    }
    public String getFarbe() {
        return Farbe;
    }
    public void setMaterial(String material) {
        Material = material;
    }
    public String getMaterial() {
        return Material;
    }
}
