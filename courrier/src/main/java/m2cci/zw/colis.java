package m2cci.zw;

public class colis extends Courrier {
    private int volume;
    private double montant;

    /**
     * Constructeur
     * 
     * @param poids          poids d'un colis
     * @param modeExpedition si true expédition express sinon expédition normale
     * @param adresse        l'adresse de destination d'un colis
     * @param volume         le volume d'un colis en littre
     */
    public colis(int poids, ModeExped modeExpedition, String adresse, int volume) {
        super(poids, modeExpedition, adresse);
        this.volume = volume;
    }

    /**
     * Calcule le tarif d'affranchichissement normal d'un colis
     * 
     * @return montant le montant d'affranchissement d'un colis
     */
    public double AffranchirNormale() {

        montant = 0.25 * volume + getPoids() / 1000.0;

        return montant;

    }

    /**
     * Defini si le colis est valide ou non (s'il dépasse 50 litres)
     * 
     * @return retourne un booleen true ou false
     */
    public boolean estValide() {
        return (super.estValide() && volume <= 50);
    }

    /**
     * Permet d'afficher des caracteristiques d'un colis
     * 
     * @return message les caracteristiques du colis
     */
    @Override
    public String toString() {
        String message = "Colis \n";
        message = message + super.toString();
        message = message + " Volume : " + volume + " litres\n";
        return message;
    }

}
