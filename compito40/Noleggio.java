package compito40;

public class Noleggio {

    protected Veicolo veicolo;
    protected int giorni;

    //setter
    public void setGiorni(int giorni) {
        this.giorni = giorni;
    }
    public void setVeicolo(Veicolo veicolo) {
        this.veicolo = veicolo;
    }

    //getter

    public int getGiorni() {
        return giorni;
    }
    public Veicolo getVeicolo() {
        return veicolo;
    }

    public Noleggio(Veicolo v, int giorni){
        setGiorni(giorni);
        setVeicolo(v);
    }

    public String toString() {

        return  "( " + veicolo.getTarga() + "," + getGiorni()+" )";
    }
    
}
