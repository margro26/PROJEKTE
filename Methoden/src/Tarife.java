public class Tarife {
    public static void Tarif1 (int a){
        System.out.println(11.75 + a*0.50 + "€");
    }
    public static void Tarif2 (int a){
        System.out.println(19.25 + a*0.25 + "€");
    }
    public static void Tarif3 (int a){
        System.out.println(22.75 + (a-30)*0.375 + "€");
    }

    public static void main(String[] args) {
        int i=10;
        while (i<=100) {
            System.out.println("Mit Tarif 1 und " + i + " Gesprächsminuten kostet die Monatsrechnung:");
            Tarif1(i);
            System.out.println("Mit Tarif 2 und " + i + " Gesprächsminuten kostet die Monatsrechnung:");
            Tarif2(i);
            System.out.println("Mit Tarif 3 und " + i + " Gesprächsminuten kostet die Monatsrechnung:");
            Tarif3(i);
            i += 10;
        }
    }
}
