package compito40;

public class Auto extends Veicolo {
    private int cilindrata;
    private double capienzabg;




    //setter

    public void setCapienzabg(double capienzabg) {
        this.capienzabg = capienzabg;
    }
    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    //getter

    public double getCapienzabg() {
        return capienzabg;
    }
    public int getCilindrata() {
        return cilindrata;
    }

    //costruttore

    public Auto(int cod, String targa, String modello,String marca, double costog, int cilindrata, double capienzabg){
        super(cod, targa, modello,marca, costog);
        setCapienzabg(capienzabg);
        setCilindrata(cilindrata);

    }
        


    public String toString() {

        return "Auto\t"+ super.toString() +"\t"+getCilindrata() +"\t" +getCapienzabg()+"\t-\t-\t-";
    }
}
