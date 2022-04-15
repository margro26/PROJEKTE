import java.util.Scanner;

public class Schleifen {
    public static void main(String[] args) {
        System.out.println("Bitte geben Sie eine Zahl ein:");
        Scanner scan = new Scanner(System.in);
        int zahl = scan.nextInt();
        int i = 1;
        while (i < 10) {
            System.out.println(zahl*i);
            i += 1;
        }
    }
}
