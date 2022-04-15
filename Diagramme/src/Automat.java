public class Automat {
    private double AktuelleUhrzeit;
    private double Stundenpreis;

    public Automat(double aktuelleUhrzeit, double stundenpreis){
        AktuelleUhrzeit = aktuelleUhrzeit;
        Stundenpreis = stundenpreis;
    }


    public void setAktuelleUhrzeit(double aktuelleUhrzeit){
        AktuelleUhrzeit = aktuelleUhrzeit;
    }
    public double getAktuelleUhrzeit(){
        return AktuelleUhrzeit;
    }
    public void setStundenpreis(double stundenpreis){
        Stundenpreis = stundenpreis;
    }
    public double getStundenpreis(){
        return Stundenpreis;
    }


}

