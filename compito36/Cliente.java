package compito36;

import java.util.*;


public class Cliente {

    private String nome;
    private String cognome;
    List<Visita> visite ;
    
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

    public Cliente(String nome, String cognome){
        setCognome(cognome);
        setNome(nome);
        this.visite =  new LinkedList<Visita>();
    }

    public void addVisita(Supermercato sup, double imp){
        visite.add(new Visita(sup,imp));
    }

    public double totImp(){
        double tot = 0;
        for (Visita v : visite){
            tot += v.getImporto();
        }
        return tot;
    }



    public String toString() {

        return getNome() +  "\t"+getCognome()+"\t" +totImp();
    }
}
