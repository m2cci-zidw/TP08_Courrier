package m2cci.zw;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Lettre Lettre1 = new Lettre(1000, ModeExped.express, "azze", Format.A3);
        
        System.out.println(Lettre1.Affranchir());
        Lettre Lettre2 = new Lettre(1000, ModeExped.normal, "", Format.A3);
        System.out.println(Lettre2.Affranchir());
        System.out.println(Lettre2.estValide());
        colis colis1 = new colis(1000, ModeExped.express, "qssss", 10);
        System.out.println(colis1.estValide());

        MachineAffranchir m1 = new MachineAffranchir(10);
        m1.deposeCourrier(Lettre1);
        // m1.deposeCourrier(Lettre2);
         m1.SommeAffranchir();
        // m1.CourrierInvalide();

        System.out.println(colis1.estValide());
    }
}
