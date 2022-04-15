public class Möbelstück extends Ware{
    protected int Breite;
    protected int Hoehe;
    protected int Tiefe;
    protected String Typ;

    public Möbelstück(double preis, int anzahl, int breite, int hoehe, int tiefe, String typ){
        super(preis, anzahl);
        Breite = breite;
        Hoehe = hoehe;
        Tiefe = tiefe;
        Typ = typ;
    }

    public void setBreite(int breite) {
        Breite = breite;
    }
    public int getBreite() {
        return Breite;
    }
    public void setHoehe(int hoehe) {
        Hoehe = hoehe;
    }
    public int getHoehe() {
        return Hoehe;
    }
    public void setTiefe(int tiefe) {
        Tiefe = tiefe;
    }
    public int getTiefe() {
        return Tiefe;
    }
    public void setTyp(String typ) {
        Typ = typ;
    }
    public String getTyp() {
        return Typ;
    }
}
