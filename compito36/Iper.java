package compito36;

public class Iper extends Supermercato {

    private String nome;

    //setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    //getter

    public String getNome() {
        return nome;
    }

    public Iper(int codice, String indirizzo,String nome, int adde, double superf){
        super(codice,indirizzo,superf,adde);
        setNome(nome); 

    }

    public String toString() {

        return getCodice() +"\t Iper \t"+super.toString()+"\t - \t "+getSuperf()+"\t"+getAddetti()+"\t" +getNome();
    }

    
}
