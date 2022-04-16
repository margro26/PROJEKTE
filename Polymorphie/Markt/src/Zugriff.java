public class Zugriff{
    public static void main(String[] args) {
        Milchpackung milch = new Milchpackung(1.98, 1, 8, "22.04.2022",
                true, "Mandelmilch");
        milch.gebeMilchpackungAus();
        Schokoladentafel schoko = new Schokoladentafel(1.09, 1, 15, "15.4.2024",
                38.0, "Oreo-Schokolade");
        schoko.gebeSchokoladentafelAus();
        Möbelstück moeb = new Möbelstück(35.00, 1, 400, 50, 100, "Sofa");
        moeb.gebeMöbelstückAus();
        Kleidungsstück kleid = new Kleidungsstück(9.99, 1, 38, "T-Shirt", "rot",
                "Baumwolle");
        kleid.gebeKleidungsstückAus();
    }
}
