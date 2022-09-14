import java.util.Scanner;

public class Zahlen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte geben Sie ihre erste Zahl ein:");
        String zahl1 = scan.nextLine();
        System.out.println("Bitte geben Sie ihre zweite Zahl ein:");
        String zahl2 = scan.nextLine();
        System.out.println("Bitte geben Sie ihre dritte Zahl ein:");
        String zahl3 = scan.nextLine();
        String zwischenergebnis = zahl1 + zahl2 + zahl3;
        // int ergebnis = zwischenergebnis / 3;
        // System.out.println("Das Ergebnis ist: " + ergebnis);
    }
}