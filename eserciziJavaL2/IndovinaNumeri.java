/**- Si scriva un algoritmo per un semplice gioco che chieda di indovinare un codice numerico di cinque cifre. Quando l'utente scrive la risposta, il programma restituisce due valori: il numero di cifre al posto giusto e la somma di queste cifre. Per esempio, se il codice segreto è 53840 e l'utente ipotizza 83241, le cifre 3 e 4 sono al posto giusto. Il programma perciò restituirebbe in output i numeri 2 (cifre corrette) e 7 (somma). Si permetta all'utente di provare per un numero prefissato di volte (per esempio 10 volte).
(per il confronto utilizzare in un ciclo substring oppure charAt)

- Chiedere in input 10 numeri e stampare se i numeri sono ordinati crescentemente o decrescentemente. */
import java.util.Scanner;
public class IndovinaNumeri{
    public static void main(String[] args){
        
        Scanner tastiera = new Scanner(System.in);
        int numCasuale = (int) (Math.random()*100000);
        System.out.println(numCasuale);
        
        // Random random = new Random();
        // int numUtente = random.nextInt();
        // System.out.print(numUtente);

        System.out.println("Scrivi un numero di 5 cifre");
        int numUtente = tastiera.nextInt();
        System.out.println(numUtente);

        String numeroS = String.parseString(numCasuale);
        System.out.println(numeroS);

    }
}