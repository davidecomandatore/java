package compito36;

public class Supermercato {

    private int codice;
    private String indirizzo;
    private double superf;
    private int addetti;


    //setter

    public void setCodice(int codice) {
        this.codice = codice;
    }
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public void setAddetti(int addetti) {
        this.addetti = addetti;
    }
    public void setSuperf(double superf) {
        this.superf = superf;
    }
    //gett
    public int getCodice() {
        return codice;
    }
    public String getIndirizzo() {
        return indirizzo;
    }
    public int getAddetti() {
        return addetti;
    }

    public double getSuperf() {
        return superf;
    }

    //builder

    public Supermercato(int codice, String indirizzo,double superf, int addetti){
        setCodice(codice);
        setIndirizzo(indirizzo);
        setAddetti(addetti);
        setSuperf(superf);
    }




    public String toString() {
        return getIndirizzo() +"\t";
    }
    
}
