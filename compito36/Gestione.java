package compito36;

import java.util.*;
import java.io.*;

public class Gestione {

    static List<Supermercato> supermercati = new LinkedList<Supermercato>();
    static List<Cliente> clienti = new LinkedList<Cliente>();
    static HashMap<Integer, Supermercato> mapsuper = new HashMap<Integer, Supermercato>();
    static HashMap<Supermercato,Integer> mapvisitetot = new HashMap<Supermercato,Integer>();
    static HashMap<Supermercato,Double> mapspesatot  = new HashMap<Supermercato,Double>();

    public static void main(String[] args) {


         //lettura supermercati
        try    
        {
            BufferedReader br = new BufferedReader(new FileReader("compito36/supermercati.txt"));
            String line=br.readLine();
            while (line!= null){
                StringTokenizer tok = new StringTokenizer(line);
                int cod=Integer.parseInt(tok.nextToken());
                String tipo=tok.nextToken();
                line                = br.readLine();
                String indirizzo = line;
                line= br.readLine();

                if (tipo.equals("cittadino")) {

                    StringTokenizer tok2 = new StringTokenizer(line);
                    int apertura = Integer.parseInt(tok2.nextToken());
                    int chiusura = Integer.parseInt(tok2.nextToken());
                    double superf= Double.parseDouble(tok2.nextToken());
                    int addetti  = Integer.parseInt(tok2.nextToken());

                    Cittadino c = new Cittadino(cod,indirizzo,apertura,chiusura,addetti,superf);
                    supermercati.add(c);
                    mapsuper.put(cod,c);
                    mapvisitetot.put(c,0);
                    mapspesatot.put(c, 0.0);
 

                } else {

                    StringTokenizer tok2 = new StringTokenizer(line);
                    double superf= Double.parseDouble(tok2.nextToken());
                    int addetti  = Integer.parseInt(tok2.nextToken());
                    line= br.readLine();
                    String nome = line;


                    Iper i = new Iper(cod,indirizzo,nome,addetti,superf);
                    supermercati.add(i);
                    mapsuper.put(cod,i);
                    mapvisitetot.put(i,0);
                    mapspesatot.put(i, 0.0);
                }
                line = br.readLine();
            }
        br.close();
    
    } catch (IOException e) {
        System.err.println(e);
    }
    catch (Exception e) {
        System.err.println(e);
    }


    //lettura clienti
    try    
    {
        BufferedReader br = new BufferedReader(new FileReader("compito36/clienti.txt"));
        String line=br.readLine();
        while (line!= null){
            String cognome=line;
            line= br.readLine();
            String nome   =line;

            
            
            Cliente c=new Cliente(nome,cognome);
            clienti.add(c);
            line=br.readLine();
            
            while (line!= null && !line.equals("")){
                StringTokenizer tok2 = new StringTokenizer(line);
                int cod           = Integer.parseInt(tok2.nextToken());
                double importo    = Double.parseDouble(tok2.nextToken());
                c.addVisita(mapsuper.get(cod),importo);
                int visite  = mapvisitetot.get(mapsuper.get(cod));
                
                
                mapvisitetot.put(mapsuper.get(cod), visite+1);
                double spesatot = mapspesatot.get(mapsuper.get(cod));
                mapspesatot.put(mapsuper.get(cod),spesatot+importo);
                line=br.readLine();
            }
            line=br.readLine();

        }
        br.close();


    } catch (IOException e) {
        System.err.println(e);
    }
    catch (Exception e) {
        System.err.println(e);
    }

      //PUNTO 3: stampa di tutti i veicoli
      System.out.println("Codice\tTIPO\tINDIRIZZO \t APERTURA \t CHIUSURA \t SUPERFICE \t ADDETTI \t CENTRO COMMERCIALE ");
      for (Supermercato s : supermercati)
          System.out.println(s);
      System.out.println();
      //PUNTO 4: stampa clienti
      for (Cliente c : clienti)
          System.out.println(c);
    //PUNTO 5: stampe del totale dei noleggi
    System.out.println();
    int cod    = Integer.parseInt(args[0]);
    double tot = mapspesatot.get(mapsuper.get(cod))/mapvisitetot.get(mapsuper.get(cod));
    System.out.println(cod+" "+tot);






        
    



    }







    
}
