import java.util.Scanner;

public class Seminar {
    public static void Punktzahl(int a, int b) {
        System.out.println("Ihre Gesamtpunktzahl liegt bei:");
        System.out.print(a*3 + b*2);
    }

    public static void main(String[] args) {
        Scanner seminar = new Scanner(System.in);
        System.out.println("Bitte geben Sie die erreichte Punktzahl bei der Hausarbeit ein:");
        int hausarbeit = seminar.nextInt();
        System.out.println("Bitte geben Sie die erreichte Punktzahl bei dem Vortrag ein:");
        int vortrag = seminar.nextInt();
        Punktzahl(hausarbeit, vortrag);
    }
}
