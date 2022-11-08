package compito36;

public class Cittadino extends Supermercato {

    private int orarioap;
    private int orarioch;


    //setter

    public void setOrarioap(int orarioap) {
        this.orarioap = orarioap;
    }
    public void setOrarioch(int orarioch) {
        this.orarioch = orarioch;
    }


    //getter


    public int getOrarioap() {
        return orarioap;
    }
    public int getOrarioch() {
        return orarioch;
    }


    public Cittadino(int codice, String indirizzo, int orarioap, int orarioch, int adde, double superf){
        super(codice,indirizzo,superf,adde);

        setOrarioap(orarioap);
        setOrarioch(orarioch);

    }



    public String toString() {

        return getCodice() +"\t Cittadino\t"+super.toString()+getOrarioap()+"\t"+getOrarioch()+"\t"+getSuperf()+"\t"+getAddetti()+"\t-";
    }
    
}
