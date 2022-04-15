public class Zugriff {
    Milchpackung milch = new Milchpackung(1.98, 1, 8, "22.04.2022",
            true, "Mandelmilch");
    Ware milch1 = milch;
    Schokoladentafel schoko = new Schokoladentafel(2.18, 2, 15, "15.4.2024",
            38.0, "Oreo-Schokolade");
    Ware schoko1 = schoko;
    Möbelstück moeb = new Möbelstück(35.00, 1, 400, 50, 100, "Sofa");
    Ware moeb1 = moeb;
    Kleidungsstück kleid = new Kleidungsstück(9.99, 1, 38, "T-Shirt", "rot",
            "Baumwolle");
    Ware kleid1 = kleid;
}
