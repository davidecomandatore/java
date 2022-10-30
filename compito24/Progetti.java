package compito24;

public class Progetti {

    private int codice;
    private String titolo;
    private String cord;
    private String organizzazione;

    //SETTER 
    public void setCodice(int codice) {
        this.codice = codice;
    }
    public void setCord(String cord) {
        this.cord = cord;
    }
    public void setOrganizzazione(String organizzazione) {
        this.organizzazione = organizzazione;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    //GETTER 
    public int getCodice() {
        return codice;
    }
    public String getCord() {
        return cord;
    }
    public String getOrganizzazione() {
        return organizzazione;
    }
    public String getTitolo() {
        return titolo;
    }


    // COSTRUTTORE NULL
    public Progetti(){
        setCodice(0);
        
        setOrganizzazione(null);
        setTitolo(null);
    }

    public Progetti(int cod, String cord, String nOrg, String titolo){
        setCodice(cod);
        setCord(titolo);
        setOrganizzazione(nOrg);
        setTitolo(titolo);
    }



    public String toString() {
       
        return getTitolo() + "\t " + getCodice() + "\t" + getCord() + "\t" + getOrganizzazione() ; 
    }
    
}
