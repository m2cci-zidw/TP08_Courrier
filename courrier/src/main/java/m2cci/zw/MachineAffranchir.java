package m2cci.zw;

public class MachineAffranchir {

    public Courrier [] listeCourriers ;
    public int index;

    
    public MachineAffranchir(int longeurMax) {
        this.listeCourriers = new Courrier[ longeurMax];
        this.index = 0;
    }

/**
 * 
 * @param courrierAAjouter permet de rajouter une courrier à la liste des courriers
 * si on a encore de la place (index< listeCourrier.lingth)
 */
    public void  deposeCourrier(Courrier courrierAAjouter){
        
        if(index < listeCourriers.length){
            listeCourriers[index]=courrierAAjouter;
            index=index+1 ;
            

        }
    
    }
/**
 * 
 * @return retourner la somme de prix de toute les courriers qui sont valide 
 */
    public double SommeAffranchir(){
        double somme =0 ;
        for(int i = 0; i< listeCourriers.length; i++){
            if(listeCourriers[i].estValide()){
                somme=  (somme+listeCourriers[i].Affranchir());
            }
        }
        return somme ;
    }
    /**
     * 
     * @return retourner le nombre de courier qui ne sont pas valide 
     */
    public int CourrierInvalide(){
        int nbCourrierInvalide =0;
        for(int i=0; i<listeCourriers.length; i++){
            if(listeCourriers[i].estValide()){
                nbCourrierInvalide++ ;

            }
        }
        return nbCourrierInvalide;
    }
}
