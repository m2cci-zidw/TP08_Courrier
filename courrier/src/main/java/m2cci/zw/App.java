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
        
       // System.out.println(Lettre1.Affranchir());
        Lettre Lettre2 = new Lettre(1000, ModeExped.normal, "", Format.A3);
        //System.out.println(Lettre2.Affranchir());

        // System.out.println(Lettre1);
        // System.out.println(Lettre2);

        Publicite pub1 = new Publicite(10, ModeExped.express, "grenoble");
        colis colis2 = new colis(1000, ModeExped.express, "", 10);

        // System.out.println(Lettre2.estValide());clear
         colis colis1 = new colis(100000, ModeExped.express, "qssss", 10);
        // System.out.println(colis1.estValide());
       // System.out.println(colis1);
       // System.out.println(pub1);
         MachineAffranchir m1 = new MachineAffranchir(10);
       
         m1.deposeCourrier(Lettre1);
         m1.deposeCourrier(Lettre2);
         m1.deposeCourrier(colis1);
         m1.deposeCourrier(colis2);
         m1.afficher();
       
         
         

        // System.out.println(colis1.estValide());
    }
}
