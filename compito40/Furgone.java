package compito40;

public class Furgone extends Veicolo {

    private String categoria;
    private int posti;
    private boolean vanoca;

    //setter
    public void setPosti(int posti) {
        this.posti = posti;
    }
    public void setVanoca(boolean vanoca) {
        this.vanoca = vanoca;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    //getter
    public String getCategoria() {
        return categoria;
    }
    public int getPosti() {
        return posti;
    }
    public boolean getVanoca(){
        return vanoca;
    }
    

    public Furgone(int cod, String targa, String modello,String marca, double costog, String categoria, int posti, boolean vanoca){
        super(cod, targa, modello,marca, costog);
        setCategoria(categoria);
        setPosti(posti);
        setVanoca(vanoca);

    }


  
    public String toString() {
        return "Commerciale\t"+ super.toString() +"\t-\t-\t"+getCategoria()+"\t" + getPosti()+"\t"+getVanoca()+"\t";
    }
    
}
