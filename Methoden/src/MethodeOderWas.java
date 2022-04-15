import java.util.Scanner;

public class MethodeOderWas {
    //Methode, die einen double-Wert zurückgibt
    //und zwei double-Variablen ("Parameter") gerne erhalten möchte
    public static double Produkt(double a, double b) {
        return a*b;
    }

    public static void Einf() {
        System.out.println("Hallo");
        System.out.println("Das ist ein kleines Programm.");
    }

    public static void main(String[] args) {
        Einf(); //Methode wird über Namen aufgerufen
        System.out.println("1. Zahl:");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        System.out.println("2. Zahl:");
        double b = scan.nextDouble();
        double c = Produkt(a,b); //Methode wird aufgerufen mit zwei Übergabeparametern
        System.out.println("Die Lösung ist "+c);
    }
}
