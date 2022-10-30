package compito24;

public class Ricerca extends Progetti {

    private String argomento;
    private int numPartner;
    private double importoTot;


    //SETTER
    public void setArgomento(String argomento) {
        this.argomento = argomento;
    }
    public void setImportoTot(double importoTot) {
        this.importoTot = importoTot;
    }
    public void setNumPartner(int numPartner) {
        this.numPartner = numPartner;
    }

    //GETTER
    public String getArgomento() {
        return argomento;
    }
    public double getImportoTot() {
        return importoTot;
    }
    public int getNumPartner() {
        return numPartner;
    }

    public Ricerca(){
        super();
        setArgomento(null);
        setImportoTot(0);
        setNumPartner(0);
    }
    

    public Ricerca(int cod, String cord, String nOrg, String titolo, String arg, int nump, double importo){
        super(cod,cord, nOrg,titolo);
        setArgomento(arg);
        setImportoTot(importo);
        setNumPartner(nump);
    }

    public String toString() {
       
        return "Ricerca\t" +  super.toString() + getArgomento() +"\t"+ getNumPartner() + "\t-\t" + getImportoTot();
    }
}
