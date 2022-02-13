package m2cci.zw;

public class Publicite extends Courrier {
    private double montant;

    /**
     * Constructeur
     * 
     * @param poids          poids d'une publicité
     * @param modeExpedition si true expédition express sinon expédition normale
     * @param adresse        l'adresse de destination du courrier
     */
    public Publicite(double poids, ModeExped modeExpedition, String adresse) {
        super(poids, modeExpedition, adresse);
    }



    /**
     * Calcule le tarif d'affranchichissement normal d'une publicité
     * 
     * @return montant le montant d'affranchissement d'une publicité
     */
    public double AffranchirNormale() {
        montant = (getPoids() / 1000) * 5.0;
        return montant;
    }

    /**
     * Permet d'afficher des caracteristiques d'une publicité
     * 
     * @return message les caracteristiques d'une publicité
     */
    @Override
    public String toString() {
        String message = "Publicité \n";
        message = message + super.toString();
        return message;
    }

}
