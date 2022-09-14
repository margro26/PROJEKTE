public class Schokoladentafel extends Lebensmittel{
    protected double Kakaogehalt;
    protected String Sorte;

    public Schokoladentafel(double preis, int anzahl, int maxLagerTemperatur, String verfallDatum, double kakaogehalt, String sorte){
        super(preis, anzahl, maxLagerTemperatur, verfallDatum);
        Kakaogehalt = kakaogehalt;
        Sorte = sorte;
    }

    public double getKakaogehalt() {
        return Kakaogehalt;
    }
    public String getSorte() {
        return Sorte;
    }

    public void gebeSchokoladentafelAus(){
        System.out.println(getAnzahl() + " Tafel " + getSorte() + " kostet " + getPreis() + "€ und hat einen Kakaogehalt " +
                "von " + getKakaogehalt() + "%. Bitte lagern Sie die " + getSorte() + " bei höchstens " +
                getMaxLagerTemperatur() + "°C und verzehren Sie diese bis spätestens " + getVerfallDatum() + ".");
    }
}
