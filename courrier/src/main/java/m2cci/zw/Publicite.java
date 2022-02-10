package m2cci.zw;

public class Publicite extends Courrier {
    private double montant;

    public Publicite(int poids, ModeExped modeExpedition, String adresse) {
        super(poids, modeExpedition, adresse);
    }
    public double AffranchirNormale(){
        montant= getPoids()*5.0 ;
        return montant;
    } 
    
}
