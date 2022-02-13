package m2cci.zw;

public class colis extends Courrier {
    private int volume ;
    private double montant;

    public colis(int poids, ModeExped modeExpedition, String adresse, int volume) {
        super(poids, modeExpedition, adresse);
        this.volume = volume ;
    }
public double AffranchirNormale(){

    montant=0.25 * volume + getPoids()/1000.0;

    return montant;

 
}
public boolean estValide(){
    return (super.estValide()&& volume<=50) ;
}

   
@Override
public String toString() {
    String message = "Colis \n";
    message = message + super.toString();
    message  = message + " Volume : " + volume + " litres\n";
    return message;
}
    
}
