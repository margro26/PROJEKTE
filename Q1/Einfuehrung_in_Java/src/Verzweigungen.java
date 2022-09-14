import java.util.Scanner;

public class Verzweigungen {

    public static void main(String args[]) {
        System.out.println("Bitte geben Sie einen Tag der Woche als Zahl ein! (Montag=1; Sonntag=7)");
        Scanner scan = new Scanner(System.in);
        int woche = scan.nextInt();
        switch(woche) {
            case 1: System.out.println("Schade,kein Wochenende.");
                break;
            case 2: System.out.println("Schade,kein Wochenende.");
                break;
            case 3: System.out.println("Schade,kein Wochenende.");
                break;
            case 4: System.out.println("Schade,kein Wochenende.");
                break;
            case 5: System.out.println("Heute beginnt das Wochenende.");
                break;
            case 6: System.out.println("Schön, Wochenede!");
                break;
            case 7: System.out.println("Morgen ist Montag.");
                break;
            default: System.out.println("Diese Eingabe ist ungültig!");
        }
    }
}
