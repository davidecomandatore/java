package sistemaMedico;


public class Patologia {

    private String nome;
    private int gravita;

    //SETTER

    public void setGravita(int gravita) {
        this.gravita = gravita;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //GETTER
    public int getGravita() {
        return gravita;
    }
    public String getNome() {
        return nome;
    }


    //COSTRUTTORE
    public Patologia(String n, int g){
       setGravita(g);
       setNome(n); 
    }

    void aggrava() throws MoltograveExeption {
        
        if (getGravita() == 10) {
            MoltograveExeption me;
            me = new MoltograveExeption("patologia ha  10 di gravita");
            throw me;
        }
        setGravita(gravita++);
       
    }

    void attenua() throws GuaritaException{
        if (getGravita() == 1){
            GuaritaException ge;
            ge = new GuaritaException("la patologia è scomparsa");
            throw ge;
        }
    }
    
   
    public String toString() {
       
        return "patologia: " + getNome() + " con gravita:" + getGravita();
    }
    
    public boolean equals(Patologia pat){
        return getNome().equalsIgnoreCase(nome);

    }

}
