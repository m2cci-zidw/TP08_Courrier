package m2cci.zw;

public class App {
    public static void main(String[] args) {

        MachineAffranchir machine = new MachineAffranchir(50);

        Lettre l1 = new Lettre(200.0, ModeExped.express, "Chemin des Acacias 28, 1009 Pully", Format.A3);

        Lettre l2 = new Lettre(800.0, ModeExped.normal, "", Format.A4);

        Publicite p1 = new Publicite(1500.0, ModeExped.express, "Les Moilles 13A , 1913 Saillon");

        Publicite p2 = new Publicite(3000.0, ModeExped.normal, "");

        Colis c1 = new Colis(5000.0, ModeExped.express, "Grand rue 18, 1950 Sion", 30.0);

        Colis c2 = new Colis(3000.0, ModeExped.express, "Chemin des fleurs 48,2800 Delemont", 70.0);

        machine.deposeCourrier(l1);
        machine.deposeCourrier(l2);
        machine.deposeCourrier(c1);
        machine.deposeCourrier(c2);
        machine.deposeCourrier(p1);
        machine.deposeCourrier(p2);

        System.out.println("Le montant total d'affranchissement est de " + machine.sommeAffranchir() + " euros.");
        System.out.println("");
        machine.afficher();
        System.out.println("La boite contient " + machine.courrierInvalides() + " courriers invalides.");
        System.out.println();

    }

}
