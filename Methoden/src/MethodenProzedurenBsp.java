import java.util.Scanner;

public class MethodenProzedurenBsp {
    //1.Fall: Prozedur ohne Rückgabe und ohne Übergabeparameter
    public static void SchreibeHallo(){
        System.out.println("Hallo");
    }
    //2.Fall:Prozedur mit Rückgabe und Übergabeparameter
    public static int quadriere(int a){
        //"int",d.h. eine Integer-Zahl wird zurückgegeben
        //(int a), d.h. die Methode benötigt eine Zahl als EIngabewert!
        return a*a; //"return" zwingend erforderlich - legt den Rückgabewert fest!
    }
    //Hauptprogramm
    public static void main(String[] args) {
        SchreibeHallo(); //Aufruf der Methode mit dem Namen SchreibeHand();
        System.out.println("Los geht's");
        System.out.println("Das Quadrat von 5 ist");
        int b = quadriere(5);
        //Die Methode quadriere wird mit 5 aufgerufen und mit b zugewiesen!
        System.out.println(b); //b=25

    }
}
