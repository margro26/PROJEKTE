import java.util.Scanner;

public class Buch { //Klassenname
    //Konstruktionsvorschrift für unsere Bücher
    //Attribute
    //standardmäßig private
    private  int Seitenzahl;
    private String Titel, Autor;

    //Methoden
    //1. - wichtigste Methode - Konstruktor
    //zum Erstellen - heißt wie KLasse!

    public Buch(int seitenzahllesen, int seitenzahl, String titel, String autor) {
        Seitenzahllesen = seitenzahllesen;
        Seitenzahl = seitenzahl;
        Titel = titel;
        Autor = autor;
    }

    //weiter typische Methoden - setter und getter
    public void setTitel(String titel) {
        Titel = titel; //this.Titel = titel; "this" = aktuelles Objekt
    }

    public String getTitel() {
        return Titel;
    }

    public void setAutor(String autor){
        Autor = autor;
    }

    public String getAutor(){
        return Autor;
    }

    public void setSeitenzahl(int seitenzahl){
        Seitenzahl = seitenzahl;
    }

    public int getSeitenzahl(){
        return Seitenzahl;
    }

    public void setSeitenzahllesen(int seitenzahllesen){
        Seitenzahllesen = seitenzahllesen;
    }

    public int getSeitenzahllesen(){
        return Seitenzahllesen;
    }

    public static void informationen(){
        Buch aktuell = new Buch(100, 250, "Starter Pack", "Peter Becker");
        Scanner scan = new Scanner(System.in);
        String t = scan.nextLine();
        System.out.println("Bitte geben Sie den Titel Ihres Buches ein!");
        aktuell.setTitel(t);
        String a = scan.nextLine();
        System.out.println("Bitte geben Sie den Autor Ihres Buches ein!");
        aktuell.setAutor(a);
        int sz = scan.nextInt();
        System.out.println("Bitte geben Sie die Seitenzahl Ihres Buches ein!");
        aktuell.setSeitenzahl(sz);
        int szl = scan.nextInt();
        System.out.println("Bitte geben Sie an, auf welcher Seite Sie gerade lesen?");
        aktuell.setSeitenzahllesen(szl);
    }

    public static void kontrolle() {
        Scanner kontrolle = new Scanner(System.in);
        System.out.println("Sind die folgenden Angaben korrekt?");
        System.out.println("Ihr aktuelles Buch heißt " + aktuell.getTitel() + ", der Autor dieses Buches ist " +
                aktuell.getAutor() + ", insgesamt hat das Buch " + aktuell.getSeitenzahl() + " Seiten und Sie sind " +
                "aktuell auf Seite " + aktuell.getSeitenzahllesen() + ".");
        String antwort = kontrolle.nextLine();

        boolean y = true;
        while (y) {
            switch (antwort) {
                case "Ja":
                    y = false;
                case "Nein":
                    String fehler = kontrolle.nextLine();
                    System.out.println("Bei welchem Parameter liegt der Fehler? (Titel; Autor; Seitenzahl; AKtuelleSeitenzahl)");
                    switch (fehler) {
                        case "Titel":
                            String t = kontrolle.nextLine();
                            System.out.println("Bitte geben Sie den richtigen Titel Ihres Buches ein!");
                            aktuell.setTitel(t);
                            break;
                        case "Autor":
                            String a = kontrolle.nextLine();
                            System.out.println("Bitte geben Sie den richtigen Autor Ihres Buches ein!");
                            aktuell.setAutor(a);
                            break;
                        case "Seitenzahl":
                            int sz = kontrolle.nextInt();
                            System.out.println("Bitte geben Sie die richitge Seitenzahl Ihres Buches ein!");
                            aktuell.setSeitenzahl(sz);
                            break;
                        case "AktuelleSeitenzahl":
                            int szl = kontrolle.nextInt();
                            System.out.println("Bitte geben Sie an, auf welcher Seite Sie gerade lesen?");
                            aktuell.setSeitenzahllesen(szl);
                            break;
                        default:
                            System.out.println("Es tut mir leid, das haben wir leiden nicht verstanden.");
                    }//noch nicht komplett..
                default:
                    System.out.println("Es tut mir leid, das haben wir leider nicht verstanden.");
            }
        }
    }
}
