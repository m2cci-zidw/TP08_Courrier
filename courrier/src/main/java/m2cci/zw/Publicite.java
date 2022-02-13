package m2cci.zw;

public class Publicite extends Courrier {
    private double montant;

    public Publicite(int poids, ModeExped modeExpedition, String adresse) {
        super(poids, modeExpedition, adresse);
    }
    public double AffranchirNormale(){
        montant= getPoids()/1000 *5.0 ;
        return montant;
    } 

    @Override
    public String toString() {
        String message = "Publicité \n";
        message = message + super.toString();
        return message ;
    }
    
}
