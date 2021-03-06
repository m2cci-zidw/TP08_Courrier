package m2cci.zw;

public abstract class Courrier {
    protected double poids;
    public ModeExped modeExpedition;
    protected String adresse;

    private double prix;

    /**
     * constructeur
     * 
     * @param poids          poids d'un courrier
     * @param modeExpedition si true expédition rapide sinon expédition normale
     * @param adresse        l'adresse de destination d'un courrier
     */
    public Courrier(double poids, ModeExped modeExpedition, String adresse) {
        this.poids = poids;
        this.modeExpedition = modeExpedition;
        this.adresse = adresse;
    }

    /**
     * Base de la méthode Affranchir en mode normal
     * 
     * @return signature de la méthode affranchir normale qui permet de calculer
     *         selon le prix, selon le poids, volume.
     */
    public double affranchirNormale() {
        return 0;
    }

    /**
     * Permet de savoir si le courrier est valide, c'est-à-dire sil'adresse de
     * destination est vide ou non
     * 
     * @return retourner vrai si l'adresse est valide (adresse non vide )
     */
    public boolean estValide() {
        return adresse.length() > 0;
    }

    /**
     * Associe à chaque courrier le montant necessaire pour l'affranchir en fonction
     * du mode d'expédition
     * 
     * @return montantTotal le montant total d'affranchissement des courriers
     *         présents dans la machine
     */
    public double affranchir() {
        prix = affranchirNormale();
        if (estValide()) {
            if (modeExpedition == ModeExped.express) {
                prix = prix * 2;

            }
            return prix;
        } else {
            return 0;
        }

    }

    /**
     * Récupere le poids d'un colis
     * 
     * @return poids renvoi le poids du colis
     */
    public double getPoids() {
        return poids;
    }

    /**
     * Permet d'afficher des caracteristiques d'un courrier
     * 
     * @return message les caracteristiques d'un courrier
     */
    @Override
    public String toString() {
        String message = "";
        if (!estValide()) {
            message = message + "(Courrier invalide)\n";

        }
        message = message + "       Poids : " + getPoids() + " grammes \n";
        message = message + "       Express : " + ((modeExpedition == ModeExped.express) ? "oui" : "non") + " \n";
        message = message + "       Destination : " + this.adresse + "\n";
        message = message +  (estValide()? ("       Prix : " + affranchir() + " Euro \n") : "");
        return message;

    }

}
