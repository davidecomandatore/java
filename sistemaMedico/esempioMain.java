package sistemaMedico;

public class esempioMain {
    
    public static void main(String[] args) {

        Patologia pat1 = new Patologia("asma", 10);
        Patologia pat2 = new Patologia("Allergia alle graminacee", 2);
        Paziente p0 = new Paziente("Rossi");
        

            p0.aggiungiPatologia(pat1);
            p0.aggiungiPatologia(pat2);

            System.out.println(p0);
        try 
        {            
            p0.getPatologie().get(0).aggrava();
            p0.getPatologie().get(1).attenua();
            p0.getPatologie().get(1).attenua();
            p0.getPatologie().get(1).attenua();

        } 
        catch (MoltograveExeption moltograveExeption)
        {
            System.out.println(moltograveExeption);
        }
        catch (GuaritaException guaritaException)
        {
            System.out.println(guaritaException);
        }

        System.out.println(p0);
    }
}
