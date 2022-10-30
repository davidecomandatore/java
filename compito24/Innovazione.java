package compito24;

public class Innovazione extends Progetti {
    private int numAziende;
    private double importoTot;

    //SETTER 
    public void setNumAziende(int numAziende) {
        this.numAziende = numAziende;
    }
    public void setImportoTot(double importoTot) {
        this.importoTot = importoTot;
    }

    //GETTER
    public double getImportoTot() {
        return importoTot;
    }
    public int getNumAziende() {
        return numAziende;
    }

    //COSTRUTTORE

    public Innovazione(){
        super();
        setNumAziende(0);
        setImportoTot(0);

    }
    

    public Innovazione(int cod, String cord, String nOrg, String titolo, int numA, double importo){
        super(cod,cord, nOrg,titolo);
        setImportoTot(importo);
        setNumAziende(numA);
    }

    public String toString() {

        return "Innovaione\t" + super.toString() + "\t-\t-\t" + getNumAziende() + "\t" + getImportoTot();
    }
    
}
