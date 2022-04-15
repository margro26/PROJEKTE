import java.util.Scanner;

public class Quersumme {
    public static void main(String[] args) {
        System.out.println("Zahl:");
        Scanner scan= new Scanner(System.in);
        String eingabe = scan.next();
        int quer=0;
        for (int i=0;i<=eingabe.length()-1;i++){
            quer = quer + Character.getNumericValue(eingabe.charAt(i));
        }
        System.out.println("Quersumme = " + quer);
    }
}