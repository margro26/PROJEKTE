import java.util.Scanner;

public class Rose extends Pflanzen{
    public Rose(String name, int alter, String farbe){
        super(name, alter, farbe);
    }

    public void informationen(){
        Rose aktuell = new Rose(Franz, 5, rot);
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        System.out.println("Bitte geben Sie den Namen Ihrer Rose ein!");
        aktuell.setName(n);
        String a = scan.nextLine();
        System.out.println("Bitte geben Sie das Alter Ihrer Rose ein!");
        aktuell.setAlter(a);
        int f = scan.nextInt();
        System.out.println("Bitte geben Sie die Farbe Ihrer Rose ein!");
        aktuell.setFarbe(f);
    }

    public static void main(String[] args) {
        informationen();
        System.out.println("Ihre " + farbe + "e Rose " + name + " ist " + alter + " Jahre alt!");
        Scanner scan = new Scanner(System.in);
        System.out.println("Wollen sie Ihre Rose gießen oder wachsen lassen? (giessen/wachsen)");
        String auswahl = scan.nextLine();
        if auswahl = giessen {
            giessen();
        }
        else if auswahl = wachsen {
            wachsen();
        }
    }
}