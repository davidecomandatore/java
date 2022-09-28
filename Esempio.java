import java.util.Scanner;

public class Esempio {
    public static void main(String args[])
    {   
        int n;
        int numero;
        Scanner tastiera = new Scanner(System.in);
        Counter c1;

   
        System.out.println("digitare un numero INTERO sul quale lavorare");
        numero = tastiera.nextInt();
        c1 = new Counter();
        c1.reset();
        c1.inc(numero);

        n = c1.getValue();
        System.out.print("numero digitato :");
        System.out.println(n);
        System.out.println("viene decrementato di 2 ... ");
        c1.dec(2);
        System.out.println(c1.getValue());
    }
}
