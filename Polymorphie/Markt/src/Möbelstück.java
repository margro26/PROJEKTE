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

    public int getBreite() {
        return Breite;
    }
    public int getHoehe() {
        return Hoehe;
    }
    public int getTiefe() {
        return Tiefe;
    }
    public String getTyp() {
        return Typ;
    }

    public void gebeMöbelstückAus(){
        System.out.println(getAnzahl() + " " + getTyp() + " kostet " + getPreis() + "€. Es ist " + getHoehe() +
                "cm hoch, " + getBreite() + "cm breit und " + getTiefe() + "cm tief.");
    }
}
