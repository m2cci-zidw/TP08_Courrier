package m2cci.zw;

public class Lettre extends Courrier {
    private Format format;
    private double montant;

    /**
     * Constructeur
     * 
     * @param poids          poids d'une lettre
     * @param modeExpedition si true expédition express sinon expédition normale
     * @param adresse        l'adresse de destination du courrier
     * @param format         le format d'une lettre soit A3 soit A4
     */
    public Lettre(Double poids, ModeExped modeExpedition, String adresse, Format format) {
        super(poids, modeExpedition, adresse);
        this.format = format;
    }

    /**
     * Calcule le tarif d'affranchichissement normal d'une lettre
     * 
     * @return montant le montant d'affranchissement d'une lettre
     */
    public double AffranchirNormale() {

        if (format == Format.A4) {
            montant = 2.5 + 1.0 * getPoids() / 1000;

        } else if (format == Format.A3) {
            montant = 3.5 + 1.0 * getPoids() / 1000;
        }
        return montant;
    }

    /**
     * Permet d'afficher des caracteristiques d'une lettre
     * 
     * @return message les caracteristiques d'une lettre
     */
    @Override
    public String toString() {
        String message = "Lettre\n";
        message = message + super.toString();
        message = message + "       Format : " + format + "\n";
        return message;
    }

}
