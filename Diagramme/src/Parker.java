import java.util.Scanner;

public class Parker {
    private double Geld;
    private double Zeit;
    private double ZeitProStd;

    public Parker(double geld, double zeit){
        Geld = geld;
        Zeit = zeit;
    }
    public void Ticket(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Wie lange möchten Sie parken? (Stunden)");
        String stunden = scan.nextLine();
    }
}
