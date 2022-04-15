public class Milchpackung extends Lebensmittel{
    protected boolean Hocherhitzt;
    protected String Typ;
    protected String fragehocherhitzt;

    public Milchpackung(double preis, int anzahl, int maxLagerTemperatur, String verfallDatum, boolean hocherhitzt, String typ){
        super(preis, anzahl, maxLagerTemperatur, verfallDatum);
        Hocherhitzt = hocherhitzt;
        Typ = typ;
    }

    public void setHocherhitzt(boolean hocherhitzt) {
        Hocherhitzt = hocherhitzt;
    }
//    public boolean isHocherhitzt() {
//        return Hocherhitzt;
//    }
    public void setTyp(String typ) {
        Typ = typ;
    }
    public String getTyp() {
        return Typ;
    }

//    boolean h = Hocherhitzt;
//
//    if (h == true) {
//        fragehocherhitzt = "hocherhitzt";
//    } else {
//        fragehocherhitzt = "nicht hocherhitzt";
//    }

    public void gebeMilchpackungAus(){
        System.out.println(getAnzahl() + " " + getTyp() + " kostet " + getPreis() + "€. Bitte lagern Sie die " +
                getTyp() + " bei höchstens " + getMaxLagerTemperatur() + "°C und verzehren Sie diese bis spätestens " +
                getVerfallDatum() + ". Die " + getTyp() + " ist " + fragehocherhitzt + ".");
    }
}
