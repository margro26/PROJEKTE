import java.util.Scanner;

public class Zeichenketten {
    public static String zeichenketten(String s){
        int laenge = s.length();
        String zeichen = "";
        for (int i = laenge -1; i>=0; i--) {
            zeichen = zeichen.concat("" + s.charAt(i));
        }
        return zeichen;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte geben Sie ein Wort ein!");
        String eingabe = scan.nextLine();
        String ergebnis = zeichenketten(eingabe);
        System.out.println("Das umgedrehte Wort ist: " + ergebnis);
    }
}
