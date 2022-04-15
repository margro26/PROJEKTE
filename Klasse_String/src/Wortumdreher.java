import java.util.Scanner;

public class Wortumdreher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben sie ein Wort ein:");
        String wort = scan.nextLine();
        System.out.println("Dieses Wort werden wir umdrehen!");
        String wort_uc = wort.toUpperCase();
        int length = wort_uc.length();
        int stelle = length - 1;
        while (stelle >= 0) {
            System.out.print(wort_uc.charAt(stelle));
            stelle -= 1;
        }
        System.out.println("\nFertig!");
    }
}