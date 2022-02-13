package m2cci.zw;

public class MachineAffranchir {

    public Courrier [] listeCourriers ;
    public int index;

    
    public MachineAffranchir(int longeurMax) {
        this.listeCourriers = new Courrier[ longeurMax];
        this.index = 0;
    }

    

// public Courrier[] getListeCourriers() {
//         return listeCourriers;
//     }



  


    // public int getIndex() {
    //     return index;
    // }



  



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
        else {
            System.out.println("Impossible d'ajouter un nouveau courrier. Boite pleine !");
        }
    
    }
 




/**
 * 
 * @return retourner la somme de prix de toute les courriers qui sont valide 
 */
    public double SommeAffranchir(){
        double somme =0.0 ;
        for(int i = 0; i< listeCourriers.length; i++){
            
                somme=  somme+listeCourriers[i].Affranchir();
            
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


  
    
    public void afficher() {
        for (int i = 0; i < index; i++) {
            System.out.println(listeCourriers[i]);
        }
    }
    
}

