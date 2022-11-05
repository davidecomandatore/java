package compito40;
import java.util.*;

public class Clienti {

    private String nomecognome;
    private List<Noleggio> noleggi = new LinkedList<Noleggio>();

    //setter

    public void setNomecognome(String nomecognome) {
        this.nomecognome = nomecognome;
    }
    public String getNomecognome() {
        return nomecognome;
    }

    public Clienti(String nomecognome){
        setNomecognome(nomecognome);
        this.noleggi= new LinkedList<Noleggio>();
    }

    public void addNoleggio(Veicolo v, int giorni){
        noleggi.add(new Noleggio(v, giorni));
    }



    public double getTot() {
	    double tot=0;
	    for (Noleggio i : noleggi)
		    tot+= i.getGiorni() * i.veicolo.getCostog();
	    return tot;

    }

    public String toString()
    {
        return getNomecognome() + "\t" +getTot()+ "\t" + noleggi.toString();
    }


    
}
