public class Milchpackung extends Lebensmittel{
    protected boolean Hocherhitzt;
    protected String Typ;

    public Milchpackung(double preis, int anzahl, int maxLagerTemperatur, String verfallDatum, boolean hocherhitzt, String typ){
        super(preis, anzahl, maxLagerTemperatur, verfallDatum);
        Hocherhitzt = hocherhitzt;
        Typ = typ;
    }

    public void setHocherhitzt(boolean hocherhitzt) {
        Hocherhitzt = hocherhitzt;
    }
    public boolean isHocherhitzt() {
        return Hocherhitzt;
    }
    public void setTyp(String typ) {
        Typ = typ;
    }
    public String getTyp() {
        return Typ;
    }
}
