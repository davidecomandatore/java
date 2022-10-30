package compito24;

import java.util.*;
import java.io.*;



public class Esempiocompito24 {

    static List<Progetti> progetti   = new LinkedList<Progetti>();
    static List<Ricercatore> ricercatori   = new LinkedList<Ricercatore>();
    static Map<Integer,Progetti> codProg = new HashMap<Integer,Progetti>();

    public static void main(String[] args) {
        
        //lettura progetti
        try    
        {
            BufferedReader br = new BufferedReader(new FileReader("compito24/progetti.txt"));
            String line=br.readLine();
            while (line!= null){
                StringTokenizer tok = new StringTokenizer(line);
                int cod=Integer.parseInt(tok.nextToken());
                String tipo=tok.nextToken();
                line                = br.readLine();
                String titolo = line;
                line                = br.readLine();
                String coord = line;
                line= br.readLine();
                String org=line;
                line= br.readLine();
                    if (tipo.equals("ricerca")) {
                        tok = new StringTokenizer(line);
                        String arg=tok.nextToken();
                        int partner=Integer.parseInt(tok.nextToken());
                        line= br.readLine();
                        double tot=Double.parseDouble(line);
                        Ricerca t=new Ricerca(cod,coord,org,titolo,arg,partner,tot);
                        progetti.add(t);
                        codProg.put(cod,t);
                    } else {
                        tok = new StringTokenizer(line);
                        int aziende=Integer.parseInt(tok.nextToken());
                        double tot=Double.parseDouble(tok.nextToken());
                        Innovazione i=new Innovazione(cod,coord,org,titolo,aziende,tot);
                        progetti.add(i);
                        codProg.put(cod,i);
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



    //lettura Ricercatori
    try    
    {
        BufferedReader br = new BufferedReader(new FileReader("compito24/ricercatori.txt"));
        String line=br.readLine();
        while (line!= null){
            String nome=line;
            line=br.readLine();
            String cognome=line;
            Ricercatore r=new Ricercatore(nome,cognome);
            ricercatori.add(r);
            line = br.readLine();
            while (line!= null && !line.equals("")){
                StringTokenizer tok2 = new StringTokenizer(line);
                int cod=Integer.parseInt(tok2.nextToken());
                double imp=Double.parseDouble(tok2.nextToken());
                r.addProgetto(codProg.get(cod), imp);
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







    //stampa progetti
    System.out.println("tipo\ttitolo\tcodice\tcoordinatore\torganizzazione\targomento\tpartner\taziende\timporto totale in migliaia di euro");

    for (Progetti p : progetti)
        System.out.println(p);
    System.out.println();

  

    System.out.println();
    //PUNTO 4: stampa ricercatori
    for (Ricercatore r : ricercatori)
      System.out.println(r);


     //PUNTO 5: stampe dell'esame con voto piu' alto
     System.out.println();
     String cog=args[0];
     for (Ricercatore r : ricercatori)
     {
         if (r.getCognome().equals(cog))
         {
             Impegno i=r.getMax();
             System.out.println(r.getNome()+" "+r.getCognome()+" "+i.getOre()+" "+i.getProgetto().getTitolo());

         }
     }
    

  }
    
}
