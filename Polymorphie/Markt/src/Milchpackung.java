public class Milchpackung extends Lebensmittel{
    protected boolean Hocherhitzt;
    protected String Typ;

    public Milchpackung(double preis, int anzahl, int maxLagerTemperatur, String verfallDatum, boolean hocherhitzt, String typ){
        super(preis, anzahl, maxLagerTemperatur, verfallDatum);
        Hocherhitzt = hocherhitzt;
        Typ = typ;
    }

    public boolean isHocherhitzt() {
        return Hocherhitzt;
    }

    public String getTyp() {
        return Typ;
    }

    public void gebeMilchpackungAus(){
        System.out.println(getAnzahl() + " " + getTyp() + " kostet " + getPreis() + "€. Bitte lagern Sie die " +
                getTyp() + " bei höchstens " + getMaxLagerTemperatur() + "°C und verzehren Sie diese bis spätestens " +
                getVerfallDatum() + ". Die " + getTyp() + " ist " + isHocherhitzt() + ".");
    }
}