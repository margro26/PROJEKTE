public class Schokoladentafel extends Lebensmittel{
    protected double Kakaogehalt;
    protected String Sorte;

    public Schokoladentafel(double preis, int anzahl, int maxLagerTemperatur, String verfallDatum, double kakaogehalt, String sorte){
        super(preis, anzahl, maxLagerTemperatur, verfallDatum);
        Kakaogehalt = kakaogehalt;
        Sorte = sorte;
    }

    public void setKakaogehalt(double kakaogehalt) {
        Kakaogehalt = kakaogehalt;
    }
    public double getKakaogehalt() {
        return Kakaogehalt;
    }
    public void setSorte(String sorte) {
        Sorte = sorte;
    }
    public String getSorte() {
        return Sorte;
    }
}
