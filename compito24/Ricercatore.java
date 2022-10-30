package compito24;

import java.io.*;
import java.util.*;

public class Ricercatore {
    private String nome;
    private String cognome;
	private List<Impegno> progetti;

    //setter
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }
    public String getNome() {
        return nome;
    }

    public Ricercatore(String nome, String cognome){
        setCognome(cognome);
        setNome(nome);
        this.progetti= new LinkedList<Impegno>();
    }

    public void addProgetto(Progetti p, double ore)
    {
        progetti.add(new Impegno(p, ore));
    }

    //MAX
    public Impegno getMax()
    {
        double max=0;
        Impegno maxi=null;
        for (Impegno i:progetti)
            if (i.getOre()>max)
            {
                max=i.getOre();
                maxi=i;
            }
        return maxi;
    }

    public double getTot() {
	    double tot=0;
	    for (Impegno i : progetti)
		    tot=tot+i.getOre();
	    return tot;

    }
    public int getNum(){
        return progetti.size();
    }

    public String toString()
    {
        return nome+" "+cognome+" "+getTot()+" "+getNum()+" "+progetti.toString();
    }


}
