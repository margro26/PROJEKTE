public class Veranschaulichung {
    public static void main(String[] args) {
        Z.test();
    }
}

class X {
    int a = 4;
    int get() {
        return a;
    }
}

class Y extends X {
    static int a = 7;
    static void set(int x) {
        a = x;
    }
    static void set(char c) {
        a = 2*c;
    }
}

class Z extends Y {
    static int b = 3;
    int get(){
        return b+a;
    }
    static int get(X x) {
        return x.a;
    }
    static void set(int i) {
        a = 3*i;
    }
    static void set(X x, int i){
        a = i;
    }
    static void test() {
        Z z = new Z();
        System.out.println("z = new(Z) = " + z);
        //das Objekt wird ausgegeben (zum späteren Vergleich)
        System.out.println("z.a = vererbtes, statisches a aus Y = " + z.a);
        System.out.println("get(z) = ((X)z).a = " + get(z));
        //z wird durch static get-Methode zu X gecastet (d.h. als X angesehen - nur Attribute aus X sichtbar)
        //, wodurch das ursprüngliche a aus X wieder angesprochen wird
        System.out.println("z.b = " + z.b);
        System.out.println("((X)z).get() = z.get() - s.u. - = z.b + z.a = " + ((X)z).get());
        //get wurde in der Klasse Z überschrieben - wird beim Casten nicht zurückgeändert, weil
        //nicht allgemein für alle Objekte der Klasse X verwendbar! Upcasten versteckt (nur)
        //alle Attribute und Methoden der Unterklasse; wegen Polymorphie findet aber bei
        //Methodenaufruf automatisch (wieder) Downcast statt - also hier zurück zu Z!
        System.out.println("(X)z = z (unverändert) = " + (X)z);
        //zum Vergleich (siehe oben) - Ausgabe von upgecastetem z
        //- das Objekt wird offensichtlich nicht verändert (es bleibt immer noch
        //vom Typ Z, aber die Z-Eigenschaften werden versteckt und z wird bis zu einem
        //evtl. Downcast als ein Element von X angesehen - mit den entspr. Eigenschaften)
        z.set('d'-'a'-1);
        System.out.println("z.set('d'-'a'-1) = z.set(3-1) = z.set(2), d.h. (z.)a = Y.a = 3*2 = 6");
        System.out.println("z.a = (tatsächlich) " + z.a);
        System.out.println("Y.a = (zum Vergleich) " + Y.a);
        System.out.println("get(z) = ((X)z).a = (immer noch) " + get(z));
        //als X gecastet ergibt sich für a wieder dasselbe (s.o.)
        System.out.println("z.b = (immer noch) " + z.b );
        System.out.println("z.get() = z.b + z.a = " + z.get());
        Y y = z;
        System.out.println("y = (Y)z = z (unverändert) " + y);
        //y ist die als Y gecastete Version von z, kein neues Objekt!
        y.set(2);
        System.out.println("y.set(2), d.h. Y.a = 2");
        //die statische Y-Methode wird aufgerufen - a gilt für gesamte Klasse!
        System.out.println("y.a = Y.a = (tatsächlich) " + y.a);
        System.out.println("z.a = Y.a = " + z.a);
        //Y und Z teilen sich die statische Variable a (weil Z von Y erbt)!
        System.out.println("z.b = (unverändert) " + z.b );
        System.out.println("z.get() = z.b + z.a = " + z.get());
        z.set(y, 0);
        System.out.println("z.set(y,0), d.h. Y.a = 0");
        //auf das upgecastete y in set wird im Methodenrumpf nicht zugegriffen!
        System.out.println("zum Vergleich: y.a = Y.a = " + y.a);
        System.out.println("und: z.a = Y.a = " + z.a);
        System.out.println("aber: ((X)z).a) = " + ((X)z).a);
        System.out.println("z.b = (unverändert) " + z.b );
        System.out.println("y.get() = z.get() = z.b + z.a = " + y.get());
        //automatischer Downcast nach Z, da y = z (ursprünglich)!
    }
}