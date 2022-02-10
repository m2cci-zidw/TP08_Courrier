package m2cci.zw;

public class Courrier {
    private int poids;
    private boolean modeExpedition ;
    private String adresse ;

    private double prix ;
/**
 * constructor
 * @param poids poids d'un courrier 
 * @param modeExpedition si true expidition rapide si non expidition normal
 * @param adresse l'addreese ou il faut envoyer le courrier 
 */
    public Courrier(int poids, boolean modeExpedition, String adresse) {
        this.poids = poids;
        this.modeExpedition = modeExpedition;
        this.adresse = adresse;
    }
/**
 * 
 * @return signature de la mathode affranchir normale qui permet de calculer selon 
 * le prix selon le poids, volume 
 */
    public double  AffranchirNormale(){
        return 0 ;
    }
   /**
    * 
    * @return retourner si l'addresse deferent de la séquence vide 
    */ 
    public boolean estValide(){
        return adresse.length() > 0 ;
    }
    public double Affranchir(){
          prix = AffranchirNormale() ;
        if(adresse.length() ==0){
            return 0;

        }
        else{
            if(modeExpedition){
                prix=prix*2 ;

            }
            return prix;
        }

    }




    public int getPoids() {
        return poids;
    }

    
    
    
    
}
