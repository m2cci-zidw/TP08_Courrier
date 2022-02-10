package m2cci.zw;

public class Lettre extends Courrier {
    private Format format;
    private   double montant ;

    public Lettre(int poids, ModeExped modeExpedition, String adresse, Format format) {
        super(poids, modeExpedition, adresse);
        this.format = format;
    }

    public double AffranchirNormale(){
       

        if(format ==Format.A4){
            montant = 2.5 + 1.0 * getPoids() /1000 ;

        }
        else if(format==Format.A3){
            montant = 3.5 + 1.0 * getPoids()/1000 ;

        }
        return montant;
        

    }
    
}
