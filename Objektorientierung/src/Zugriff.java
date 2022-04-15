import Buch.Buch;

import java.util.Scanner;

public class Zugriff {
    public static void main(String[] args) {
        Buch.informationen();
        Buch.kontrolle();
        Scanner main = new Scanner(System.in);
        int wahl = main.nextInt();
        System.out.println("Was wollen Sie mit ihrem Buch machen?");
        System.out.println("(1) Lesen");
        System.out.println("(2) Weglegen/Ein anderes Buch auswählen");
        System.out.println("(3) Bewerten");
        System.out.println("(4) Verbrennen");

        switch (wahl) {
            case 1: System.out.println("...Sie lesen gerade...");
                    int szl = main.nextInt();
                    System.out.println("Bis zu welcher Seite haben Sie gelesen?");
                    aktuell.setSeitenzahllesen(szl);
                    break;
            case 2: int antwort = main.nextInt();
                    System.out.println("Sind Sie sich sicher, dass Sie das aktuelle Buch weglegen wollen? Die Daten zu " +
                        "diesem Buch werden dann überschrieben!");
                    switch (antwort) {
                        case "Ja":
                            Buch.informationen();
                            break;
                        case "Nein":
                            System.out.println("Wählen Sie eine andere Option:"); //wie kriege ich das nachher nochmal? evtl eigene Funktion?
                            System.out.println("(1) Lesen");
                            System.out.println("(2) Weglegen/Ein anderes Buch auswählen");
                            System.out.println("(3) Bewerten");
                            System.out.println("(4) Verbrennen");
                            break;
                        default:
                            System.out.println("Es tut mir leid, das haben wir leider nicht verstanden.");
                    }
                    break;
            case 3: int sterne = main.nextInt();
                    System.out.println("Wir würden uns sehr über eine Bewertung freuen! Wie viele Sterne würden Sie vergeben?");
                    switch (sterne){
                        case 5:
                            System.out.println("*****\nSuper! Freut uns, dass es Ihnen gefallen hat!");
                            break;
                        case 4:
                            System.out.println("****\nSehr schön! Das hört sich gut an!");
                            break;
                        case 3:
                            System.out.println("***\nGut!");
                            break;
                        case 2:
                            System.out.println("**\nHmm, ok.. Schade...");
                            break;
                        case 1:
                            System.out.println("\nOhje.. Schade...");
                            break;
                        default:
                            System.out.println("Es tut mir leid, das haben wir leider nicht verstanden.");
                    }
                    String kommentar = main.nextLine();
                    System.out.println("Wollen Sie zusätzlich noch einen Kommentar hinterlassen?");
                    switch (kommentar){
                        case "Ja":
                            System.out.println("Platz für Ihren Kommentar:"); //läuft direkt weiter
                            System.out.println("Danke für Ihren Kommentar");
                            break;
                        case "Nein":
                            System.out.println("Okay, dann nicht");
                            break;
                        default:
                            System.out.println("Es tut mit leid, das haben wir leider nicht verstanden.");
                    }
                    break;
            case 4:
                String verbrennen = main.nextLine();
                System.out.println("Sind Sie sicher, dass Sie Ihr Buch verbrennen wollen?");
                switch (verbrennen) {
                    case "Ja":
                        System.out.println("...knister...Ihr Buch wird gerade vrbrannt...knister...");
                        String auswählen = main.nextLine();
                        System.out.println("Ihr Buch ist jetzt verbrannt,möchten Sie ein neues Buch auswählen?");
                        switch(auswählen) {
                            case "Ja":
                                Buch.informationen();
                                break;
                            case "Nein":
                                String schliessen = main.nextLine();
                                System.out.println("Wollen Sie ihr Programm schließen?");
                                switch(schliessen) {
                                    case "Ja":
                                        System.out.println("Ihr Programm ist jetzt geschlossen!");
                                        break;
                                    case "Nein":
                                        System.out.println("Sie werden zurück zum Hauptmenue geschickt!");
                                        System.out.println("Wählen Sie eine andere Option:");
                                        System.out.println("(1) Lesen");
                                        System.out.println("(2) Weglegen/Ein anderes Buch auswählen");
                                        System.out.println("(3) Bewerten");
                                        System.out.println("(4) Verbrennen");
                                        break;
                                    default:
                                        System.out.println("Es tut mir leid, das haben wir leider nicht verstanden.");
                                }
                                break;
                            default:
                                System.out.println("Es tut mir leid, das haben wir leider nicht verstanden.");
                        }
                        break;
                    case "Nein":
                        System.out.println("Wählen Sie eine andere Option:"); //wie kriege ich das nachher nochmal? evtl eigene Funktion?
                        System.out.println("(1) Lesen");
                        System.out.println("(2) Weglegen/Ein anderes Buch auswählen");
                        System.out.println("(3) Bewerten");
                        System.out.println("(4) Verbrennen");
                        break;
                    default:
                        System.out.println("Es tut mir leid, das haben wir leider nicht verstanden.");
                }
        }
    }
}
