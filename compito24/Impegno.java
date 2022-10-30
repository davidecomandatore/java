package compito24;


public class Impegno {

    protected Progetti progetto;
    protected double ore;

    //SETTER
    public void setProgetto(Progetti progetto) {
        this.progetto = progetto;
    }
    public void setOre(double ore) {
        this.ore = ore;
    }

    //GETTER
    public Progetti getProgetto() {
        return progetto;
    }
    public double getOre() {
        return ore;
    }

    public Impegno(Progetti p, double ore){
        setProgetto(p);
        setOre(ore);
    }


    public String toString() {

        return  "( " + progetto.getCodice() + "," + getOre()+" )";
    }
    
}
