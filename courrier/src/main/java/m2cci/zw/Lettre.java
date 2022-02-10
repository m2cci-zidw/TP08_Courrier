package m2cci.zw;

public class Lettre extends Courrier {
    private String format;

    public Lettre(int poids, boolean modeExpedition, String adresse, String format) {
        super(poids, modeExpedition, adresse);
        this.format = format;
    }

    public double AffranchirNormale(){
        double montant ;

        if(format =="A4"){
            montant = 2.5 + 1.0 * getPoids() /1000 ;

        }
        else if(format=="A3"){
            montant = 3.5 + 1.0 * getPoids()/1000 ;

        }
        

    }
    
}
