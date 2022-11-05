package compito40;

public class Veicolo {
    
    protected int codice;
    protected String targa;
    private String marca;
    private String modello;
    private double costog;


    //setter

    public void setCodice(int codice) {
        this.codice = codice;
    }
    public void setCostog(double costog) {
        this.costog = costog;
    }
    public void setModello(String modello) {
        this.modello = modello;
    }
    public void setTarga(String targa) {
        this.targa = targa;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    

    //getter

    public int getCodice() {
        return codice;
    }
    public double getCostog() {
        return costog;
    }
    public String getModello() {
        return modello;
    }
    public String getTarga() {
        return targa;
    }
    public String getMarca() {
        return marca;
    }


    //costruttore

    public Veicolo(int cod, String targa, String modello,String marca, double costog){
        setCodice(cod);
        setTarga(targa);
        setModello(modello);
        setCostog(costog);
        setMarca(marca);
        

    }


    //print 

    public String toString() {
        return getTarga() + "\t" + getCodice() + "\t" + getModello() + "\t" + getMarca() + "\t" + getCostog();
    }

}
