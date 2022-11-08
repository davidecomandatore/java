package compito36;



public class Visita {

    private Supermercato sup;
    private double importo;
    
    public void setImporto(double importo) {
        this.importo = importo;
    }
    public void setSup(Supermercato sup) {
        this.sup = sup;
    }


    //getter

    public double getImporto() {
        return importo;
    }
    public Supermercato getSup() {
        return sup;
    }

    public Visita(Supermercato sup, double imp){
        setImporto(imp);
        setSup(sup);
    }

     

    
}
