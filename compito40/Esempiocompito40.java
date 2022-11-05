package compito40;

import java.util.*;
import java.io.*;

public class Esempiocompito40 {
    static List<Veicolo> veicoli   = new LinkedList<Veicolo>();
    static List<Clienti> clienti   = new LinkedList<Clienti>();
    static Map<Integer,Veicolo> codveicolo= new HashMap<Integer,Veicolo>();
    static Map<Integer,Double> codTot = new HashMap<Integer,Double>();
    

    public static void main(String[] args) {
        
        //lettura veicoli
        try    
        {
            BufferedReader br = new BufferedReader(new FileReader("compito40/veicoli.txt"));
            String line=br.readLine();
            while (line!= null){
                StringTokenizer tok = new StringTokenizer(line);
                int cod=Integer.parseInt(tok.nextToken());
                String tipo=tok.nextToken();
                String targa=tok.nextToken();
                line                = br.readLine();
                String modello = line;
                line                = br.readLine();
                String marca = line;
                line= br.readLine();
                
                
                    if (tipo.equals("auto")) {
                        tok = new StringTokenizer(line);
                        int cilindrata = Integer.parseInt(tok.nextToken());
                        int bg = Integer.parseInt(tok.nextToken());
                        line= br.readLine();
                        double costog = Double.parseDouble(line);
                        Auto a = new Auto(cod,targa,modello,marca,costog,cilindrata,bg);
                        veicoli.add(a);
                        codTot.put(cod,0.0);
                        codveicolo.put(cod,a);

                    } else {
                        String categoria = line;
                        line= br.readLine();
                        tok = new StringTokenizer(line);
                        int posti =Integer.parseInt(tok.nextToken());
                        Boolean vano= Boolean.parseBoolean(tok.nextToken());
                        line= br.readLine();
                        double costog = Double.parseDouble(line);

                        Furgone f = new Furgone(cod,targa,modello,marca,costog,categoria,posti,vano);
                        veicoli.add(f);
                        codTot.put(cod,0.0);
                        codveicolo.put(cod,f);
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
            BufferedReader br = new BufferedReader(new FileReader("compito40/clienti.txt"));
            String line=br.readLine();
            while (line!= null){
                String nomecognome=line;
               
                Clienti c=new Clienti(nomecognome);
                clienti.add(c);
                line = br.readLine();
                StringTokenizer tok2 = new StringTokenizer(line);
                while (tok2.hasMoreElements()){
                    int cod       = Integer.parseInt(tok2.nextToken());
                    int giorni    = Integer.parseInt(tok2.nextToken());
                    c.addNoleggio(codveicolo.get(cod),giorni);
                    double current = codTot.get(cod);
                    codTot.put(cod,current+giorni*codveicolo.get(cod).getCostog());
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
        System.out.println("tipo\ttarga\tcodice\tmodello\tmarca\t costo giornaliero\t cilindrata\t bagagliaio\tcategoria\t numero di posti\t vano di carico");
        for (Veicolo v : veicoli)
            System.out.println(v);
        System.out.println();
        //PUNTO 4: stampa clienti
        for (Clienti c : clienti)
            System.out.println(c);

        //PUNTO 5: stampe del totale dei noleggi
        System.out.println();
        int cod    = Integer.parseInt(args[0]);
        double tot = codTot.get(cod);
        System.out.println(cod+" "+tot);

 


    }


    
}
