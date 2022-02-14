package m2cci.zw;

public class MachineAffranchir {

    public Courrier[] listeCourriers;
    public int index;

    /**
     * Constructeur de MachineAffranchir
     * 
     * @param longueurMax le contenu maximum de courrier pouvant être déposés dans
     *                    la machine
     */
    public MachineAffranchir(int longueurMax) {
        this.listeCourriers = new Courrier[longueurMax];
        this.index = 0;
    }

    // public Courrier[] getListeCourriers() {
    // return listeCourriers;
    // }

    // public int getIndex() {
    // return index;
    // }

    /**
     * Permet de deposer un courrier dans la machine à affranchir
     * 
     * @param courrierAAjouter permet de rajouter une courrier à la liste des
     *                         courriers si on a encore de la place (index<
     *                         listeCourrier.lingth)
     */
    public void deposeCourrier(Courrier courrierAAjouter) {

        if (index < listeCourriers.length) {
            listeCourriers[index] = courrierAAjouter;
            index = index + 1;
        } else {
            System.out.println("Impossible d'ajouter un nouveau courrier. Boite pleine !");
        }

    }

    /**
     * Fait la somme des affranchissement des differents courriers déposés dans la
     * machine
     * 
     * @return retourne la somme des prix de tous les courriers qui sont valides
     */
    public double sommeAffranchir() {
        double somme = 0.0;
        for (int i = 0; i <index; i++) {

            somme = somme + listeCourriers[i].affranchir();

        }
        
        return somme;
    }

    /**
     * Calcule et retourne le nombre de courriers invalides présents dans la machine
     * 
     * @return retourne le nombre de courier qui ne sont pas valides
     */
    public int courrierInvalides() {
        int nbCourrierInvalide = 0;
        for (int i = 0; i < index; i++) {
            if (!listeCourriers[i].estValide()) {
                nbCourrierInvalide++;
            }
        }
        return nbCourrierInvalide;
    }

    /**
     * Affiche le contenu (c'est-à-dire les caractérisitiques des différents
     * courriers présents) de la machine à affranchir sur la console
     */
    public void afficher() {
        for (int i = 0; i < index; i++) {
            System.out.println( listeCourriers[i]);
        }
    }

}
