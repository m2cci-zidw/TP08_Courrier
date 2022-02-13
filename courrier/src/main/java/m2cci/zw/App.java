package m2cci.zw;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Lettre Lettre1 = new Lettre(1000, ModeExped.express, "azze", Format.A3);

        // System.out.println(Lettre1.Affranchir());
        Lettre Lettre2 = new Lettre(1000, ModeExped.normal, "", Format.A3);
        // System.out.println(Lettre2.Affranchir());

        // System.out.println(Lettre1);
        // System.out.println(Lettre2);

        Publicite pub1 = new Publicite(10, ModeExped.express, "grenoble");
        colis colis2 = new colis(1000, ModeExped.express, "", 10);

        // System.out.println(Lettre2.estValide());clear
        colis colis1 = new colis(100000, ModeExped.express, "qssss", 10);
        // System.out.println(colis1.estValide());
        // System.out.println(colis1);
        // System.out.println(pub1);

        // System.out.println(colis1.estValide());
        MachineAffranchir m1 = new MachineAffranchir(10);


        m1.deposeCourrier(Lettre1);
        m1.deposeCourrier(Lettre2);
        m1.deposeCourrier(colis1);
        m1.deposeCourrier(colis2);
        m1.afficher();

       /* Machine machine = newMachine();

        Lettre l1 = new Lettre(200, ModeExped.express, "Chemin des Acacias 28, 1009 Pully", A3);

        Lettre l2 = new Lettre(800, ModeExped.normal, "", A4);

        Publicite p1 = new Publicite(1500, ModeExped.express, "Les Moilles 13A,1913 Saillon");

        Publicite p2 = new Publicite(3000, ModeExped.normal, "");

        Colis c1 = new Colis(5000, ModeExped.express, "Grand rue 18, 1950 Sion", 30);

        Colis c2 = new Colis(5000, ModeExped.express, "Chemin des fleurs 48,2800 Delemont", 70);

        machine.deposerCourrier(l1);
        machine.deposerCourrier(l2);
        machine.deposerCourrier(c1);
        machine.deposerCourrier(c2);
        machine.deposerCourrier(p1);
        machine.deposerCourrier(p2);

        machine.affranchir();
        machine.afficher();
        machine.courrierInvalides();*/
    }
}
