public class Lebensmittel extends Ware{
    protected int MaxLagerTemperatur;
    protected String VerfallDatum;

    public Lebensmittel(double preis, int anzahl, int maxLagerTemperatur, String verfallDatum){
        super(preis, anzahl);
        MaxLagerTemperatur = maxLagerTemperatur;
        VerfallDatum = verfallDatum;
    }

    public void setMaxLagerTemperatur(int maxLagerTemperatur) {
        MaxLagerTemperatur = maxLagerTemperatur;
    }
    public int getMaxLagerTemperatur() {
        return MaxLagerTemperatur;
    }
    public void setVerfallDatum(String verfallDatum) {
        VerfallDatum = verfallDatum;
    }
    public String getVerfallDatum() {
        return VerfallDatum;
    }
}
