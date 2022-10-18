package sistemaMedico;

import java.util.ArrayList;

public class Paziente {

    private String cognome;
    private ArrayList<Patologia> patologie = new ArrayList<Patologia>();
    

    //getter
    public String getCognoome() {
        return cognome;
    }
    public ArrayList<Patologia> getPatologie() {
        return patologie;
    }

    //setter
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Paziente(String n){
        setCognome(n);
    }
    
    public void  aggiungiPatologia(Patologia pat){
        if (!patologie.contains(pat)){
            patologie.add(pat);
        }
    }

    public boolean rimuoviPatologia(Patologia pat){
        if(patologie.contains(pat)) {
            return patologie.remove(pat);
        } 
        else {
            return false;
        }
    }

    
    public String toString() {
        System.out.println("paziente " + cognome + "con patalogie :");
        return patologie.toString();
    }
}
